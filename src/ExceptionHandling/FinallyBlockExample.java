package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FinallyBlockExample {
    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            // Initialize the BufferedReader
            reader = new BufferedReader(new FileReader("example.txt"));

            String line;
            // Read lines from the file
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        } finally {
            // Ensure the reader is closed in the finally block
            if (reader != null) {
                try {
                    reader.close(); // Close the BufferedReader
                    System.out.println("BufferedReader closed successfully.");
                } catch (IOException e) {
                    System.out.println("An error occurred while closing the reader: " + e.getMessage());
                }
            }
        }
    }
}

