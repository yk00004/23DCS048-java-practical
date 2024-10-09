
import java.util.Scanner;

public class pr4 {

    public static void main(String[] args) {
        int[] expe = new int[4];
        Scanner s = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < expe.length; i++) {
            System.out.print("enter your day " + (i + 1) + " expenses :");
            expe[i] = s.nextInt();
            sum += expe[i];
        }
        System.out.println("your total expense is " + sum);
       s.close(); 
    }
}
