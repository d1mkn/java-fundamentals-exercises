package com.bobocode.cs;

import java.util.Arrays;

class Run {

    public static void main(String[] args) {
        final int[] array = {3, 2, 6, 4, 1, 5, 8, 7, 9};

        System.out.println(Arrays.toString(array));
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void insertSort(int[] array) {
        final int length = array.length;

        for (int i = 1; i < length; i++) {
            final int curr = array[i];
            int j = i - 1;

            while (j >= 0 && curr < array[j]) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = curr;
        }
    }
}


