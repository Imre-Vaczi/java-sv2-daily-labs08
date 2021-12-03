package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberSequence {

    private List<Integer> randomIntList = new ArrayList<>();

    public NumberSequence(List<Integer> inputNumberList) {
        this.randomIntList = inputNumberList;
    }

    public NumberSequence(int length, int lowerThreshold, int upperThreshold) {
        for (int i = 0; i < length; i++) {
            randomIntList.add(new Random().nextInt(lowerThreshold, upperThreshold + 1));
        }
    }

    public List<Integer> closeToAverage(int value) {
        List<Integer> result = new ArrayList<>();
        int avg = checkAverage();
        for (Integer i : randomIntList) {
            if (Math.abs(i - avg) <= value) {
                result.add(i);
            }
        }
        return result;
    }

    public List<Integer> getRandomIntList() {
        return randomIntList;
    }

    private int checkAverage() {
        int sum = 0;
        for (Integer i : randomIntList) {
            sum += i;
        }
        return sum / randomIntList.size();
    }
}
