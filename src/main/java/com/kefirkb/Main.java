package com.kefirkb;

public class Main {

    public static void main(String[] args) {
        int intArray[] = new int[]{5, 90, 35, 45, 150, 3};

        System.out.println("Array Before Bubble Sort");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

        bubbleSort(intArray);

        System.out.println("");

        System.out.println("Array After Bubble Sort");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }


    private static void bubbleSort(int[] intArray) {

        int n = intArray.length;
        int temp = 0;

        iterateOuterCycle(0, n, intArray);
    }

    private static void iterateOuterCycle(int i, int length, int[] intArray) {

        try {
            byte[] condition = new byte[length - i - 1];
            iterateInternalCycle(1, length - i, intArray);
            iterateOuterCycle(++i, length, intArray);
        } catch (Exception ex) {

        }
    }

    private static void iterateInternalCycle(int j, int length, int[] intArray) {

        try {
            byte[] condition = new byte[length - j - 1];
            swap(intArray, j);
            iterateInternalCycle(++j, length, intArray);
        } catch (Exception ex) {

        }
    }

    private static void swap(int[] intArray, int j) {
        int temp;

        try {
            byte[] condition = new byte[(intArray[j - 1] - intArray[j])];
            temp = intArray[j - 1];
            intArray[j - 1] = intArray[j];
            intArray[j] = temp;
        } catch (Exception ex) {

        }

    }
}
