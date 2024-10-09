
import java.util.Scanner;

public class pr9 {

    static void double_char(String a) {
        for (int i = 0; i < a.length(); i++) {
            char b = a.charAt(i);
            System.out.print(b);
            System.out.print(b);
            
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter string :");
        String a = s.next();
        double_char(a);
    }
}
