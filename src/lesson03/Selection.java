package lesson03;

import helpers.Keyboard;

public class Selection {
    public static void main(String[] args) {
        // Declare a variable to store the age
        int age;

        System.out.println("Please enter an age between 5 and 100 inclusive: ");
        age = Keyboard.readInt();

        // Milestone activities to show you reached a certain age
        if (age >= 95){
            System.out.println("why are you still here?");
        }
        else if (age >= 60){
            System.out.println("Enjoy your golden years!");
        }
        else if (age >= 35){
            System.out.println("How is your mid life crisis?");
        }
        else if (age >=18){
            System.out.println("Taxes!!");
        }
        else if(age >=16){
            System.out.println("Touch grass.");
        }
        else if (age >=9){
            System.out.println("Santa isn't real.");
        }
        else if (age >=5){
            System.out.println("Ew children.");
        }
    }
}
