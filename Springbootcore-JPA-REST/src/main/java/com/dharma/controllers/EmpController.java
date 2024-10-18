package com.dharma.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dharma.models.Emp;
import com.dharma.repositories.EmpRepo;

@RestController
public class EmpController {

	@Autowired
	EmpRepo repo;
	
	@PostMapping("/employee")
	public String createEmployee(@RequestBody Emp e) {
		
		if(repo.existsById(e.getEid())) {
			return "Employee record already exist";
		}else {
			repo.save(e);
			return "Employee record added successfully";
		}
		
	}
	
	@GetMapping("/employees")
	public List<Emp> getEmployees(){
		
		return repo.findAll();
	}
	
	@GetMapping("/employee")
	public Optional<Emp> getEmployee(@RequestParam int id){
		
		return repo.findById(id);
	}
	
	@PutMapping("/employee")
	public String updateEmployee(@RequestBody Emp e) {
		
		if(!repo.existsById(e.getEid())) {
			return "No employees present with the Emp ID";
		}else {
			repo.save(e);
			return "Employee record updated successfully";
		}
		
	}
	
//	@RequestMapping(method={RequestMethod.PUT,RequestMethod.PATCH},path= "/employee")
//	public String updatePatchEmployee(@RequestBody Emp e) {
//		
//		if(!repo.existsById(e.getEid())) {
//			return "No employees present with the Emp ID";
//		}else {
//			repo.save(e);
//			return "Employee record updated successfully";
//		}
//		
//	}
	
	@DeleteMapping("/employee/{id}")
	public String DeleteEmployee(@PathVariable int id) {
		
		if(!repo.existsById(id)) {
			return "No employees present with the Emp ID";
		}else {
			repo.deleteById(id);
			return "Employee record deleted successfully";
		}
		
	}
	
	
	@GetMapping("/employee/role")
	public List<Emp> getByRole(@RequestParam String designation){
		
		return repo.findByDesignation(designation);
	}
	
	@GetMapping("/employee/salary")
	public List<Emp> getBySalary(@RequestParam int salary){
		
		return repo.findBySalaryGreaterThan(salary);
	}
	
	@GetMapping("/employee/custom")
	public List<Emp> getByCustom(@RequestParam 	String designation){
		
		return repo.MyCustomQuery(designation);
	}
	
	
}
