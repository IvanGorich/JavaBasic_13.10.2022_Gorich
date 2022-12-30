package com.hillel.gorich.home_works.home_work16;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayMatrixTest {

    static int[] array;
    static int[][] matrix;

    @BeforeAll
    public static void beforeAll() {
        array = new int[]{1, 2, 3, 4, 5};
        matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    }

    @Test
    public void Test1() {
        int avg = ArrayMatrix.getAverageArrayElements(array);
        assertEquals(3, avg);
    }

    @Test
    public void Test2() {
        int[] array = null;
        int nothing = ArrayMatrix.getAverageArrayElements(array);
        assertTrue(nothing == -3);
    }

    @Test
    public void Test3() {
        int[] array = {};
        int empty = ArrayMatrix.getAverageArrayElements(array);
        assertTrue(empty == -2);
    }

    @Test
    public void Test4() {
        boolean quadro = ArrayMatrix.isQuadratic(matrix);
        assertTrue(quadro);
    }

    @Test
    public void Test5() {
        boolean exi = ArrayMatrix.isQuadratic(matrix);
        assertEquals(true, exi);
    }

    @Test
    public void Test6() {
        int[][] matrix = {};
        boolean empt = ArrayMatrix.isQuadratic(matrix);
        assertEquals(false, empt);
    }

    @Test
    public void Test7() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        boolean isNot = ArrayMatrix.isQuadratic(matrix);
        assertFalse(isNot);
    }

    @Test
    public void Test8() {
        int [][] matrix = null;
        boolean exists = ArrayMatrix.isQuadratic(matrix);
        assertFalse(exists);
    }

    @AfterAll
    public static void afterAll() {
        array = null;
        matrix = null;
    }
}
