package multithd;

public class InterleavedPrint {
    private static final Object lock = new Object();
    private static boolean letterTurn = true; // To keep track of whose turn it is

    public static void main(String[] args) {
        Thread letterThread = new Thread(new LetterPrinter());
        Thread numberThread = new Thread(new NumberPrinter());

        // Start both threads
        letterThread.start();
        numberThread.start();
    }

    // Thread for printing letters
    static class LetterPrinter implements Runnable {
        @Override
        public void run() {
            for (char letter = 'a'; letter <= 'j'; letter++) {
                synchronized (lock) {
                    // Wait until it's the letter's turn
                    while (!letterTurn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    // Print the letter
                    System.out.print(letter);
                    // Toggle the turn and notify the other thread
                    letterTurn = false;
                    lock.notify();
                }
            }
        }
    }

    // Thread for printing numbers
    static class NumberPrinter implements Runnable {
        @Override
        public void run() {
            for (int number = 1; number <= 10; number++) {
                synchronized (lock) {
                    // Wait until it's the number's turn
                    while (letterTurn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    // Print the number
                    System.out.print(number + " ");
                    // Toggle the turn and notify the other thread
                    letterTurn = true;
                    lock.notify();
                }
            }
        }
    }
}

