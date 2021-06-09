package com.company;

public class Main {

    public static void main(String[] args) {
        double[] numbers = {33.4, 6.8, 29.15, -5.7, 98.4, 0.5, 67.8, 26.8, 9.78, 2.3, 45.6, 8.9, 8.5, 66.8, 6.4};
        double result = 0.0;
        int positiveNum = 0;
        boolean isNegative = false;
        for (double inNumbers : numbers) {
            if (inNumbers < 0) {
                isNegative = true;
            } else if (isNegative) {
                result += inNumbers;
                positiveNum++;
            }

            System.out.println(result / positiveNum);

        }
        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (numbers[i] > numbers[i + 1]) ;
                double tip = numbers[j];
                numbers[j] = numbers[j + 1];
                numbers[j + 1] = tip;
            }
        }
        System.out.println(numbers);
    }
}