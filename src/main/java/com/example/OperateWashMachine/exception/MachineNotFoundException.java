package com.example.OperateWashMachine.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Machine Data Not Found") //404
public class MachineNotFoundException extends Exception {
	private static final long serialVersionUID = 100L;
	public MachineNotFoundException(int id){
		super("Machine Data Not Found for Id : "+id);
	}
}
