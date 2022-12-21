package lesson02;

import helpers.Keyboard;

/**
 * 
 * The Year 13 students have been told to get into teams of a specific size for the
 * Group 4 Project due next week. 
 * Write a program that: 
 *    - Prompts for the total number of students.
 *    - Prompts for size of the teams to be formed.
 *    - Displays how many teams can be formed.
 *    - Displays how many students are left without a team.
 * 
 * Use appropriate naming conventions and be sure to add comments.
 * Hint: Make use of the mod operator %
 */
public class CalculateTeams {
    public static void main(String[] args) {

        // Declaring and Input
        System.out.println("Enter the number of students: ");
        int numberOfStudents = Keyboard.readInt();

        System.out.println("Enter the number of teams: ");
        int numberOfTeams = Keyboard.readInt();

        // Process
        int numberOfStudentsRemaining = numberOfStudents % numberOfTeams;
        int numberOfStudentsInTeams = numberOfStudents / numberOfTeams; 

        // Output
        System.out.println("number of students in teams: " + numberOfStudentsInTeams);
        System.out.println("number of students remaining: " + numberOfStudentsRemaining);
    }
}
