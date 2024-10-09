
import java.io.*;

public class pr31 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {

            System.out.println("Enter text (type 'exit' to quit):");
            String line;
            while (!(line = reader.readLine()).equalsIgnoreCase("exit")) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Text written to output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
