import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class pr28 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java CountCharacter <filename> <character>");
            return;
        }

        String filename = args[0];
        char character = args[1].charAt(0);
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            int c;
            while ((c = reader.read()) != -1) {
                if (c == character) {
                    count++;
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

        System.out.println("The character '" + character + "' appears " + count + " times in " + filename + ".");
    }
}