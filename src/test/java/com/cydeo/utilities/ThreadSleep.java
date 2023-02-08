package utilities;

public class ThreadSleep {
    public static void timeout(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
        }
    }
}
