package com.home.efj.generics.listandarrays;

import java.util.ArrayList;
import java.util.List;

public class ListAndArraysTest {

    private ListAndArraysTest() {}

    public static void run() {
        Object[] objectArray = new Long[1];
        objectArray[0] = "s";

        List<Object> ol = new ArrayList<>(); // You can do = new ArrayList<Long>; will get incompatible types error.
        ol.add("s");
    }
}
