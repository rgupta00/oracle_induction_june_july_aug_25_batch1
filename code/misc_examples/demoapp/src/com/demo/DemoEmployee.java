package com.demo;
//java: 
//public protected default private, package*

class Employee{
	//C++ vs java (default)
	 int id;
	 String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void print() {
		System.out.println(" id : "+ id +" name: "+ name);
	}
	
}
public class DemoEmployee {
	
	public static void main(String[] args) {
		
		Employee employee=new Employee(2, "raja");
		employee.id=55;
		
		employee.print();
	}

}
