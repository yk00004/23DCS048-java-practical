
import java.util.Scanner;

class complex {

    int r, i;
    int sumi, sumr;
    Scanner s = new Scanner(System.in);

    void setr() {
        System.out.print("enter real number :");
        r = s.nextInt();
    }

    void seti() {
        System.out.print("enter imaginary number :");
        i = s.nextInt();
    }

    void sum(complex c) {
        sumi = i + c.i;
        sumr = r + c.r;
        if (sumr >= 0) {
            System.out.println(sumr + "+" + sumi + "i"); 
        }else {
            System.out.println(sumr + "" + sumi + "i");
        }
    }

    void difrence(complex c) {
        int difi = i - c.i;
        int difr = r - c.r;
        if (difi >= 0) {
            System.out.println(difr + "+" + difi + "i");
        } else {
            System.out.println(difr + "" + difi + "i");

        }
    }

    void product(complex c) {
        // (r,i)(c.r c.i)
        int pror = (r * c.r) - (i * c.i);
        int proi = (r * c.i) + (i * c.r);
        if (proi >= 0) {
            System.out.println(pror + "+" + proi + "i"); 
        }else {
            System.out.println(pror + "" + proi + "i");
        }
    }

}

public class pr16 {

    public static void main(String[] args) {
        complex c1 = new complex();
        complex c2 = new complex();
        c1.setr();
        c1.seti();
        c2.setr();
        c2.seti();
        c1.sum(c2);
        c1.difrence(c2);
        c1.product(c2);
    }
}
