package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        Pessoa p = em.find(Pessoa.class, 3);

        // Sempre que fizer uma operação que não seja uma consulta simples, devemos
        // começar uma transaction e fecha-la
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();

        System.out.println(p);

        em.close();
        emf.close();

        System.out.println("Finalizado");

    }
}
