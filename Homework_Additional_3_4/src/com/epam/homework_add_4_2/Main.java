package com.epam.homework_add_4_2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int size1 = 20;
        int[] array1 = createMatrix(size1);
        int size2 = 10;
        int[] array2 = createMatrix(size2);
        System.out.print("Array1         : ");
        printMatrix(array1);
        System.out.print("Array2         : ");
        printMatrix(array2);
        int[] arrayConcat = createConcat(array1, array2);
        System.out.print("Array Concat   : ");
        printMatrix(arrayConcat);
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
    public static int[] createConcat(int[] array1, int[] array2) {
        int[] arrayConcat = new int [array1.length + array2.length];
        int j = 0;
        for (int i = 0; i < array1.length; i++) {
            arrayConcat[j] = array1[i];
            j++;
        }
        for (int i = 0; i < array2.length; i++) {
            arrayConcat[j] = array2[i];
            j++;
        }
        return arrayConcat;
    }
}
