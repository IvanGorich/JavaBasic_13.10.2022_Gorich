package com.hillel.gorich.home_works.home_work16;

public class ArrayMatrix {

    static int sumArrayElements = 0;
    static int averageArrayElements = 0;

    public static int getAverageArrayElements(int[] array) {

        if (array == null) {
            System.out.println("No such array exists");
            return -3;
        }
        if (array.length == 0) {
            System.out.println("This array is empty");
            return -2;
        }

        for (int i = 0; i < array.length; i++) {
            sumArrayElements += array[i];
        }
        System.out.println("Sum of Array Elements = " + sumArrayElements);
        averageArrayElements = ((sumArrayElements) / array.length);

        System.out.println("Average of Array Elements = " + averageArrayElements);
        return averageArrayElements;
    }

    public static boolean isQuadratic(int[][] matrix) {

        if (matrix == null) {
            System.out.println("No such matrix exists");
            return false;
        }
        if (matrix.length == 0) {
            System.out.println("This matrix is empty");
            return false;
        }
        for (int[] mat : matrix) {
            if (matrix.length != mat.length) {
                System.out.println("This matrix is not quadratic");
                return false;
            }
        }
        System.out.println("This matrix is quadratic");
        return true;
    }
}