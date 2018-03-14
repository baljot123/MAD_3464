/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

import java.util.Scanner;

/**
 *
 * @author macstudent
 */
public class Day2 {

   
    public static void main(String[] args) {
        
        //create an new object of Bank class
        
       Bank  myBank = new Bank ();
       
        System.out.println("Bank ID: " + myBank.bankId);
        System.out.println("Bank Name: " + myBank.bankName);
        
       
        Bank yourBank = new Bank();
        
        myBank.bankId = 123;
        myBank.bankName = "Scotia";
      
        
        
        System.out.println("Bank ID :" + myBank.bankId);
        System.out.println("BAnk NAme: "+ myBank.bankName);
        
        yourBank.getBankName();
    
        yourBank.setBankNAme("ICICI");
        yourBank.getBankName();
        
        Scanner myInput = new Scanner(System.in);
        String name;
        System.out.println("Enter BAnk Name: ");
        name = myInput.nextLine();
        
        yourBank.setBankNAme(name);
        yourBank.getBankName();
        
        //create an object of arithmetic class
        Arithmetic operation1 = new Arithmetic();
        
        operation1.addition(10,20);
        System.out.println("output of integer addition: " + operation1.addition(10, 20));
        System.out.println("output of float addition: " + operation1.addition(10.231f, 20.32f));
        System.out.println("output of three integer addition: " + operation1.addition(10, 20, 30));
        // operation1.addition(5.2, 10.8);
         
       Arithmetic operation2 = new Arithmetic();
       operation2.multiplication(2,3,4);
        System.out.println("output for multiplication: " + operation2.multiplication(2,3));
        System.out.println("output for multiplication: " + operation2.multiplication(2,3,4));
        Arithmetic.multiplication(10,20);
        
        Arithmetic.n1= 20;
      //  Arithmetic.n2= 20;
        System.out.println(Arithmetic.n1+ " " + Arithmetic.n2);  
    }

}