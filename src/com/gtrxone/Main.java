package com.gtrxone;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(10, 50));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first >= 10 && second >= 10) {
            int divisor = 1;
            for (int i = 1; (i <= first || i <= second); i++) {
                if (first % i == 0 && second % i == 0) {
                    divisor = i;
                }
                System.out.println("Looping " + i);
            }
            return divisor;
        }
        return -1;
    }
}
