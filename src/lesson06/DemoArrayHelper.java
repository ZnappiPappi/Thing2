package lesson06;

import helpers.ArrayHelper;

public class DemoArrayHelper {
    public static void main(String[] args) {
        //declare one variable for one number
        //assign myNumber to 5
        int acc0bal = 10;
        int acc1bal = 30;
        //declare array for 100 numbers
        //assign memory locatins
        int[] accNumbers = new int[100];

        //putting myNumber in the first slot
        accNumbers[0] = acc0bal;
        accNumbers[1] = acc1bal;
        
        System.out.println(accNumbers[1]);

        //using array helpers
        ArrayHelper.fill(accNumbers, acc0bal);

        boolean found = ArrayHelper.contains(accNumbers, acc0bal);
        System.out.println(found);
        boolean notFound = ArrayHelper.contains(accNumbers, 50);
        System.out.println(notFound);
    }   

}   
