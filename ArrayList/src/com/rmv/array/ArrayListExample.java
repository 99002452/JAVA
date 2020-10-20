package com.rmv.array;

import java.util.ArrayList;
import java.util.List;

/*
 * Storing user-defined class objects.
 */
public class ArrayListExample
{

    public static void main(String[] args)
    {
        List<Employee> list = new ArrayList<Employee>();

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
}