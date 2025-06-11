package com.swt.ultil.mathutil.core;

public class MathUtility {

    // class này dùng để cung cấp các hàm tính toán toán học
    // bắt chước class math. trong jdk
    // vì những tính toàn này, tính xong rồi trả lại, ko cần kho lưu trữ lại
    // Do đó ta thiết kế dạng static


    // ta làm hàm tính N! =1,2,3,4,...N
     // quy ước:
    // 0! =1 ( của bên toán học)
    // ko có giai thừa số âm -5! ko hợp lệ
    // 20! vừa đủ kiểu long, 21! long ko dungf long dc
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0 and 20");
        }

        if (n == 0) {
            return 1;
        }

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i; // Nhân tích lũy
        }
        return result;
    }

}
