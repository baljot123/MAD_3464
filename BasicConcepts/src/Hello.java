
import java.util.Arrays;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */

public class Hello {
    
    public static void main(String[] args){
        
       int number = 10;
       float percentage;
       char vowel = 'b';
       String firstname = "Hello world";
       System.out.println("value of number = " + number);
       
       percentage = 78.6f;
       System.out.println("value of percentage= " + percentage);
       System.out.println("vowel = " + vowel);
       System.out.println(firstname);
       System.out.println("test" +1 +2);
       
       if(number>10)
       {
           System.out.println("more than 10");
       }
       else if(number == 10)
       {
           System.out.println("equal to 10");
       }
       
       switch (number){
           case 10:
               System.out.println("value = 10");
               break;
               
            case 20:
               System.out.println("value = 20");
               break;
            case 30:
                System.out.println("value = 30");
                break;
            default:
                System.out.println("No matching value");
                break;
       }
       
       vowel = 'i';
       switch(vowel){
           case 'a':
           case 'e':
           case 'i':
               System.out.println("vowel");
               break;
           default:
               System.out.println("Not a vowel");
       }
       
       String province = "Alberta";
       switch (province){
           case "Ontario":
               System.out.println("ON");
               break;
           case "Alberta":
               System.out.println("AB");
               break;
           case "prince Edward":
               System.out.println("PA");
               break;
           default:
               System.out.println("Unavailable");
               break;
               
       }
  
           int numbers[] = new int[5];
          // int i;
           
           for(int i=0;i<4;i++)
           {
               numbers[i] = (int)(Math.random()*100);
               System.out.println("numbers i[" + i +"]" +numbers[i]);
           }
         
           double PI_VALUE = Math.PI;
           double power = Math.pow(2,2);
           Math.sqrt(144);
           Math.abs(PI_VALUE);
           
           
           float grades[][] = new float [3][4];
           
           for(int i=0;i<3;i++)
           {
               for(int j=0;j<4;j++){
                   grades[i][j] = 10.0f;
                   
               }
              
           }
  
      int randomNo[] = new int[10];
      for(int i=0;i<10;i++){
          randomNo[i] = (int)(Math.random()*10);
      //    System.out.println("no " + (i+1) +" = " + randomNo[i]);
      }
      
     
      for(int i=0;i<5;i++){
          
          for(int j=0;j<5;j++){
              
              if(i==0 || i==4 || j==0 || j==4){
                  System.out.print("*");
              }
              
            // for(int k=1;k<); 
            else
              {
                  System.out.print(" ");
                  
              }
              
             }
         System.out.println(" "); 
        // // else if()
      }
   
/*Arrays.sort(randomNo);
      for(int i=0;i<10;i++)
      {
          System.out.println("no" + (i+1) +" = "+ randomNo[i]);
      }*/
     
    
    
  }
    
    
            
       
    //   percentage = 10;
     // number = 10.23;
       
    //   vowel = 74;
     //  number = 'b';
       
       //   System.out.println("value of number =" + number);
          //  System.out.println("vowel = " + vowel);
    }
    

