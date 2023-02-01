package Yr12Assignment;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Scanner;
import java.util.stream.Stream;
import java.util.concurrent.TimeUnit;

import helpers.Keyboard;

/* User: MsC123 Pass: CoffeeAddict
 * User: BaldCanadian Pass: temp1
 * User: Ihtemath34 Pass: temp2
 */
public class BankingAssignment {

    // public static double balance = 250.00;

    public static String currency = " Euros";

    public static String[] transactions = new String[100];

    // public static String[] contacts = { "MsC123", "BaldCanadian", "Ihtemath34" };

    public static void main(String[] args) {

        init();

        double MsC123 = 50;
        double BaldCanadian = 100;
        double Ihtemath34 = 30;

        double dep;
        double with;
        double transf;
        int acctrnsf;

        double[] accNumber = new double[5];

        accNumber[0] = MsC123;
        accNumber[1] = BaldCanadian;
        accNumber[2] = Ihtemath34;

        System.out.println("-------------------------------------------------------");
        System.out.println("Welcome to Woozer!! Your trusted banking entity! :D");
        pause(1);
        System.out.println("Please enter your account username to continue.");
        String username = Keyboard.readString();
        System.out.println("Please enter your password.");
        String password = Keyboard.readString();
        char isReady = 'y';
        char notReady = 'n';

        while (isReady == 'y') {

            if (password.equals("CoffeeAddict") && username.equals("MsC123")) {
                System.out.println("-------------------------------------------------------");
                System.out.println("Welcome Ms Camilleri.");
                pause(1);
                while (isReady == 'y') {
                    System.out.println("Please pick a category.");
                    pause(1);
                    System.out.println("A. Display account balance.");
                    System.out.println("B. Deposit money.");
                    System.out.println("C. Withdraw money.");
                    System.out.println("D. Transfer money.");
                    System.out.println("E. Quit.");

                    String option = Keyboard.readString();
                    if (option.equals("A")) {
                        System.out.println("You have a balance of:");
                        System.out.println(accNumber[0]);
                        System.out.println("Euros");
                    } else if (option.equals("B")) {
                        System.out.println("How much money would you like to deposit?");
                        dep = Keyboard.readDouble();
                        System.out.println("Your current balance is:");
                        System.out.println(accNumber[0] = accNumber[0] + dep);
                        System.out.println("Euros");
                    } else if (option.equals("C")) {
                        System.out.println("How much money would you like to withdraw?");
                        with = Keyboard.readDouble();
                        if (with <= accNumber[0]) {
                            System.out.println("Your current balance is:");
                            System.out.println(accNumber[0] = accNumber[0] - with);
                            System.out.println("Euros");
                        } else {
                            System.out.print("Transaction failed, insuficient funds.");
                        }
                    } else if (option.equals("D")) {
                        System.out.println("How much money would you like to transfer?");
                        transf = Keyboard.readDouble();
                        if (transf <= accNumber[0]) {
                            System.out.println(
                                    "Please enter the account number that you would like to transfer the money to.");
                            pause(1);
                            System.out.println(
                                    "If you would like to see a display of accounts and their corresponding numbers say type '888'");
                            acctrnsf = Keyboard.readInt();
                            switch (acctrnsf) {
                                case 1:
                                    System.out.println(
                                            "You have transfered " + transf + " " + currency + " into Account "
                                                    + acctrnsf);
                                    System.out.println("You now have a balance of:");
                                    System.out.println(accNumber[0] = accNumber[0] - transf);
                                    System.out.println("Euros");
                                    accNumber[1] = accNumber[1] + transf;
                                    break;
                                case 2:
                                    System.out.println(
                                            "You have transfered " + transf + " " + currency + " into Account"
                                                    + acctrnsf);
                                    System.out.println("You now have a balance of:");
                                    System.out.println(accNumber[0] = accNumber[0] - transf);
                                    System.out.println("Euros");
                                    accNumber[2] = accNumber[2] + transf;
                                    break;
                                case 888:
                                    System.out.println("Account 0 - MsC123");
                                    System.out.println("Account 1 - BaldCanadian");
                                    System.out.println("Account 2 - Ihtemath34");
                                    break;
                                default:
                                    System.out.println("Process failed, incorrect account number.");
                            }

                        } else {
                            System.out.print("Transaction failed, insuficient funds.");
                        }
                    } else if (option.equals("E")) {
                    }
                    pause(1);
                    System.out.println("Would you like to make more transactions? y/n");
                    isReady = Keyboard.readChar();
                }

            } else if (password.equals("temp1") && username.equals("BaldCanadian")) {
                System.out.println("-------------------------------------------------------");
                System.out.println("Welcome Kailu.");
                pause(1);
                while (isReady == 'y') {
                    System.out.println("Please pick a category.");
                    pause(1);
                    System.out.println("A. Display account balance.");
                    System.out.println("B. Deposit money.");
                    System.out.println("C. Withdraw money.");
                    System.out.println("D. Transfer money.");
                    System.out.println("E. Quit.");

                    String option = Keyboard.readString();
                    if (option.equals("A")) {
                        System.out.println("You have a balance of:");
                        System.out.println(accNumber[1]);
                        System.out.println("Euros");
                    } else if (option.equals("B")) {
                        System.out.println("How much money would you like to deposit?");
                        dep = Keyboard.readDouble();
                        System.out.println("Your current balance is:");
                        System.out.println(accNumber[1] = accNumber[1] + dep);
                        System.out.println("Euros");
                    } else if (option.equals("C")) {
                        System.out.println("How much money would you like to withdraw?");
                        with = Keyboard.readDouble();
                        if (with <= accNumber[1]) {
                            System.out.println("Your current balance is:");
                            System.out.println(accNumber[1] = accNumber[1] - with);
                            System.out.println("Euros");
                        } else {
                            System.out.print("Transaction failed, insuficient funds.");
                        }
                    } else if (option.equals("D")) {
                        System.out.println("How much money would you like to transfer?");
                        transf = Keyboard.readDouble();
                        if (transf <= accNumber[1]) {
                            System.out.println(
                                    "Please enter the account number that you would like to transfer the money to.");
                            pause(1);
                            System.out.println(
                                    "If you would like to see a display of accounts and their corresponding numbers say type '888'");
                            acctrnsf = Keyboard.readInt();
                            switch (acctrnsf) {
                                case 0:
                                    System.out.println(
                                            "You have transfered " + transf + " " + currency + " into Account "
                                                    + acctrnsf);
                                    System.out.println("You now have a balance of:");
                                    System.out.println(accNumber[1] = accNumber[1] - transf);
                                    System.out.println("Euros");
                                    accNumber[0] = accNumber[0] + transf;
                                    break;
                                case 2:
                                    System.out.println(
                                            "You have transfered " + transf + " " + currency + " into Account"
                                                    + acctrnsf);
                                    System.out.println("You now have a balance of:");
                                    System.out.println(accNumber[1] = accNumber[1] - transf);
                                    System.out.println("Euros");
                                    accNumber[2] = accNumber[2] + transf;
                                    break;
                                case 888:
                                    System.out.println("Account 0 - MsC123");
                                    System.out.println("Account 1 - BaldCanadian");
                                    System.out.println("Account 2 - Ihtemath34");
                                    break;
                                default:
                                    System.out.println("Process failed, incorrect account number.");
                            }

                        } else {
                            System.out.print("Transaction failed, insuficient funds.");
                        }
                    } else if (option.equals("E")) {
                    }
                    pause(1);
                    System.out.println("Would you like to make more transactions? y/n");
                    isReady = Keyboard.readChar();
                }

            } else if (password.equals("temp2") && username.equals("Ihtemath34")) {
                System.out.println("-------------------------------------------------------");
                System.out.println("Welcome Benedek. ");
                System.out.println("No money L");
            } else {
                System.out.println("-------------------------------------------------------");
                System.err.println("Incorrect username or password, please try again.");
                break;
            }

        }
        if (notReady == 'n') {
            System.out.println("Logging out of account...");
        }

    }

    // No idea how to make this work
    public static void init() {

        File file = new File("IB CS WORK\\Yr12Assignment", "MySimpleTransactions.txt");
        if (file.exists()) {
            int lines;
            try (Stream<String> stream = Files.lines(file.toPath(), StandardCharsets.UTF_8)) {
                lines = (int) stream.count();
                stream.close();
                if (lines > 0) {
                    Scanner fileScan = new Scanner(file);
                    for (int i = 0; i < lines; i++) {
                        transactions[i] = fileScan.nextLine();
                    }
                    fileScan.close();
                }
            } catch (IOException e) {
                System.out.println("Err: Did not manage to load data.");
            }
        }
    }

    private static void pause(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
        }
    }
}
