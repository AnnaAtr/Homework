public class LiveLockExample {
    private volatile boolean flag = true;

    public void runExample() {
        Thread t1 = new Thread(() -> {
            while (true) {
                if (flag) {
                    System.out.println("Поток 1 уступает Потоку 2");
                    flag = false;
                }
                try { Thread.sleep(100); } catch (InterruptedException ignored) {}
            }
        });

        Thread t2 = new Thread(() -> {
            while (true) {
                if (!flag) {
                    System.out.println("Поток 2 уступает Потоку 1");
                    flag = true;
                }
                try { Thread.sleep(100); } catch (InterruptedException ignored) {}
            }
        });

        t1.start();
        t2.start();
    }
}