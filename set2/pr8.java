
import java.util.Scanner;

public class pr8 {

    static int array_count9(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 9) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.print("enter size of arry :");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        int[] arr = new int[a];
        System.out.print("enter array eliment :");
        for (int i = 0; i < a; i++) {
            arr[i] = s.nextInt();
        }
        int count = array_count9(arr);
        System.out.println("total 9 in your given array : " + count);
    }

}
