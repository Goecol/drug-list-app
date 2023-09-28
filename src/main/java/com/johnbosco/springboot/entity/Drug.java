package com.johnbosco.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;



@Entity
@Table(name= "drugs")
public class Drug {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
    
    @Column (name= "drug_name")
    private String drugName;
    
    @Column (name= "brand_name")
    private String brandName;
    
    @Column (name = "date_created", columnDefinition ="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private java.sql.Timestamp dateCreated;
    
    @Column (name = "status")
    private int status;

	public Drug() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Drug(String drugName, String brandName, int status) {
		super();
		this.drugName = drugName;
		this.brandName = brandName;
		this.status = status;
		Date date = new Date();
		this.dateCreated = new Timestamp(date.getTime());
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDrugName() {
		return drugName;
	}

	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public java.sql.Timestamp getDateCreated() {
		return this.dateCreated;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
    
    
    
    
    
    
}

