package com.example.demo.examples;

public class M1_Main_Equals {

    public static void main(String[] args) {
        int a = 1;
        Integer b = Integer.valueOf(1); // new Integer(1000);
        int c = 1;
        Integer d = Integer.valueOf(1); // new Integer(1000);

        // for 1: true, true, true
        // for 1000: true, true, false
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == d);
    }

}
