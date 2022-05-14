package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.dao.IItineraryRepository;

import com.faith.app.entity.Itinerary;

@Service
public  class ItineraryServiceImplementation implements IItineraryService {
	
	@Autowired
	 private IItineraryRepository employeeRepo;
	
	
	

	@Override
	public List<Itinerary> getItinerary() {
		
		return (List<Itinerary>) employeeRepo.findAll();
	}

	
/*	 //Insert or Update
	public void saveEmployee(Itinerary employee) {	
		employeeRepo.save(employee);

	}

	  //Get Employee By id
	@Override
	public  Optional<Itinerary> getEmployee(int  id) {
		return  employeeRepo.findById(id);
	}

	 //Delete Employee
	@Override
	public void deleteEmployee(int id) {
		    
		employeeRepo.deleteById(id);

	}


	@Override
	public List<Itinerary> getEmployeesByEmployeeName(String name) {
		
		return (List<Itinerary>)   employeeRepo.findByEmployeeName(name);
	}


	@Override
	public List<EmployeeDeptDTO> getAllDTOEmployees() {
		
		return (List<EmployeeDeptDTO>) employeeRepo.findAllDTOEmployees();
	}
*/
}
