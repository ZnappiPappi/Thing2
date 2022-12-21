package lesson03;

import helpers.Keyboard;
/**
 * 5Write a program that accepts three numbers as input from the user
 * and outputs the largest one.
 */
public class LargestNumber {
    public static void main(String[] args) {
        // Plan out the algorithm by writing steps in english...
        /*
         * Step 1: Get three numbers from user
         * Step 2: Identify largest number
         * Step 3: Output largest number
         */
        
        int n1,n2,n3;
        int bn = 0;

         System.out.println("Please enter three different numbers.");
         n1 = Keyboard.readInt();
         n2 = Keyboard.readInt();
         n3 = Keyboard.readInt();

         System.out.println("Would you like the biggest or smallest number?");
        String choice = Keyboard.readString();
        if("Biggest".equals(choice)){
        
            if(n1 > n2 && n1 > n3){
                bn = n1;
                System.out.println("The largest number is "+bn);
             }
            else if(n2 > n1 && n2 > n3){
                 bn = n2;
                 System.out.println("The largest number is "+bn);
             }
            else if(n3 > n1 && n3 > n2){
                 bn = n3;
                 System.out.println("The largest number is "+bn);
             }
             else{
                 System.out.println("I said three DIFFERENT numbers.");
             }
     
          
          } else if("Smallest".equals(choice)){

            if(n1 < n2 && n1< n3){
                bn = n1;
                System.out.println("The smallest number is "+bn);
             }
            else if(n2 < n1 && n2 < n3){
                 bn = n2;
                 System.out.println("The smallest number is "+bn);
             }
            else if(n3 < n1 && n3 < n2){
                 bn = n3;
                 System.out.println("The smallest number is "+bn);
             }
             else{
                 System.out.println("I said three DIFFERENT numbers.");
             }  
        } 
            

    } 
}