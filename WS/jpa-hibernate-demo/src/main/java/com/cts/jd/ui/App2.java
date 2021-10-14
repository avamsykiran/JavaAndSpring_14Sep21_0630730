package com.cts.jd.ui;

import javax.persistence.EntityManager;

import com.cts.jd.util.JpaUtil;

public class App2 {

	public static void main(String[] args) {
			
		EntityManager em = JpaUtil.getEntityManager();
		em.close();
	
		System.out.println("App Termianted");
	}

}
