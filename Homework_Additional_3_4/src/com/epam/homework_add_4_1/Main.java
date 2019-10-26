package com.epam.homework_add_4_1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int size = 20;
        int[] array = createMatrix(size);
        System.out.print("Array         : ");
        printMatrix(array);
        int average = averageNumber(array);
        System.out.println("Average number = " + average);
        int elementsUpAverage = moreThanAverage(array, average);
        System.out.println("Elements > average " + elementsUpAverage);
    }

    public static int[] createMatrix(int size) {
        Random random = new Random();
        int[] matrix = new int [size];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = random.nextInt(60) - 10;
        }
        return matrix;
    }
    public static int[] printMatrix(int[] array) {
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + "  ");
        }
        System.out.println();
        return array;
    }
    public static int averageNumber(int[] array) {
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            average = average + array[i];
        }
        average = average / array.length;
        return average;
    }
    public static int moreThanAverage(int[] array, int average) {
        int elements = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > average) {
                elements++;
            }
        }
        return elements;
    }
}
