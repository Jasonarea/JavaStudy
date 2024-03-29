package thread.object;

public class StateThread extends Thread {
    private Object monitor;
    public StateThread(Object monitor) {
        this.monitor = monitor;
    }

    public void run() {
        try {
            for(int loop = 0; loop < 10000 ; loop++) {
                String a = "A";
            }
            synchronized (monitor) {
                monitor.wait();
            }
            System.out.println(getName() + " is notified");
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
