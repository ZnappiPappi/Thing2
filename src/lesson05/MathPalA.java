package lesson05;

import helpers.Keyboard;


public class MathPalA {
    public static void main(String[] args) {

        System.out.println("Are you ready to do some math?");
        String function = Keyboard.readString();
        

        char isReady = 'y';
        char notReady = 'n';

        while(isReady == 'y') {

            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");

            System.out.println("What to you want to try?");
            String choice = Keyboard.readString();
            if ("Add".equals(choice)){
                System.out.println("Enter two numbers");
            int n1 = Keyboard.readInt(); 
            int n2 = Keyboard.readInt();

                System.out.println("The answer is "+ (n1 + n2));
            }
            else if ("Subtract".equals(choice)){
                System.out.println("Enter two numbers");
            int n1 = Keyboard.readInt(); 
            int n2 = Keyboard.readInt();

                System.out.println("The answer is "+ (n1 - n2));
            }
            else if ("Multiply".equals(choice)){
                System.out.println("Enter two numbers");
            int n1 = Keyboard.readInt(); 
            int n2 = Keyboard.readInt();

                System.out.println("The answer is "+ (n1 * n2));
            }
            else if ("Divide".equals(choice)){
                System.out.println("Enter two numbers");
            int n1 = Keyboard.readInt(); 
            int n2 = Keyboard.readInt();

                System.out.println("The answer is "+ (n1 / n2));
            }


            System.out.println("Do you want an explainer? (true/false)");
            boolean expl = Keyboard.readBoolean();


            if (expl) {
                System.out.println("Haha no lol");
                System.out.println("Go ask ur parents");
            }

            System.out.println("Wanna have another go? (y/n)");
            isReady = Keyboard.readChar();

            if (notReady == 'n'){
                System.out.println("Thank you for playing!!");
            }
        }
        
        

        
    }

    public static String operationFunction(String function, int n1, int n2) {
        // TODO: use a switch case statement to switch between function
        // in each case, return the appropriate result e.g., n1 + n2
        // you should change the method signature to return a numeric type
        return "Assume I did the function yay";
    }
}
