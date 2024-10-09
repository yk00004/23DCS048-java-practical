
import java.util.Scanner;

class Area{
    int l,b;
    public Area(){}
    public Area(int l,int b) {
        this.l=l;
        this.b=b;
    }
    public int returnarea(){
        return l*b;
    }
    
}
public class pr15 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter length :");
        int a=s.nextInt();
        System.out.print("Enter length :");
        int b=s.nextInt();
        Area area=new Area(a,b);
        System.out.println("total area :"+area.returnarea());
    }
}
