package thread;

public class DaemonThread extends Thread{
    public void run() {
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void runDaemonThread() {
        DaemonThread thread = new DaemonThread();
        thread.setDaemon(true);
        thread.start();
    }
}
