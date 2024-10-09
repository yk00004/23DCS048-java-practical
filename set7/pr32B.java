
public class pr32B {

    static class my implements Runnable {

        @Override
        public void run() {
            System.out.println("hello world");
        }

    }

    public static void main(String[] args) {

        my t = new my();
        Thread x = new Thread(t);
        x.start();

    }
}
