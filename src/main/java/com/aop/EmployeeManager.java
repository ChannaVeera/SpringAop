package com.aop;

import java.util.*;

import org.springframework.stereotype.Component;

@Component
public class EmployeeManager 
{
	
	public EmployeeManager(){
		
	}
    public EmployeeDTO getEmployeeById(Integer employeeId) {
      System.out.println("Method getEmployeeById() called");
    
    	
    	
    	
     
        return new EmployeeDTO(1,"sdfasdfasdf","asdfjgd");
    	
    }
 
    public List<EmployeeDTO> getAllEmployee() {
//        System.out.println("Method getAllEmployee() called");
    	List<EmployeeDTO> employeeDTOs = new ArrayList<>();
    	employeeDTOs.add( new EmployeeDTO(1,"sdfasdfasdf","asdfjgd"));
    	employeeDTOs.add( new EmployeeDTO(2,"slmgolads","adfjgd"));
    	employeeDTOs.add( new EmployeeDTO(3,"dsgfasga","asdffsad"));
        return new ArrayList<EmployeeDTO>();
    }
    public EmployeeDTO getEmployee( Integer i) {
    	List<EmployeeDTO> employeeDTOs = new ArrayList<>();
    	employeeDTOs.add( new EmployeeDTO(1,"sdfasdfasdf","asdfjgd"));
    	employeeDTOs.add( new EmployeeDTO(2,"slmgolads","adfjgd"));
    	employeeDTOs.add( new EmployeeDTO(3,"dsgfasga","asdffsad"));
    	Optional<EmployeeDTO> empDt= employeeDTOs.stream().filter(emp -> {
    		System.out.println(emp);
    		System.out.println(i);
    		System.err.println(emp.getId().equals(i));
    		return emp.getId().equals(i);}).findFirst();
    	if(!empDt.isPresent()) {
    		return null;	
    	}
    	
    	return empDt.get();
    	
    }
 
    public EmployeeDTO createEmployee(EmployeeDTO employee) {
//        System.out.println("Method createEmployee() called");
		return employee;
    }
 
    public void deleteEmployee(Integer employeeId) {
//        System.out.println("Method deleteEmployee() called");
    }
 
    public void updateEmployee(EmployeeDTO employee) {
//        System.out.println("Method updateEmployee() called");
    }
    
}