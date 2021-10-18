package com.cts.jd.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="jpaSkills")
public class Skill implements Comparable<Skill>{

	@Id
	@GeneratedValue
	private Long skillId;
	private String title;
	
	@ManyToOne
	@JoinColumn
	private Employee employee;
	
	public Skill() {
		
	}

	public Skill(Long skillId, String title, Employee employee) {
		super();
		this.skillId = skillId;
		this.title = title;
		this.employee = employee;
	}

	public Long getSkillId() {
		return skillId;
	}

	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Skill [skillId=" + skillId + ", title=" + title + "]";
	}

	@Override
	public int compareTo(Skill o) {
		return this.title.compareTo(o.title);
	}
	
}
