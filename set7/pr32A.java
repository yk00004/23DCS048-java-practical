
public class pr32A {

    static class my extends Thread {

        @Override
        public void run() {
            super.run();
            System.out.println("hello world");
        }

    }

    public static void main(String[] args) {
        my t1 = new my();
        t1.start();
    }
}
