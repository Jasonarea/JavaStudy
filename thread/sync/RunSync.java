package thread.sync;

public class RunSync {

    public static void main(String[] args) {
        RunSync runSync = new RunSync();
        for(int loop = 0; loop<5; loop++) {
            runSync.runCommonCalculate();
        }
    }

    public void runCommonCalculate() {
        CommonCalculate calc1 = new CommonCalculate();
        ModifyAmountThread thread1 = new ModifyAmountThread(calc1, true);
        CommonCalculate calc2 = new CommonCalculate();
        ModifyAmountThread thread2 = new ModifyAmountThread(calc2, true);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
            System.out.println("Final value is " + calc1.getAmount());
            System.out.println("Final value is " + calc2.getAmount());
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
