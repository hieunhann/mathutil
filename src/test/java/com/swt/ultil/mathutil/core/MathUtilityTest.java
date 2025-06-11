package com.swt.ultil.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    @Test // là hàm main(), trong code để trong hàm này sẽ run nhưn hàm main()
    // biến mỗi testcase thành testrun, thành main
  public void  verifyFactorialGivenRightArg1RunsWell() {
        assertEquals(1, MathUtility.getFactorial(1));
    }
}