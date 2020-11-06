package com.haas.nsk.andy;

import com.haas.nsk.andy.annotation.ExceptionTest;
import com.haas.nsk.andy.annotation.TestMarker;

public class AnnotationTestRunnerTest {

    @TestMarker
    public static void m1() {
    }

    public static void m2() {
    }

    @TestMarker
    @ExceptionTest(RuntimeException.class)
    public static void m3() {
        throw new RuntimeException("Boom");
    }

    public static void m4() {
    }

    public static void m6() {
    }

    @TestMarker
    @ExceptionTest(RuntimeException.class)
    public static void m7() {
        throw new RuntimeException("Crash");
    }

    public static void m8() {
    }

    @TestMarker
    public void m5() {
    }
}
