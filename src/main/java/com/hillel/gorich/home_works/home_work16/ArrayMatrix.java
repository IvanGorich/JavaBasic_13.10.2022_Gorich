package com.hillel.gorich.home_works.home_work16;

// 1. Додайте метод, який буде рахувати середнє арифметичне елементів масиву.
// 2. Зробіть метод, який прийматиме на вхід двомірну матрицю (двовимірний масив) у та перевіряти чи є вона квадратною
// 3. В тестовому класі створіть тестову матрицю та передайте її в метод тестованого класу

public class ArrayMatrix {

    static int sumArrayElements = 0;
    static int averageArrayElements = 0;

    public static int getAverageArrayElements(int[] array) {

        if (array == null) {
            return -3;
        }
        if (array.length == 0) {
            return -2;
        }

        for (int i = 0; i < array.length; i++) {
            sumArrayElements += array[i];
        }
        averageArrayElements = ((sumArrayElements) / array.length);

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