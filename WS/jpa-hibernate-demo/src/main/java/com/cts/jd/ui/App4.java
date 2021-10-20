package com.cts.jd.ui;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.cts.jd.entity.Employee;
import com.cts.jd.util.JpaUtil;

public class App4 {

	public static void main(String[] args) {
			
		EntityManager em = JpaUtil.getEntityManager();
		
		Employee emp = em.find(Employee.class, 3L);
		System.out.println(emp);
		
		Query qry = em.createQuery("SELECT e FROM Employee e");
		qry.getResultList().stream().forEach(System.out::println);
		
		TypedQuery<Employee> qry2 = em.createQuery("SELECT e FROM Employee e", Employee.class);
		qry2.getResultList().stream().forEach(System.out::println);
		
		TypedQuery<Employee> qry3 = em.createQuery("SELECT e FROM Employee e WHERE e.salary>50000", Employee.class);
		qry3.getResultList().stream().forEach(System.out::println);
		
		
		em.close();
	
		System.out.println("App Termianted");
	}

}
