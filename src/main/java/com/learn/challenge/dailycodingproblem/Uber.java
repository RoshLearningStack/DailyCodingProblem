package com.learn.challenge.dailycodingproblem;

public class Uber {

    public void run() {
        int[] userData = {1, 2, 3, 4};
        int[] result = getData(userData);

        for (int x = 0; x < result.length; x++) {
            System.out.println(result[x]);
        }
    }

    private int[] getData(int[] data) {
        int[] result = new int[data.length];
        if (data == null) {
            return result;
        }
        for (int i = 0; i < data.length; i++) {
            int value = 1;
            for (int j = 0; j < data.length; j++) {
                if (i != j) {
                    value *= data[j];
                }
            }
            result[i] = value;
        }
        return result;
    }

}