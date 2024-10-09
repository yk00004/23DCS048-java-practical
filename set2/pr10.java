import java.util.Scanner;

public class pr10 {
    public static void length(String b){
        System.out.println(b.length());
    }
    public static void lowercase(String b){
        System.out.println(b.toLowerCase());
    }
    public static void uppercase(String b){
        System.out.println(b.toUpperCase());
    }
    public static void rever(String b){
        for(int i=b.length()-1;i>=0;i--){
            System.out.print(b.charAt(i));
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter string :");
        Scanner sc=new Scanner(System.in);
        String b=sc.nextLine();
        System.out.print("total length :");
        length(b);
        System.out.print("lowercase :");
        lowercase(b);
        System.out.print("uppercase :");
        uppercase(b);
        System.out.print("revers :");
        rever(b);
    }
}
