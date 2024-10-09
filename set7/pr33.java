import java.util.concurrent.atomic.AtomicInteger;
public class pr33 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java SumWithThreads <N> <number of threads>");
            return;
        }
        int N = Integer.parseInt(args[0]);
        int numberOfThreads = Integer.parseInt(args[1]);
        Thread[] threads = new Thread[numberOfThreads];
        AtomicInteger sum = new AtomicInteger(0);
        int chunkSize = (N + numberOfThreads - 1) / numberOfThreads; 
        for (int i = 0; i < numberOfThreads; i++) {
            int start = i * chunkSize + 1;
            int end = Math.min(start + chunkSize - 1, N);

            threads[i] = new Thread(new SumTask(start, end, sum));
            threads[i].start();
        }
        for (int i = 0; i < numberOfThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("The sum of the first " + N + " numbers is: " + sum.get());
    }
}
class SumTask implements Runnable {
    private int start;
    private int end;
    private AtomicInteger sum;
    public SumTask(int start, int end, AtomicInteger sum) {
        this.start = start;
        this.end = end;
        this.sum = sum;
    }
    public void run() {
        int localSum = 0;
        for (int i = start; i <= end; i++) {
            localSum += i;
        }
        sum.addAndGet(localSum);
    }
}