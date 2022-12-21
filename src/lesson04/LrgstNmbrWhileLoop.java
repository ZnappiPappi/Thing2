package lesson04;

import helpers.Keyboard;

public class LrgstNmbrWhileLoop {

    public static void main(String[] args) {
       
        int n1,n2;
        int bn = 0;

         System.out.println("Please enter a number.");
         n1 = Keyboard.readInt();
         
         int counter = 0;
         while(counter < 2){
            System.out.println("Please enter another number.");
            n2 = Keyboard.readInt();

            int result = compare (n1, n2);
            if (result == 1){
                n1 = n2;
            } 
            else {
                bn = n1;
            }
            
            counter = counter + 1; //made a comparison
         }
        System.out.println("The largest number is:" + bn);

    } 

    public static int compare(int n1, int n2){
        if(n1 == n2){
            return 0; //equal
        }
        else if (n1 < n2){
            return 1;//n2 is larger
        }
        else (n1 > n2){
            return 2;//n1 is larger
        }
        //
        
    }

}

