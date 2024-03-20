package com.revision.core.Encapsulation;

public class Main {

	public static void main(String[] args)
    {
        // person object created
        Person person = new Person();
        person.setName("John");
        person.setAge(30);
 
        // Using methods to get the values from the
        // variables
        System.out.println("Name: " + person.getName()); // John
        System.out.println("Age: " + person.getAge()); // 30
    }
}
