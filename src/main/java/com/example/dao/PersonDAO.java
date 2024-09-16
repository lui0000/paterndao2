package com.example.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.models.Person;

import jakarta.persistence.EntityManager;

@Component
public class PersonDAO {

    private final EntityManager entityManager;

    
    @Autowired
    public PersonDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }



    @Transactional(readOnly = true)
    public void testNPlusOne() {
        Session session = entityManager.unwrap(Session.class);
        
    //     // 1 request

    //     List<Person> people = session.createQuery("SELECT p from Person p", Person.class).getResultList();

    //     // N requests

    //     for (Person person: people) 
    //         System.out.println("Person " + person.getName() + " has" + person.getItems());

    // solution
        List<Person> people = session.createQuery("select p from Person p LEFT JOIN FETCH p.items", Person.class).getResultList();

        for (Person person: people) {
            System.out.println("Person " + person.getName() + " has: " + person.getItems().size() + " items");
        }
        
    }
    
}
