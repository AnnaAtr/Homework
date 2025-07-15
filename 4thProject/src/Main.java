public class Main {
    public static void main(String[] args) {
        PrintNumbers printer = new PrintNumbers();
        new Thread(printer::printOne).start();
        new Thread(printer::printTwo).start();

        DeadLockExample deadLock = new DeadLockExample();
        deadLock.runExample();

        LiveLockExample liveLock = new LiveLockExample();
        liveLock.runExample();
    }
}