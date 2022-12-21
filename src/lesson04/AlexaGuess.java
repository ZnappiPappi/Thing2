
package lesson04;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import helpers.Keyboard;

/**
 * Can you read your teacher's code?
 * Run the code, experiment with input, and fill in the // with your explainers.
 * Filling in the comments is not optional so do not ask whether you can not do it *eye roll*.
 */
public class AlexaGuess {
    public static void main(String[] args) {
        //Printing question, engages user in game
        System.out.println("Hello there, let's play: Guess The Number.");
        System.out.println("Are you ready?");
        String response = Keyboard.readString();

        //If user accepts, continues game
        if (response.equals("yes") || response.equals("y")) {
            System.out.println("Hmm... all right let me think of a number...");

            //Generates random number between 0 and 10
            int number = (new Random()).nextInt(10);

            //literally just a ... to convey the image of Alexa thinking (even though it took her less than a second)
            System.out.print(".");
            pause(1);
            System.out.print(".");
            pause(1);
            System.out.print(".");
            pause(1);
            System.out.println("");

            //User given a number of tries
            int triesLeft = 2;
            System.out.println("Ok. You have 3 tries left. Have a go at your first guess.");
            int guess = Keyboard.readInt();

            //User guesses the number, one try is taken away from the total 3
            while (guess != number && triesLeft > 0) {
                if (guess < number) { // If Users number guessed is smaller, alexa gives a hint that it is larger
                    System.out.println("You are not correct! The number I am thinking of, is larger. Take another guess...");
                } else { // If Users number guessed is larger, alexa gives a hint that it is smaller
                    System.out.println("You are not correct! The number I am thinking of, is smaller. Take another guess...");
                }
                // removes one try from total 3( well acvtually 4 cuz java counts 0 as try)
                guess = Keyboard.readInt();
                triesLeft = triesLeft - 1;
            }

            //Once all 3/4tries are done, or number was guessed correctly, prints response
            if (triesLeft > 0 && guess == number) { //If user guessed the number in under 3/4 tries, prints response
                System.out.println("Well done, you guessed. That was a good round.");
            } else { //If user did not guess the number correctly in under 3/4 tries, prints response and tells answer
                System.out.println("You lost! The number I thought of was: " + number);
                System.out.println("Better luck next time.");
            }

        } else { //If user declines, prints response
            System.out.println("That is all right. Maybe some other time...");
            System.out.println(":(");
        }
    }

    //
    //
    //
    private static void pause(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
        }
    }
} 