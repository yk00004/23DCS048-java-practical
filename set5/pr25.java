// package java.practicals;

public class pr25 {

    public static void myfun() throws ArithmeticException ,ArrayIndexOutOfBoundsException {
        int x = 7;
        System.out.println(x / 0);
        int a[]={2,3};
        System.out.println(a[5]);
    }

    public static void main(String[] args)  {
        // try {
            myfun();
        // } catch (Exception e) {
        //     System.out.println(e);
        // }

    }
}
