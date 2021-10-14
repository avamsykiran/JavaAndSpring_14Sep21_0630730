package com.cts.jd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jpaDepts")
public class Department {

	@Id
	@GeneratedValue
	@Column(name="did")
	private Long deptId;
	
	@Column(name="dnm",nullable = false,unique = true)
	private String deptName;
	
	public Department() {
		
	}

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
}
