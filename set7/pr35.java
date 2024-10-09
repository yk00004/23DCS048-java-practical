class Incrementer extends Thread {
    private int number;

    Incrementer(int number) {
        this.number = number;
    }

    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        number++;
        System.out.println("Incremented Value: " + number);
    }
}

public class pr35 {
    public static void main(String[] args) {
        int initialValue = 0;
        System.out.println("Initial Value: " + initialValue);
        Incrementer incrementer = new Incrementer(initialValue);
        incrementer.start();
    }
}