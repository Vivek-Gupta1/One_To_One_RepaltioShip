package com.vivek.Entity;

import org.hibernate.annotations.Generated;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Stuent_Table")
@Data
public class Student {
   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="s_id")
	private Integer id;
	@Column(name="s_name")
	private String name;
	
	private  String stream;
	
	@OneToOne
	private Laptop laptop;
}
