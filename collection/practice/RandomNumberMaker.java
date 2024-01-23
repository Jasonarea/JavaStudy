package collection.practice;

import java.util.HashSet;
import java.util.Random;

public class RandomNumberMaker {
    public static void main(String[] args) {
        RandomNumberMaker numberMaker = new RandomNumberMaker();
        for(int i = 0;i<10;i++) {
            HashSet<Integer> randomSet = new HashSet<>(numberMaker.getSixNumber());
            numberMaker.printSet(randomSet);
        }
    }

    public HashSet<Integer> getSixNumber() {
        Random random = new Random();
        int tempNumber;
        HashSet<Integer> set = new HashSet<>();
        while(set.size() < 6) {
            tempNumber = random.nextInt(45);
            set.add(tempNumber);
        }
        return set;
    }

    public void printSet(HashSet<Integer> set) {
        System.out.println(set);
    }
}
