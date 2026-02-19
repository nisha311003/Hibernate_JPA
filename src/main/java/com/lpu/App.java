package com.lpu;

import com.lpu.entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.transaction.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Person person = new Person();
        person.setName("nisha");
        person.setAge(22);

        entityManager.persist(person);

        entityManager.getTransaction().commit();

        entityManager.close();
    }
}
