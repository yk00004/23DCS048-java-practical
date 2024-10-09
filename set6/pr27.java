
import java.io.BufferedReader;
import java.io.FileReader;

public class pr27 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No files specified.");
            return;
        }

        for (String fileName : args) {
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                int lineCount = 0;
                while (reader.readLine() != null) {
                    lineCount++;
                }
                System.out.println(fileName + ": " + lineCount + " lines");
            } catch (Exception e) {
                System.err.println("Error reading file " + fileName + ": " + e.getMessage());
            }
        }
    }
}