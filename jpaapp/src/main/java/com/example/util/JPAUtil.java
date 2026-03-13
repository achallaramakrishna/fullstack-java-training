package com.example.util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {

	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-demo");

	public static EntityManagerFactory getFactory() {
		return emf;
	}

}
