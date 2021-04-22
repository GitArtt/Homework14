package ru.geekbrains.homework14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main;

    @BeforeEach
    void init() {
        main = new Main();
    }

//    @CsvSource({
//        "{1,7},{1, 2, 4, 4, 2, 3, 4, 1, 7}",
//        "{3,2,1,7},{1, 2, 5, 1, 2, 3, 2, 1, 7}",
//        "{5,7},{1, 2, 3, 4, 2, 3, 2, 5, 6}",
//        "{},{1, 2, 4, 4, 2, 3, 4, 4, 4}"
//    })
    @CsvFileSource(files = {"tests/add_test.csv"})
    @ParameterizedTest
    void massTest(int[] arr1, int[] arr2) {
        Assertions.assertArrayEquals(arr1, main.createArray(arr2));
    }

    @Test
    void createArrayTest() {
        int[] arr1 = {1, 7};
        int[] arr2 = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        Assertions.assertArrayEquals(arr1, main.createArray(arr2));
    }

    @CsvSource({
        "{1, 1, 1, 4, 4, 1, 4, 4}",
        "{1, 1, 1, 1, 1, 1}",
        "{4, 4, 4, 4}",
        "{1, 4, 4, 1, 1, 4, 3}",
    })
    @ParameterizedTest
    void doesItContainsMass(int[] arr) {
        Assertions.assertTrue(main.doesItContains(arr));
    }

    @Test
    void doesItContains() {
        int[] arr = {1, 1, 1, 4, 4, 1, 4, 4};
        Assertions.assertTrue(main.doesItContains(arr));
    }
}