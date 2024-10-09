class MyThread extends Thread {
    MyThread(String name) {
        super(name);
    }
    public void run() {
        System.out.println(getName() + " is running with priority " + getPriority());
    }
}
public class pr36 {
    public static void main(String[] args) {
        MyThread firstThread = new MyThread("FIRST");
        MyThread secondThread = new MyThread("SECOND");
        MyThread thirdThread = new MyThread("THIRD");
        firstThread.setPriority(Thread.MIN_PRIORITY);
        secondThread.setPriority(Thread.NORM_PRIORITY); 
        thirdThread.setPriority(Thread.MAX_PRIORITY);
        firstThread.start();
        secondThread.start();
        thirdThread.start();
    }
}