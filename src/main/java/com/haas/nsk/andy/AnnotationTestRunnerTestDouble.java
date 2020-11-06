package com.haas.nsk.andy;

import com.haas.nsk.andy.annotation.ExceptionTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnnotationTestRunnerTestDouble {
    @ExceptionTest(ArithmeticException.class)
    public static void m9() { // Test should pass
        int i = 0;
        i = i / i;
    }

    @ExceptionTest(ArrayIndexOutOfBoundsException.class)
    public static void m10() {
        int[] a = new int[0];
        int i = a[1];
    }

    @ExceptionTest(ArithmeticException.class)
    public static void m11() {
        int a = 1;
        int b = 0;
        int c = 1 / b;
    }

    @ExceptionTest(IndexOutOfBoundsException.class)
    @ExceptionTest(NullPointerException.class)
    public static void doublyBad() {
        List<String> list = new ArrayList<>();
        list.addAll(5, Collections.emptyList());
    }
}
