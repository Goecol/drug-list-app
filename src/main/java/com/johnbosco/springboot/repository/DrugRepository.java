package com.johnbosco.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.johnbosco.springboot.entity.Drug;

@Repository
public interface DrugRepository extends JpaRepository <Drug, Long>{

}
