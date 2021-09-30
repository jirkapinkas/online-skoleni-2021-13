package com.example.demo.examples;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Fork;

public class M3_Main_Microbenchmarking_Right {

//    @Fork(value = 1, warmups = 1)
//    @Benchmark
//    // # Warmup Iteration   2: 33.934 ops/s
//    public void testMethod1() {
//        String string = "";
//        for (int i = 0; i < 10_000; i++) {
//            string += i;
//        }
//    }

//    @Fork(value = 1, warmups = 1)
//    @Benchmark
//    // # Warmup Iteration   2: 3329.772 ops/s
//    public void testMethod2() {
//        StringBuilder string = new StringBuilder();
//        for (int i = 0; i < 10_000; i++) {
//            string.append(i);
//        }
//    }

    @Fork(value = 1, warmups = 1)
    @Benchmark
    // # Warmup Iteration   2: 2414.268 ops/s
    public void testMethod3() {
        StringBuffer string = new StringBuffer();
        for (int i = 0; i < 10_000; i++) {
            string.append(i);
        }
    }

    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);
    }


}