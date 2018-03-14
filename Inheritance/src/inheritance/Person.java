/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;
import java.util.Scanner;
/**
 *
 * @author macstudent
 */
  public class Person {
    
    String firstName;
    String lastNAme;
    int age;
    
    Person(){
        
        this.firstName ="Unknown";
        this.lastNAme  = "Unknown";
        this.age =1;
    }
    
    //parameterized constructor
    Person(String fNm, String lNM, int age){
        
        this.firstName= fNm;
        this.lastNAme= lNM;
        this.age = age;
        
    }
   
    //copy Constructors
    Person(Person object){
        this.firstName= object.firstName;
        this.lastNAme= object.lastNAme;
        this.age = object.age;
    }
    
    void read(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter First Name: ");
        this.firstName = input.nextLine();
        System.out.println("Enter last name");
        this.lastNAme = input.nextLine();
        System.out.println("Enter AGe: ");
        this.age = input.nextInt();
    }
    
    void display()
    {
        System.out.println("First NAme: " + this.firstName);
        System.out.println("Last Name: "+ this.lastNAme);
        System.out.println("Age: "+ this.age);
    }
}
