
import java.util.Scanner;

public class pr3 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter distance in meters :");
        float dis, ts, tm, th;
        dis = s.nextFloat();
        System.out.print("enter time in hours :");
        th = s.nextFloat();
        System.out.print("enter time in minutes :");
        tm = s.nextFloat();
        System.out.print("enter time in second :");
        ts = s.nextFloat();

        float tts = ts + (tm * 60) + (th * 60 * 60);
        float tth = th + (tm / 60) + (ts / 3600);
        
        System.out.println("speed in meters per second   :" + dis / tts + "m/s");
        System.out.println("speed in kilometers per hour :" + (dis / 1000) / (tth) + "km/h");
        System.out.println("speed in miles per hour      :" + (dis / 1609) / (tth) + "mile/h");
        s.close();
    }
}
