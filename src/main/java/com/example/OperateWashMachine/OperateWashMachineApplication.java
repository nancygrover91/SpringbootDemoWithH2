package com.example.OperateWashMachine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.example.OperateWashMachine","com.example.OperateWashMachine.controller","com.example.OperateWashMachine.service",
"com.example.OperateWashMachine.repository","com.example.OperateWashMachine.model","com.example.OperateWashMachine.exception"})
public class OperateWashMachineApplication {

	public static void main(String[] args) {
		SpringApplication.run(OperateWashMachineApplication.class, args);
	}
}
