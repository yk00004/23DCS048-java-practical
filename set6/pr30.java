
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class pr30 {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java CopyFile <source file> <destination file>");
            return;
        }

        String sourceFile = args[0];
        String destinationFile = args[1];

        try (FileInputStream fis = new FileInputStream(sourceFile); FileOutputStream fos = new FileOutputStream(destinationFile)) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
