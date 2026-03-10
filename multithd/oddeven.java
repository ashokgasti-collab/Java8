package multithd;


import multithd.InterleavedPrint.LetterPrinter;
import multithd.InterleavedPrint.NumberPrinter;

public class oddeven {
    private static final Object lock = new Object();
    private static boolean flag = true; // To keep track of whose turn it is

    public static void main(String[] args) {
        Thread oddThread = new Thread(new odd());
        Thread evenThread = new Thread(new even());

        // Start both threads
        oddThread.start();
        evenThread.start();
    }

    // Thread for printing odd numbers
    static class odd implements Runnable {
        @Override
        public void run() {
        	
        	for (int i=1;i<=10;i++) {System.out.println("*");
                synchronized (lock) {
                
                    // Wait until it's the letter's turn
                    while (!flag) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    // Print the odd
                    if(i%2!=0)
                    System.out.println("odd thresd"+i);
                    // Toggle the turn and notify the other thread
                    
                    flag = false;
                    
                    lock.notify();
                }
            }
        }
    }

    // Thread for printing numbers
    static class even implements Runnable {
        @Override
        public void run() {
        	for (int number = 1; number <= 10; number++) {System.out.println("^");
                synchronized (lock) {
                	 
                    // Wait until it's the number's turn
                    while (flag) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    // Print the even number
                    if(number%2==0)
                    System.out.println("even thead "+number);
                    // Toggle the turn and notify the other thread
                    flag = true;
                    lock.notify();
                }
            }
        }
    }
}

