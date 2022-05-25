package com.ty.one_to_one_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CompanyController {

	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Company company = new Company();
		company.setName("TY");
		company.setWebsite("www.tyryui.com");
		
		Gst gst = new Gst();
		gst.setGstNumber("RTYUB456UY");
		gst.setState("karnataka");
		gst.setCompany(company);
		company.setGst(gst);
		
		entityTransaction.begin();
		entityManager.persist(company);
		entityManager.persist(gst);
		entityTransaction.commit();
		
	}
}
