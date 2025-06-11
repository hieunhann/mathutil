package com.swt.ultil.mathutil.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilitDDTTest {


    // CHUẨN BỊ BỌO DATA ĐỂ RIÊNG -DD - DATA DRIVEN
    // LÁI MỚI FILL VÀO HÀM SO SÁNH T TESTING
    // FILL VÀO QUA THAM SỐ HAMF -HÀM LÀM VIỆC VỚI NHÌU DATA
    // DTT CÒN LÀ TÊN KHÁC: PARAMETERIZED TESTING --> KIỂM THỬ THEO KIỂU THGAM SỐ QUÁ

    // BỘ DATA NẰM TRONG HÀM STATIC - TÍNH MỘT CHỖ ĐỂ CÁC NƠI VÀO LẤY
    // BỘ DATA - THƯƠNGBF LÀ MẢNG 2 CHIỀU, GIÁ TRỊ ĐẦU VÀO VÀ GIÁ TRỊ KÌ VỌNG
    public static Object[][] initData() {
        //  int[] a = {}
        return new Object[][]{
                {0,1},
                {1,1},
                {2,2},
                {3,6},
                {4,24},
                {5,120},
                {6, 720}};
    }
  @ParameterizedTest
  @MethodSource("initData")
    public void testFactorialGivenRightArgsRunWell(int n, long expected){
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}