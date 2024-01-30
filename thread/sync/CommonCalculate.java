package thread.sync;

public class CommonCalculate {
    private int amount;
    private int interest;
    final Object amountLock = new Object();

    final Object interestLock = new Object();
    public CommonCalculate() {
        amount = 0;
        interest = 0;
    }

    public void plus(int value) {
        synchronized (amountLock) {
            amount += value;
        }
    }

    public void addInterest(int value) {
        synchronized (interestLock) {
            interest += value;
        }
    }

    public void minus(int value) {
        synchronized (amountLock) {
            amount -= value;
        }
    }

    public int getAmount() {
        return amount;
    }
}
