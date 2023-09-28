package com.johnbosco.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.johnbosco.springboot.repository.DrugRepository;
import com.johnbosco.springboot.entity.Drug;

@SpringBootApplication
public class DrugListAppApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DrugListAppApplication.class, args);
	}

	@Autowired
	private DrugRepository drugRepository;
	
	
	@Override
	public void run(String[] args) throws Exception{
		this.drugRepository.save(new Drug("Vitamin C", "Juhel", 1));
		this.drugRepository.save(new Drug("Panadol", "OMG", 1));
		this.drugRepository.save(new Drug("Flagyl", "OMG", 0));
		this.drugRepository.save(new Drug("Sudrex", "OMG", 0));
	}
	
}
