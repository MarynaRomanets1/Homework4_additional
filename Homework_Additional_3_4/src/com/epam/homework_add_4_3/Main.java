package com.epam.homework_add_4_3;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        int size = 20;
        int[] array = createMatrix(size);
        System.out.print("Array         : ");
        printMatrix(array);
        int min = arrayMin(array);
        System.out.println("Min = " + min);
        int max = arrayMax(array);
        System.out.println("Max = " + max);
        int dublic = findDublic(array, min, max);
        System.out.println("Dublicate = " + dublic);
        int[] arrayDublicOut = new int [size - dublic];
        arrayDublicOut = arrayDublicOff(array, min, max, dublic);
        System.out.println("Array without Dublicate : ");
        printMatrix(arrayDublicOut);
    }

    public static int[] createMatrix(int size) {
        Random random = new Random();
        int[] matrix = new int [size];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = random.nextInt(15) - 2;
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
    public static int arrayMin(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    public static int arrayMax(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static int findDublic(int[] array, int min, int max) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                count++;
            }
            if (array[i] == min) {
                count++;
            }
        }
        count = count - 2;
        return count;
    }
    public static int[] arrayDublicOff(int[] array, int min, int max, int dublic) {
        int countMin = 0;
        int countMax = 0;
        int[] arrayDublicOut = new int[array.length - dublic];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] != min) && (array[i] != max)) {
                arrayDublicOut[j] = array[i];
                j++;
            }
            else {
                if ((array[i] == min) && (countMin == 0)) {
                    arrayDublicOut[j] = array[i];
                    j++;
                    countMin++;
                }
                if ((array[i] == max) && (countMax == 0))
                {
                    arrayDublicOut[j] = array[i];
                    j++;
                    countMax++;
                }
            }
        }
        return arrayDublicOut;
    }
}
