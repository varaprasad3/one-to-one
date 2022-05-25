package com.ty.one_to_one_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonController {
	public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();
    
    Person person = new Person();
    person.setName("varaprasad");
    person.setEmail("vp@gmail.com");
    
    Pan pan = new Pan();
    pan.setName("varaparasad");
    pan.setAddress("dkd2kffda= nagar");
    pan.setPerson(person);
    person.setPan(pan);
    
    entityTransaction.begin();
    entityManager.persist(person);
    entityManager.persist(pan);
    entityTransaction.commit();
    System.out.println("done ");
	}
}
