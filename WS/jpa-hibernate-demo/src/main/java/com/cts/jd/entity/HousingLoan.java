package com.cts.jd.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//@DiscriminatorValue("housing")
//@Table(name="jpaHLoans")
@Table(name="jpaHLoansOnly")
public class HousingLoan extends Loan {
	
	private Double houseArea;
	
	public HousingLoan() {}

	public HousingLoan(Long loanId, Double principal, Double roi,Double houseArea) {
		super(loanId, principal, roi);
		this.houseArea=houseArea;
	}

	public Double getHouseArea() {
		return houseArea;
	}

	public void setHouseArea(Double houseArea) {
		this.houseArea = houseArea;
	}

	@Override
	public String toString() {
		return "HousingLoan [houseArea=" + houseArea + "]";
	}
	
	
	
}
