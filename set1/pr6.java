
import java.util.Scanner;

public class pr6 {

    static int fibonaci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonaci(n - 1) + fibonaci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of days :");
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("day " + i + " doing exercise for " + fibonaci(i) + " hour");
        }

    }
}
