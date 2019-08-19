package com.example.demo.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Model {

	private String name;
	private int age;
	private boolean gender;
	private LocalDateTime dateTime;
	private Object data;
	
}
