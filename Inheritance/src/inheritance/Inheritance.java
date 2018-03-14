/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author macstudent
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Person one =new Person();
        
        one.display();
        
        Person abc = new Person("Baljot","Singh",23);
        abc.display();
        
        Person abc1 = new Person(abc);
        abc1.display();
        
       // Employee e1= new Employee(1243.578);
       // e1.display();
        
        Employee e2= new Employee();
        e2.display();
        
        e2.firstName= "BAljot";
        e2.lastNAme= "Sansoya";
        e2.age= 23;
        e2.salary = 5000;
        e2.display();
        e2.display();
        
        //Method Overriding
        
       Employee e3 = new Employee();
       
       e3.read();
       e3.display();
       
        //System.out.println("First Name: " + e2.firstName);
        //System.out.println("Last Name: " + e2.lastNAme);
        //System.out.println("age: " + e2.age); 
    
    }
    
}

