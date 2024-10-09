import java.util.Scanner;

public class pr24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        try {
            System.out.println("enter vaalyu of x and y :");
            x=sc.nextInt();
            y=sc.nextInt();
            float z=x/y;
            System.out.println("x/y :"+ z);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error:enter valid integer");
        }
        catch(Exception e ){
            System.out.println(e);
        }
    }
}
