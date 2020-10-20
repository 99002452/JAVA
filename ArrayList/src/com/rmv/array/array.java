package com.rmv.array;

import java.util.List;

public class array {

	public static void main(String[] args)
	{
		List<Employee> list = new ArrayList<Employee>();
		
		
		Employee Moni = new Employee("Moni", 32, 40000);
        	Employee Sandhya = new Employee("Sandhya", 42, 60000);
        	Employee Vaishu = new Employee("Vaishu", 22, 70000);

       		list.add(Moni);
        	list.add(Sandhya);
        	list.add(Vaishu);
		
		for (Employee emp : list) {
			System.out.println(emp.toString());
		}
	}

}
