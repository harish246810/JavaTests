package com.arraysPractice;

import java.util.Arrays;

public class PushPopArray {

    public static void main(String[] args) {
        String[] items = new String[] {"a","b","c"};

        items = push(items, "d");
        items = push(items, "e");
        System.out.println(Arrays.toString(items)); // [a, b, c, d, e]

        items = pop(items);
        System.out.println(Arrays.toString(items)); // [a, b, c, d]
    }

    public static < T > T[] pop(T[] arr) {
        T[] tmp = Arrays.copyOf(arr, arr.length - 1);
        return tmp;
    }

    public static < T > T[] push(T[] arr, T item) {
        T[] tmp = Arrays.copyOf(arr, arr.length + 1);
        tmp[tmp.length - 1] = item;
        return tmp;
    }
}