package exception;

public class FinallySample {
    public static void main(String[] args) {
        FinallySample sample = new FinallySample();
        sample.fianllySample();
    }

    public void fianllySample() {
        int[] intArray = new int[5];
        try {
            System.out.println(intArray[4]);
        } catch(Exception e) {
            System.out.println(intArray.length);
        } finally {
            System.out.println("Here is Finally");
        }
        System.out.println("This code must run");
    }
}
