import java.util.Random;

class NumberGenerator extends Thread {
    public void run() {
        Random random = new Random();
        while (true) {
            int num = random.nextInt(100); // Generate a random integer between 0 and 99
            System.out.println("Generated Number: " + num);
            if (num % 2 == 0) {
                new SquareCalculator(num).start();
            } else {
                new CubeCalculator(num).start();
            }
            try {
                Thread.sleep(1000); // Wait for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class SquareCalculator extends Thread {
    private int number;

    SquareCalculator(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Square of " + number + " is: " + (number * number));
    }
}

class CubeCalculator extends Thread {
    private int number;

    CubeCalculator(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Cube of " + number + " is: " + (number * number * number));
    }
}

public class pr34 {
    public static void main(String[] args) {
        new NumberGenerator().start();
    }
}