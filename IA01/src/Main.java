//Gerald Brady
//Fall 2022 Semester
//September 1st

//Sites used for guidance:
//https://www.geeksforgeeks.org/generating-random-numbers-in-java/
//https://stackoverflow.com/questions/32554001/randomly-generate-odd-numbers-in-the-range

//Imports
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // My information
        System.out.println("Name: Gerald Brady");
        System.out.println("PSU Email: gsb5249@psu.edu");
        System.out.println("Course: IST 311");
        System.out.println("Section: 001");
        System.out.println("Assignment Number: IA01");
        System.out.println();
        String message = "Do you want to continue? Type Y to continue. Otherwise, enter any other key to end the game: ";
        ArrayList correctMultiplied = new ArrayList();
        ArrayList incorrectMultiplied = new ArrayList();
        ArrayList combinedMultiplied = new ArrayList();

        //Random class and scanner instance created
        Random randomNumber = new Random();
        Scanner userMultiply = new Scanner(System.in);
        Scanner yesNo = new Scanner(System.in);
        int multipliedNumber = 0;
        String yesNoAnswer = null;

        //Loops the whole game until Y is not entered
        do {
            // Random number in range 0 to 5 to put into formula
            int evenOddNumber = randomNumber.nextInt(5);
            //Using a formula that creates an odd number (x*2)+1
            int oddNumber = evenOddNumber * 2 + 1;

            // Print random integers
            System.out.println("Your number is : " + oddNumber);
            System.out.print("What is " + oddNumber + " multiplied by 2? ");
            multipliedNumber = userMultiply.nextInt();

            //do {
            if (multipliedNumber == (oddNumber * 2)) {
                correctMultiplied.add(oddNumber);
                combinedMultiplied.add(oddNumber);
                System.out.println("Your answer is correct. 2 x " + oddNumber + " = " + multipliedNumber);

            } else {
                incorrectMultiplied.add(oddNumber);
                combinedMultiplied.add(oddNumber);
                System.out.println("Your answer is incorrect. 2 x " + oddNumber + " != " + multipliedNumber);
            }
            System.out.print(message);
            yesNoAnswer = yesNo.next();
        } while (Objects.equals(yesNoAnswer, "Y"));

        System.out.println();

        //How many answers were correct
        System.out.println("You entered " + correctMultiplied.size() + " correct answers. ");
        //How many answers were incorrect
        System.out.println("You entered " + incorrectMultiplied.size() + " incorrect answers. ");
        //The percentage of correct answers
        Double percent = (double) ((correctMultiplied.size()) / (incorrectMultiplied.size()));
        System.out.println("The percent you got correct is: " + percent);

        int min = (int) combinedMultiplied.get(0);
        int max = (int) combinedMultiplied.get(0);
        for (Object i : combinedMultiplied) {
            min = Math.min(min, (Integer) i);
            max = Math.max(max, (Integer) i);
        }
            // The lowest number that was chosen by the program
            System.out.println("The lowest number that was given is: " + min);
            //The highest number that was chosen by the program
            System.out.println("The highest number given: " + max);

        }
    }
