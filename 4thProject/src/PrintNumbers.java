public class PrintNumbers {
    private final Object lock = new Object();
    private boolean oneTurn = true;

    public void printOne() {
        while (true) {
            synchronized (lock) {
                while (!oneTurn) {
                    try { lock.wait(); } catch (InterruptedException ignored) {}
                }
                System.out.print("1 ");
                oneTurn = false;
                lock.notifyAll();
            }
        }
    }

    public void printTwo() {
        while (true) {
            synchronized (lock) {
                while (oneTurn) {
                    try { lock.wait(); } catch (InterruptedException ignored) {}
                }
                System.out.print("2 ");
                oneTurn = true;
                lock.notifyAll();
            }
        }
    }
}