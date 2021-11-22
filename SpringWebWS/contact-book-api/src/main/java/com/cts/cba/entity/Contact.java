package com.cts.cba.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;


@Entity
@Table(name="contacts")
public class Contact implements Comparable<Contact> {

	@Id
	@Column(name="cid")
	@NotNull(message = "contact id is a mandate field")
	@Min(value=1,message = "contact id can not be zero or negative")
	private Long cid;
	
	@Column(name="fnm")
	@NotBlank(message = "Full Name is a mandate field")
	private String fullName;
	
	@Column(name="email")
	@Email(message = "Email must be a valid one")
	@NotBlank(message = "Email is a mandate field")
	private String email;
	
	@Column(name="mob")
	@NotBlank(message = "Mobile number is a mandate field")
	@Pattern(regexp = "[1-9][0-9]{9}",message="Mobile number is a 10 digit number")
	private String mobile;
	
	@Column(name="dob")
	@NotNull(message = "Birth Date is a mandate field")
	@Past(message="Birth date can not be a future or present date")
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate dateOfBirth;

	public Contact() {
	}

	public Contact(Long cid, String fullName, String email, String mobile, LocalDate dateOfBirth) {
		super();
		this.cid = cid;
		this.fullName = fullName;
		this.email = email;
		this.mobile = mobile;
		this.dateOfBirth = dateOfBirth;
	}

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cid == null) ? 0 : cid.hashCode());
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
		result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		if (cid == null) {
			if (other.cid != null)
				return false;
		} else if (!cid.equals(other.cid))
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (fullName == null) {
			if (other.fullName != null)
				return false;
		} else if (!fullName.equals(other.fullName))
			return false;
		if (mobile == null) {
			if (other.mobile != null)
				return false;
		} else if (!mobile.equals(other.mobile))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Contact [cid=" + cid + ", fullName=" + fullName + ", email=" + email + ", mobile=" + mobile
				+ ", dateOfBirth=" + dateOfBirth + "]";
	}

	@Override
	public int compareTo(Contact o) {
		return this.cid.compareTo(o.cid);
	}

}