package com.swt.ultil;

import com.swt.ultil.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        verifyFactorialGivenRightArg1RunsWell();
        verifyFactorialGivenRightArgsRunsWell();

        // Test case #2: verify the getfactorial() with N = 1;


        // Test thử hàm tính giai thừa, gọi trong main()
        // muốn test gì đó phải có test case
        // Test case #1: verify the getfactorial() with N = 0;
        //step:
        //      given N=0
        //      Call getFactorial(N=0)
        // the mothod must return 1 as the result of of 0! = 1
        // status: passed | failed phải chớ


    }

    public static void verifyFactorialGivenRightArgsRunsWell() {
        System.out.println("3! expected: 24 "  + " actual: " + MathUtility.getFactorial(3));

    }

    public static void verifyFactorialGivenRightArg1RunsWell() {
        int n = 1;
        long expected = 1; // hy vọng 1 trả về 0!
        long actual = MathUtility.getFactorial(n);

        // test là so sánh
        System.out.println("0! expected: " + expected + " actual: " + actual);
    }

}
//    public static void verifyFactorialGivenRightArgORunsWell () {
//        int n = 0;
//        long expected = 1; // hy vọng 1 trả về 0!
//        long actual = MathUtility.getFactorial(n);
//
//        // test là so sánh
//        System.out.println("0! expected: " + expected + "actual: " + actual);
//    }
//}
// Kỹ thuật vừa gõ code, vừa gõ text, vừa gõ testcase được gọi là
// TDD ( đưa vào CV) TEST DRIVEN DEVELOPMENT