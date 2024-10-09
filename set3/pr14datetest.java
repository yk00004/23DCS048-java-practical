
import java.util.Scanner;

class Date {

    private int d, m, y;
    Scanner s = new Scanner(System.in);

    Date() {
    }

    Date(int d, int m, int y) {
        this.d = d;
        this.m = m;
        this.y = y;
    }

    void setd() {
        System.out.print("enter day :");
        d = s.nextInt();
    }

    void setm() {
        System.out.print("enter month :");
        m = s.nextInt();
    }

    void sety() {
        System.out.print("enter year :");
        y = s.nextInt();
    }

    int getd() {
        return d;
    }

    int getm() {
        return m;
    }

    int gety() {
        return y;
    }

    void dateformet() {
        System.out.println(d + "/" + m + "/" + y);
    }
}

public class pr14datetest {

    public static void main(String[] args) {

        Date d = new Date();
        d.setd();
        d.setm();
        d.sety();
    
        d.dateformet();
    }
}
