package com.endes.app;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;




class EmployeeManagerTest {

	
	@Test
	@DisplayName("Prueba de Lista")
	
	
	void addEmployeeTest() {
		Employee e = new Employee("JohnDoe",5);
		EmployeeManager manager=new EmployeeManager();
		
		
		manager.addEmployee(e);
		
		
		int valorEsperado=1;
		int resultado=manager.getEmployeeList().size();
		
		assertEquals(valorEsperado, resultado, "Funciona OK, se incrementa el tamaño de la lista");
		
	}
	

}
