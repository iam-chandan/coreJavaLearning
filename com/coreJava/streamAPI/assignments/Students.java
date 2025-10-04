package com.coreJava.streamAPI.assignments;

public class Students {
	private int id;
	private String name;
	private char grad;
	
	public Students(int id, String name, char grad) {
		super();
		this.id = id;
		this.name = name;
		this.grad = grad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGrad() {
		return grad;
	}

	public void setGrad(char grad) {
		this.grad = grad;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", grad=" + grad + "]";
	}
	
	
}
