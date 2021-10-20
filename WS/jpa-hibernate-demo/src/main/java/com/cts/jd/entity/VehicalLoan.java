package com.cts.jd.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//@DiscriminatorValue("vehical")
//@Table(name="jpaVLoans")
@Table(name="jpaVLoansOnly")
public class VehicalLoan extends Loan {

	private Double onRoadPrice;
	
	public VehicalLoan() {}

	public VehicalLoan(Long loanId, Double principal, Double roi,Double onRoadPrice) {
		super(loanId, principal, roi);
		this.onRoadPrice=onRoadPrice;
	}

	public Double getOnRoadPrice() {
		return onRoadPrice;
	}

	public void setOnRoadPrice(Double onRoadPrice) {
		this.onRoadPrice = onRoadPrice;
	}
	
	
	
}
