package com.cts.jd.ui;

import java.time.LocalDate;
import java.util.TreeSet;

import javax.persistence.EntityManager;

import com.cts.jd.entity.Address;
import com.cts.jd.entity.BankAccount;
import com.cts.jd.entity.Employee;
import com.cts.jd.entity.Skill;
import com.cts.jd.util.JpaUtil;

public class App2 {

	public static void main(String[] args) {
			
		
		Employee e1 = new Employee(null, "Vamsy", 45000.0,LocalDate.now(), 
				new Address("1-12/1", "DWK"), new BankAccount(1234L, "SBI001001", null),
				new TreeSet<>());
		e1.getSalAccount().setHolder(e1);
		
		Employee e2 = new Employee(null, "Suseela", 75000.0,LocalDate.now(), 
				new Address("1-1/1", "DWK"), new BankAccount(1232L, "SBI001001", null),
				new TreeSet<>());
		e2.getSalAccount().setHolder(e2);
		
		e1.getSkills().add(new Skill(null, "Java FSD", e1));
		e1.getSkills().add(new Skill(null, "Unit testing Spring", e1));
		e1.getSkills().add(new Skill(null, "Angular 11", e1));
		
		e2.getSkills().add(new Skill(null, "Python", e2));
		e2.getSkills().add(new Skill(null, "Python Unit Testing", e2));
		e2.getSkills().add(new Skill(null, "ReactJS", e2));
				
		EntityManager em = JpaUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(e1);
		em.persist(e2);
		em.getTransaction().commit();
		em.close();
	
		System.out.println("App Termianted");
	}

}
