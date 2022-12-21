package lesson03;


// * This is a program that getgs the largest number from a data structurer of numbers * //

public class Bignumber {
    public static void main(String[] args) {
      
        // Data structure of numners (int)
        int[] numbers = new int[5]; //array
        numbers[0] = 17;
        numbers[1] = 23;
        numbers[2] = 13;
        numbers[3] = 69;
        numbers[4] = 8;

        //Declare a variable to store the largest number
        int largest = numbers[0];

        //loop while i still have numberto go through in the data structure//
        int myMemoryPointer = 0;
        while(myMemoryPointer < 4){
            int compare = numbers[(myMemoryPointer + 1)];
            largest = larger(largest, compare);
            myMemoryPointer = myMemoryPointer +1;
        }
        
        System.out.println("The largest number is " + largest);
    }
   
    //Public static output_type nameOfPredefinedProcess (input variables)//
    public static int larger (int n1, int n2){
        if (n1 > n2){
            return n1; //return is the output//
        }else{
            return n2;
        }
    }
}



