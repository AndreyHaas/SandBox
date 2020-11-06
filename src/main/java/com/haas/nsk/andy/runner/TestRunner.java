package com.haas.nsk.andy.runner;

import com.haas.nsk.andy.AnnotationTestRunnerTest;
import com.haas.nsk.andy.AnnotationTestRunnerTestDouble;
import com.haas.nsk.andy.annotation.ExceptionTest;
import com.haas.nsk.andy.annotation.ExceptionTestContainer;
import com.haas.nsk.andy.annotation.TestMarker;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestRunner {
    public static void main(String[] args) {

        Class<?> testClass = AnnotationTestRunnerTest.class;
        run(testClass);

        testClass = AnnotationTestRunnerTestDouble.class;
        run(testClass);

    }

    public static void run(Class testClass) {
        int tests = 0;
        int passed = 0;
        for (Method method : testClass.getDeclaredMethods()) {

            if (method.isAnnotationPresent(TestMarker.class)) {
                tests++;

                try {
                    method.invoke(null);
                    passed++;
                } catch (InvocationTargetException wrappedExc) {
                    Throwable exc = wrappedExc.getCause();
                    System.out.println(method + " failed: " + exc);
                } catch (IllegalAccessException exc) {
                    System.out.println("Invalid @Test: " + method);
                }
            }

            if (method.isAnnotationPresent(ExceptionTest.class) || method.isAnnotationPresent(ExceptionTestContainer.class)) {
                tests++;
                try {
                    method.invoke(null);
                    System.out.printf("Test %s failed: no exception%n", method);
                } catch (Throwable wrappedExc) {
                    Throwable exc = wrappedExc.getCause();
                    int oldPassed = passed;
                    ExceptionTest[] excTests = method.getAnnotationsByType(ExceptionTest.class);

                    for (ExceptionTest excTest : excTests) {

                        if (excTest.value().isInstance(exc)) {
                            passed++;
                            break;
                        }
                    }

                    if (passed == oldPassed)
                        System.out.printf("Test %s failed: %s %n", method, exc);
                }
            }
        }

        System.out.printf("Passed: %d, Failed: %d%n",
                passed, tests - passed);
    }
}
