package com.dharma.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dharma.models.Emp;

@Repository
public interface EmpRepo extends JpaRepository<Emp, Integer> {

	public List<Emp> findByDesignation(String desg);
	
	public List<Emp> findBySalaryGreaterThan(int salary);
	
	@Query("from Emp where designation=?1 order by age desc")
	public List<Emp> MyCustomQuery(String des);
}
