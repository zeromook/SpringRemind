package com.javassem.domain;



public class SampleVO {

	
	private String name;
	private Integer age;
	private String message;
	
	public SampleVO(String name,Integer age,String message) {
		this.name = name;
		this.age = age;
		this.message = message;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
