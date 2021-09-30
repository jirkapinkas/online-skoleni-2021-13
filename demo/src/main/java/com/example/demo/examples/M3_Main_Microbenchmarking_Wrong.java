package com.example.demo.examples;

public class M3_Main_Microbenchmarking_Wrong {

    public static void main(String[] args) {
        // you sholdn't use this approach!!!
        long millis = System.currentTimeMillis();
        String string = "";
        for (int i = 0; i < 10_000; i++) {
            string += i;
        }
        System.out.println("operation took: " + (System.currentTimeMillis() - millis) + " ms");
    }

}
