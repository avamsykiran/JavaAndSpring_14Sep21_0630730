package com.cts.jd.ui;

import javax.persistence.EntityManager;

import com.cts.jd.entity.HousingLoan;
import com.cts.jd.entity.Loan;
import com.cts.jd.entity.VehicalLoan;
import com.cts.jd.util.JpaUtil;

public class App3 {

	public static void main(String[] args) {
			
		Loan loan = new Loan(null, 45000.0, 12.2);
		HousingLoan hloan = new HousingLoan(null, 5500000.0, 8.6, 1515.0);
		VehicalLoan vloan = new VehicalLoan(null, 1000000.0, 13.3, 1300000.0);
		
		EntityManager em = JpaUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(loan);
		em.persist(hloan);
		em.persist(vloan);
		em.getTransaction().commit();
		em.close();
	
		System.out.println("App Termianted");
	}

}
