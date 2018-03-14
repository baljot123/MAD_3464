/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

/**
 *
 * @author macstudent
 */
public class Bank {
    int bankId = 10102 ;
    String bankName = "TD";
    
    void getBankName(){
        System.out.println("BAnk NAme: " + this.bankName);
        
        
    }
    
        void setBankNAme(String name){
        this.bankName = name;
    }

}