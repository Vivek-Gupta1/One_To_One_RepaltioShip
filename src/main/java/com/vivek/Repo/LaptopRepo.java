package com.vivek.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vivek.Entity.Laptop;

public interface LaptopRepo extends JpaRepository<Laptop, Integer> {

}
