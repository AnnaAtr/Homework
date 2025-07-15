public class DeadLockExample {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void runExample() {
        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                try { Thread.sleep(100); } catch (InterruptedException ignored) {}
                synchronized (lock2) {
                    System.out.println("Поток 1 захватил оба ресурса");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                try { Thread.sleep(100); } catch (InterruptedException ignored) {}
                synchronized (lock1) {
                    System.out.println("Поток 2 захватил оба ресурса");
                }
            }
        });

        t1.start();
        t2.start();
    }
}