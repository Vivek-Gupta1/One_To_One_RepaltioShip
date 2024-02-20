package com.vivek.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Laptop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="l_id")
	private Integer id;
    @Column(name="l_name")
	private String name;
	private String about;

}
