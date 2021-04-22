package ru.geekbrains.homework14;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    public int[] createArray(int[] arr) throws RuntimeException {
        int rem = 0;
        boolean contains = IntStream.of(arr).anyMatch(x -> x == 4);
        if (contains) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 4) {
                    rem = i;
                }
            }
        } else {
            throw new RuntimeException();
        }
        int[] newArray = new int[arr.length - rem - 1];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = arr[rem+1+i];
        }
        return newArray;
    }

    public boolean doesItContains (int[] arr) {
        boolean contains = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4 || arr[i] == 1) {
                contains = true;
            } else {
                return contains = false;
            }
        }
        return contains;
    }

}
