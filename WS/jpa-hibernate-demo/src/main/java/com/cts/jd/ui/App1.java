package com.cts.jd.ui;

import java.util.Scanner;

import javax.persistence.EntityManager;

import com.cts.jd.entity.Department;
import com.cts.jd.util.JpaUtil;

public class App1 {

	public static void main(String[] args) {
		
		Scanner kbin = new Scanner(System.in);
		
		Department d = new Department();

		System.out.println("Department Name: ");
		d.setDeptName(kbin.next());
		
		EntityManager em = JpaUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(d);
		em.getTransaction().commit();
		System.out.println("Department Saved");
		em.close();
		kbin.close();
	}

}
