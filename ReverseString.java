import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

/**
* This program takes input from a file,
* reverses it, and prints the reversed one to an output file.
*
* @author Logan S
* @version 1.0
* @since 2023-04-12
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

        try {

            final ArrayList<String> input = new ArrayList<String>();

            // Create input file.
            final File inputFile = new File("input.txt");
            // Create output
            final FileWriter outputFile = new FileWriter("output.txt");

            // Creating the file into a String variable.
            final Scanner sc = new Scanner(inputFile);

            while (sc.hasNextLine()) {
                // Add each line of the file to the ArrayList.
                input.add(sc.nextLine());
            }

            for (String strLine : input) {
                // Write and print the reversed text to the output file.
                outputFile.write(reverse(strLine) + "\n");
                System.out.println(reverse(strLine));

            }
            // Closing FileWriter
            outputFile.close();

            // Closing Scanner
            sc.close();

        } catch (IOException exception) {
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
            // If the string is empty, tell the user
            return str;
        } else {
            // Otherwise, if the string ISN'T empty, return reversed string
            return reverse(str.substring(1)) + str.charAt(0);
        }
    }
}
