package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        
        System.out.print("Hello World");
        System.out.println("java");

        var text = "Planet";
        var year = 2020;
        System.out.println("year = " + year);
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("HelloWorld.main");
        System.out.println("text = " + text);
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }
        for (int j = 0; j < 3; j++) {
            System.out.println("j = " + j);
        }




    }

    public static final int staticfeld = 100;


}
