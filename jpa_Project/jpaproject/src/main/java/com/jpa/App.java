package com.jpa;

//RESOURCES/META-INF SEMPRE FICA NO MAIN

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
        pessoa p1 = new pessoa(null, "gabriel", "gabriel@gmail.com");// CRIA UMA PESSOA NO BANCO
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo"); // BUSCA O PERSISTENCE COM ESSE NOME
        EntityManager em = emf.createEntityManager();
        //pessoa p = em.find(pessoa.class, 1);//busca uma pessoa no banco
        //System.out.println(p); 
        //em.getTransaction().begin();// começa a transação para o banco
        //em.persist(p1);// cadastra no banco
        //em.getTransaction().commit();// commita o que foi adicionado

        
        pessoa p = em.find(pessoa.class, 1);
        em.getTransaction().begin();// SEMPRE COMECE O GET TRANSACTION ONDE N SEJA UMA SIMPLES CONSULTA
        em.remove(p);
        em.getTransaction().commit();//// SEMPRE COMECE O GET TRANSACTION ONDE N SEJA UMA SIMPLES CONSULTA
        System.out.println("DADOS CADASTRADOS");
        em.close();
        emf.close();
    }
}
