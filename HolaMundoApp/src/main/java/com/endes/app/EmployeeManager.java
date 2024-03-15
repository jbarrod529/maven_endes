package com.endes.app;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager{
	
	/**
	 * @param employeeList List of Employees assigned to the manager
	 * @param EmployeeManager number of employees assigned to the manager
	 * @version 1.1
	 * @author Joaquin Barrero
	 **/
 
	 private List<Employee> employeeList =new ArrayList<Employee>();
 
	 private int numberOfEmployees=0;
	 
	 public EmployeeManager() {}
 
	 /**
	  * @param e Employee for add to the List
	  * @version 1.1
	  * @author Joaquin Barrero
	  * */
	 public void addEmployee(Employee e){
 
		 employeeList.add(e);
 
		 numberOfEmployees++;
		 System.out.println(e.getName()+" Added to system");
	 }

	 /**
	 * @return nothing, print in console the list of employees
	 * @version 1.1
	 * @author Joaquin Barrero
	 **/
	 
	 public void printEmployees(){
		
		 System.out.println("Listofemployees:");
		 
	 for (Employee e : employeeList) {
		 System.out.println(e.toString());
	 }
	 
	 
 
	 }
 
 
 public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

public static void main(String[] args){
	 
 EmployeeManager manager=new EmployeeManager();
 Employee e1 = new Employee("JohnDoe",5);
 Employee e2 = new Employee("JaneSmith",2);
 manager.addEmployee(e1);
 manager.addEmployee(e2);

 manager.printEmployees();
 
 }
 }
 

