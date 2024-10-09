
import java.util.Scanner;

public class pr5 {

    public static void main(String[] args) {

        System.out.println("electric application shope");
        Scanner s = new Scanner(System.in);

        System.out.print("enter how many product yo went buy :");
        int product = s.nextInt();

        int[] itemcode = new int[product];
        float[] prize = new float[product];
        float sum = 0;

        System.err.println("1:motor\n2:fan\n3:tube\n4:wires\n5:all others");
        for (int i = 0; i < product; i++) {
            int item;
            System.out.print("enter item code :");
            item = s.nextInt();
            itemcode[i] = item;
            System.out.print("enter product prize :");
            prize[i] = s.nextFloat();

            switch (item) {
                case 1 ->
                    prize[i] += prize[i] * 0.08f;
                case 2 ->
                    prize[i] += prize[i] * 0.12f;
                case 3 ->
                    prize[i] += prize[i] * 0.05f;
                case 4 ->
                    prize[i] += prize[i] * 0.075f;
                case 5 ->
                    prize[i] += prize[i] * 0.03f;
                default ->
                    System.out.println("enter valid product code...");
            }
            sum += prize[i];
        }
        System.out.println("\nelectric appliance shop bill");
        for (int i = 0; i < product; i++) {
            if(itemcode[i]==1){
                System.out.println(itemcode[i] + ". motor            " + prize[i]);
            }
            else if(itemcode[i]==2){
                System.out.println(itemcode[i] + ". fan              " + prize[i]);
            }
            else if(itemcode[i]==3){
                System.out.println(itemcode[i] + ". tube             " + prize[i]);
            }
            else if(itemcode[i]==4){
                System.out.println(itemcode[i] + ". wires            " + prize[i]);
            }
            else if(itemcode[i]==5){
                System.out.println(itemcode[i] + ". all others       " + prize[i]);
            }
        }
        System.out.println("=================================");
        System.out.println("your total amount : " + sum);
        s.close();
    }
}
