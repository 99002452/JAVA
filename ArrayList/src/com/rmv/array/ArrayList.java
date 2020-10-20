package com.rmv.array;

import java.util.List;

import java.lang.Iterable;

/*
 * Storing user-defined class objects.
 */
public class ArrayList
{

    public static void main(String[] args)
    {
        ArrayList list = new ArrayList();

        Employee Moni = new Employee("Moni", 32, 40000);
        Employee Sandhya = new Employee("Sandhya", 42, 80000);
        Employee Vaishu = new Employee("Vaishu", 52, 150000);

        list.add(Moni);
        list.add(Sandhya);
        list.add(Vaishu);

        /*
         * Using for each loop getting each employee object from the list
         */
        for (Employee employee : list)
        {
            System.out.println(employee.toString());
        }
    }

	private void add(Employee john) {
		// TODO Auto-generated method stub
		
	}
}
