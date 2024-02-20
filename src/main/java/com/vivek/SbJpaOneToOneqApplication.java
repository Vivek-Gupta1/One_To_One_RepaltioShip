package com.vivek;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.vivek.Entity.Laptop;
import com.vivek.Entity.Student;
import com.vivek.Repo.LaptopRepo;
import com.vivek.Repo.StudentRepo;


@SpringBootApplication
public class SbJpaOneToOneqApplication implements CommandLineRunner{
	@Autowired
	private LaptopRepo laptop;
	
	
	@Autowired
	private StudentRepo student;
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SbJpaOneToOneqApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
//		Laptop lap=new Laptop();
//		lap.setName("Mac");
//		lap.setAbout("32gb Ram And i5 Pro");
//		
//		Student std   = new Student();
//		std.setName("Vivek");
//		std.setStream("MCA");
//		std.setLaptop(lap);
//		
//		
//		laptop.save(lap);
//		student.save(std);
		
//		UniDirectional
//	Student st = student.findById(1).get();
//  System.out.println(st.getName()+" "+st.getStream()+" "+st.getLaptop().getName());
   
		
	}
	}


