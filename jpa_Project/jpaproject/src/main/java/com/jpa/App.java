package com.jpa;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
        pessoa p1 = new pessoa(null, "gabriel", "gabriel@gmail.com");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo");
        EntityManager em = emf.createEntityManager();
        pessoa p = em.find(pessoa.class, 1);
        System.out.println(p);
        //em.getTransaction().begin();// começa a transação para o banco
        //em.persist(p1);// cadastra no banco
        //em.getTransaction().commit();// commita o que foi adicionado
    
        System.out.println("DADOS CADASTRADOS");
        em.close();
        emf.close();
    }
}
