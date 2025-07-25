/*  A game inspired by "Mad Libs" where user enters nouns,
    verbs, etc., and then a story using those words is output.
*/

import java.util.Scanner;

public class StoryGame {

    public static void main(String[] args) {
        // define Scanner object
        try(Scanner scnr = new Scanner(System.in)) {
            // Declairing variables
            String wordRelative;
            String wordFood;
            String wordAdjective;
            String wordTimePeriod;

            // Get user input
            System.out.println("Provide input without spaces");

            // Get user input for relative
            System.out.println("Enter a kind of relative: ");
            wordRelative = scnr.next();

            // Get user input for wordFood
            System.out.println("Enter a kind of food: ");
            wordFood = scnr.next();

            // Get user input for wordAdjective
            System.out.println("Enter an adjective: ");
            wordAdjective = scnr.next();

            // Get user input for wordTimePeriod
            System.out.println("Enter a time period: ");
            wordTimePeriod = scnr.next();

            // Print statements to tell the story

            System.out.println("");
            System.out.print("My " + wordRelative);
            System.out.println(" says eating " + wordFood);
            System.out.println("will make me more " + wordAdjective);
            System.out.println("so now I eat it every " + wordTimePeriod);


        }
    }
    
}
