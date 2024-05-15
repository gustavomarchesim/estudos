package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;
import db.DbException;

/**
 * This is the main class of the application.
 * It demonstrates the usage of JDBC to interact with a database.
 *
 * @author YourName
 * @version 1.0
 */
public class App {

    /**
     * The main method of the application.
     *
     * @param args Command line arguments (not used in this example)
     * @throws Exception If any error occurs during the execution
     */
    public static void main(String[] args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection conn = null;
        PreparedStatement ps = null;

        try {

            // Get a database connection
            conn = DB.getConnection();

            // Prepare an SQL statement with placeholders for future values
            ps = conn.prepareStatement(
                    "INSERT INTO seller "
                            + "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
                            + "VALUES "
                            + "(?,?,?,?,?)", // placeholders
                    Statement.RETURN_GENERATED_KEYS);

            // Set the values for the placeholders
            ps.setString(1, "Carl Purple");
            ps.setString(2, "carl@gmail.com");
            ps.setDate(3, new java.sql.Date(sdf.parse("22/04/1987").getTime()));
            ps.setDouble(4, 3000.00);
            ps.setInt(5, 4);

            // Prepare an SQL statement to insert multiple rows into the department table
            ps = conn.prepareStatement(
                    "INSERT INTO department (Name) values ('D1'),('D2')",
                    Statement.RETURN_GENERATED_KEYS);

            // Execute the SQL statement and get the number of rows affected
            int rowsAffected = ps.executeUpdate();

            // Check if any rows were affected
            if (rowsAffected > 0) {
                // Get the generated keys (if any)
                ResultSet rs = ps.getGeneratedKeys();
                while (rs.next()) {
                    // Process the generated keys
                    int id = rs.getInt(1);
                    System.out.println("Done! ID = " + id);
                }
            } else {
                // No rows affected
                System.out.println("No rows affected!");
            }

        } catch (SQLException e) {
            // Handle SQL exceptions
            throw new DbException(e.getMessage());
        } catch (ParseException e) {
            // Handle parsing exceptions
            e.printStackTrace();
        } finally {
            // Close the prepared statement and the database connection
            DB.closeStatement(ps);
            DB.closeConnection();
        }

    }
}