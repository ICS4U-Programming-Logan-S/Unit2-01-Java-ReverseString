import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;


/**
* This program takes input from a file,
* reverses it, and prints the reversed one to an output file.
*
* @author Logan S
* @version 1.0
* @since 2023-04-10
*/

public final class ReverseString {

    /**
    * For style checker.
    *
    * @exception IllegalStateException Utility class.
    * @see IllegalStateException
    */

    private ReverseString() {
        throw new IllegalStateException("Utility class");
    }

    /**
    * This is the main method.
    *
    * @param args Unused.
    */

    public static void main(String[] args) {

        // Create input file
        final File inputFile = new File("input.txt");

        try{
            // Creating the file into a String variable
            final Scanner sc = new Scanner(inputFile);

            // Create String object to convert the file to
            final String input = sc.useDelimiter("\\Z").next();

            try{
                // Create output file
                final FileWriter outputFile = new FileWriter("output.txt");

                // Write and print the reversed text to the output file.
                outputFile.write(reverse(input));
                System.out.println("Output text: " + reverse(input));

                // Closing FileWriter
                outputFile.close();

            } catch (IOException exception) {
                System.out.println("Error");
            }

            // Closing Scanner
            sc.close();

        } catch (FileNotFoundException exception) {
            System.out.println("Error: File does not exist.");
        }
    }

    /**
    * This is the main method.
    *
    * @param str The string.
    * @return the reversed string.
    */

    public static String reverse(String str) {

        // Check if the string is empty
        if (str.isEmpty()) {
            // If the string is empty, return the same string
            return str;
        } else {
            // Otherwise, if the string ISN'T empty, return reversed string
            return reverse(str.substring(1)) + str.charAt(0);
        }
    }
}
