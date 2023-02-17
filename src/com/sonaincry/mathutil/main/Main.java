/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sonaincry.mathutil.main;

import com.sonaincry.mathutil.core.MathUtility;

/**
 *
 * @author Son
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        testFactorialGivenRightArgumentReturnsWell();
        testFactorialGivenWrongArgumentThrowsException();
        //Dân dev phải có trách nhiệm với những hàm/method mình viết ra, tức là đảm bảo rằng hàm chạy đúng như thiết kế
        //hàm getFactorial() được thiết kế rằng:
        //nếu đưa n < 0 hoặc n > 20 ném ra ngoại lệ
        //nếu đưa n = 0 ... 20 -> tính đúng n!
        //TA - Dân dev sẽ kiểm thử hàm đúng như thiết kế hay không
        //Kiểm thử - dùng thử - mô phỏng các tình huống - case
        //Hàm sẽ được dùng trong tương lai
        //Hàm sẽ được dùng theo 2 cách dựa theo thiết kế
        //Đưa data tử tế n từ 0...20
        //Đưa data cà chớn n < 20 hoặc n > 20
    }
    public static void testFactorialGivenRightArgumentReturnsWell(){
        //case 1: test getF() with n = 0
        //expected value: 1;
        //kiểm thử coi có đúng 0! = 1 hay không ? - 1 tình huống xài hàm
        int n = 0;
        long expectedValue = 1;
        long actualValue = MathUtility.getFactorial(n); //gọi hàm tính giai thừa, xem kết quả trả về, so sánh expected vs actual
        System.out.println("Test " + n + "!  expected: " + expectedValue
                                      + " | actual: " + actualValue);
        //case 2: test getF() with n = 1;
        //Expected value = 1
        //Kiểm tra xem 1! có đúng là 1 không?
        n = 1;
        expectedValue = 1;
        actualValue = MathUtility.getFactorial(n);
        System.out.println("Test " + n + "! expected: " + expectedValue
                                       + " | actual: " + actualValue);
        //case 3: test getF() with n = 2;
        System.out.println("Test 2! | expected: 2" + " | actual: " + MathUtility.getFactorial(2));
        //case 3: test getF() with n = 3;
        System.out.println("Test 2! | expected: 2" + " | actual: " + MathUtility.getFactorial(3));
        //case 4: test getF() with n = 5;
        System.out.println("Test 2! | expected: 2" + " | actual: " + MathUtility.getFactorial(5));
    }
    public static void testFactorialGivenWrongArgumentThrowsException(){
        //case 5: test getF() with n = -1;
        //expected value: an Illegal Argument Exception is thrown
        //nếu đưa n = -1 thì hàm sẽ đập vào mặt user/người xài
        //hàm 1 ngoại lệ
        System.out.println("Test -1! | expected: Illegal Argument Exception is thrown!!!"
                + " | actual : ???");
        MathUtility.getFactorial(-1);
    }    
    
}
