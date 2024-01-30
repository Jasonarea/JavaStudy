package thread.object;

public class RunObjectThread {
    public static void main(String[] args) {
        RunObjectThread sample = new RunObjectThread();
        sample.checkThreadState2();
    }

    public void checkThreadState2() {
        Object monitor = new Object();
        StateThread thread = new StateThread(monitor);
        try {
            System.out.println("thread state = " + thread.getState());
            thread.start();
            System.out.println("thread state(after start) = " + thread.getState());

            Thread.sleep(100);
            System.out.println("thread state(after 0.1sec) = " + thread.getState());

            synchronized (monitor) {
                monitor.notify();
            }

            Thread.sleep(100);
            System.out.println("thread state(after notify) = " + thread.getState());

            thread.join();
            System.out.println("thread state(after join) = " + thread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void checkThreadState3() {
        Object monitor = new Object();
        StateThread thread = new StateThread(monitor);
        StateThread thread2 = new StateThread(monitor);
        try {
            System.out.println("thread state = " + thread.getState());
            thread.start();
            thread2.start();
            System.out.println("thread state(after start) = " + thread.getState());

            Thread.sleep(100);
            System.out.println("thread state(after 0.1sec) = " + thread.getState());

            synchronized (monitor) {
                monitor.notify();
            }

            Thread.sleep(100);
            System.out.println("thread state(after notify) = " + thread.getState());

            thread.join();
            System.out.println("thread state(after join) = " + thread.getState());
            thread.join();
            System.out.println("thrdad2 state(after join)= " + thread2.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}