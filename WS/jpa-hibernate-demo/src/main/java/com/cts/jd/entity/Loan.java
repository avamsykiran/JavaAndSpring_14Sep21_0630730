package com.cts.jd.entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
/*
 * @Table(name="jpaAllLoans")
 * 
 * @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
 * 
 * @DiscriminatorColumn(name = "loanType",discriminatorType =
 * DiscriminatorType.STRING)
 * 
 * @DiscriminatorValue("general")
 */

/*@Table(name="jpaLoans")
@Inheritance(strategy = InheritanceType.JOINED)*/

@Table(name="jpaLoansOnly")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Loan {

	@Id
	@GeneratedValue
	private Long loanId;
	
	private Double principal;
	private Double roi;
	
	public Loan() {}

	public Loan(Long loanId, Double principal, Double roi) {
		super();
		this.loanId = loanId;
		this.principal = principal;
		this.roi = roi;
	}

	public Long getLoanId() {
		return loanId;
	}

	public void setLoanId(Long loanId) {
		this.loanId = loanId;
	}

	public Double getPrincipal() {
		return principal;
	}

	public void setPrincipal(Double principal) {
		this.principal = principal;
	}

	public Double getRoi() {
		return roi;
	}

	public void setRoi(Double roi) {
		this.roi = roi;
	}

	@Override
	public String toString() {
		return "Loan [loanId=" + loanId + ", principal=" + principal + ", roi=" + roi + "]";
	}
	
	
}
