package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
        Pessoa p2 = new Pessoa(null, "Mariano da Silva", "mariano@gmail.com");
        Pessoa p3 = new Pessoa(null, "Tainara da Silva", "tainara@gmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        em.persist(p1);
        em.persist(p2);
        em.persist(p3);

        em.getTransaction().commit();
        em.close();
        emf.close();

        System.out.println("Finalizado");

    }
}
