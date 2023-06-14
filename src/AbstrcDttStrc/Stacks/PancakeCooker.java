package AbstrcDttStrc.Stacks;

import helpers.Keyboard;

public class PancakeCooker {
    public static void main(String[] args) {

        // instantiate a PancakeStack 
        PancakeStack myBreakfast = new PancakeStack("Strawberries and Cream");

        // ask the user how many pancakes they want
        System.out.println("How many pancakes would you like to eat? (2-5)");
        int numberOfPancakes = Keyboard.readInt();

        // loop between 0 up to not including number, and push
        for (int i = 0; i < numberOfPancakes; i++) {
            myBreakfast.push();
        }

        // confirm to user that pancake stack is ready to eat
        System.out.println("Your Pancakes are ready :D");

        char answer = 'y';
        do {
            System.out.println("Hungry for your pancakes?? (y/n)");
            answer = Keyboard.readChar();
            /// ask the user if they want to eat the pancake
            if (answer == 'y') {
                System.out.println("How many pancakes would you like to eat??");
                Pancake eatMe = myBreakfast.pop();
            } else if (answer == 'n') {
                System.out.println("I went through all the touble of making them and you don't want to eat them?? :(");
            }
        } while (answer == 'y' && !myBreakfast.isEmpty());

        //System.out.println("Bye bye :)");
        

        

        
    }
    
}
