package com.example.OperateWashMachine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.OperateWashMachine.exception.MachineNotFoundException;
import com.example.OperateWashMachine.model.WashMachine;
import com.example.OperateWashMachine.service.WashMachineService;

@RestController
public class WashMachineController {
	@Autowired
	private WashMachineService washMachineService;
	
	@GetMapping(path="/")
	public String getWashMachinesListTest(){
		return "Welcome !";
	}
	
	@GetMapping(path="/washMachines")
	public List<WashMachine> getWashMachinesList(){
		return washMachineService.getWashMachines();
		
	}
	
	@GetMapping(path="/washMachine/{id}")
	public ResponseEntity<Object> getWashMachineById(@PathVariable("id") int machineId){
		WashMachine washMachine;
		try {
			washMachine = washMachineService.getWashMachineById(machineId);
		} catch (MachineNotFoundException e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(washMachine,HttpStatus.OK);
	}
	
	
	/* for saving the data in database use body in format
	 {
		"machineId":"2",
		"machineBrand":"Whilrpool",
		"machineVersion":"1.00",
		"machineType":"Automatic",
		"price" : 10000
	}*/
	@PostMapping(path="/saveWashMachine")
	public ResponseEntity<Object> getWashMachineById(@RequestBody WashMachine washMachine){
		 washMachineService.saveWashMachine(washMachine);
		return new ResponseEntity<>("Record Inserted Successfully",HttpStatus.OK);
	}

}
