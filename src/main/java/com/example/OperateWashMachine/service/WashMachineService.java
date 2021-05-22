package com.example.OperateWashMachine.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OperateWashMachine.exception.MachineNotFoundException;
import com.example.OperateWashMachine.model.WashMachine;
import com.example.OperateWashMachine.repository.WashMachineRepository;

@Service
public class WashMachineService {
	
	@Autowired
	private WashMachineRepository washMachineRepository;
	
	//to return complete data by ID
	public WashMachine getWashMachineById(int machineId) throws MachineNotFoundException {
		Optional<WashMachine> optional = Optional.of(washMachineRepository.findById(machineId)).get();
		WashMachine washMachine;
		if (optional.isPresent()){
			washMachine= optional.get();
		}
		else {
			throw new MachineNotFoundException(machineId);
		}
		return washMachine;
	}
	
	//to return complete data
	public List<WashMachine> getWashMachines() {
		List<WashMachine> machineList = new ArrayList<>();
		washMachineRepository.findAll().forEach(machine -> machineList.add(machine));  
		return machineList;
	}
	
	//To save the data
	public void saveWashMachine(WashMachine washMachine) {
		washMachineRepository.save(washMachine);
	}
}
