package com.example.OperateWashMachine.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.OperateWashMachine.model.WashMachine;

@Repository
public interface WashMachineRepository extends CrudRepository<WashMachine,Integer>{
	
	
	
}
