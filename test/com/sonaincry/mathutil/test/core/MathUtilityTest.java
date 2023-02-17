/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sonaincry.mathutil.test.core;

import com.sonaincry.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author Son
 */
public class MathUtilityTest {
    
    //hàm getF() còn được thiết kế rằng: nếu đưa n cà chớn
    //tham số không đúng chuẩn, n < 0 | n > 20 thì hàm được thiết kế sẽ được sẽ ném ra ngoại lệ
    //tức là: nếu đưa n < 0, ví dụ n = -5 thì sẽ nhận về expected là exception
    // ta sẽ dùng junit để test xem có ném ra ngoại lệ như thiết kế hay không
    @Test(expected = Exception.class)
    public void testFactorialGivenWrongArgumentThrowsException(){
        //nguyên tắc kiểm thử: so sánh giữa expected vs actual
        //Test case #4: test getF() with n < 0
        //Expected: an Exception is thrown. In this case Illegal Argument Exception is thrownx
        //JUnit 4 không có hàm assert() Exception, JUnit 5 thì có
        MathUtility.getFactorial(-5);
        //nếu chỉ viết lệnh này đứng 1 mình thì có nghĩa là ta chưa bắt, chưa so sánh liệu rằng
        //có ngoại lệ như kì vọng hay không
        //xanh đỏ trong tình huống này không phản ánh ý nghĩa đúng vậy ta phải bắt xem ngoại lệ
        //đã có hay chưa
    }
    @Test   
    public void testRedGreenSignal(){
        Assert.assertEquals(6789, 6789);
    }
    @Test
    public void testFactorialGivenRightArgumentReturnsWell(){
        //Test case 1: test getF() with n = 0;
        //expected: 1
        //test hàm getF() với n = 0, hy vọng trả về 1. tức là 0! = 1
        int n = 0;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);
        Assert.assertEquals(expected, actual);
        //Test case 2: test getF() with n = 1
        //expected: 1
        //test hàm getF() với n = 1, hy vọng trả về 1, tức là 1! = 1
        Assert.assertEquals(1, MathUtility.getFactorial(1));
        //Test case 3: test getF() with n = 6
        //expected: 720, hy vọng 6! = 720
        Assert.assertEquals(720, MathUtility.getFactorial(6));
    }
    //viết kiểu assertequal (expected, actual)
    //lặp đi lặp lại -> code bốc mùi
    //nhược điểm đoạn code trên
    //trộn lẫn giữa lệnh so sánh và các data dùng để test
    //vì trộn lẫn nên ta khó nhìn hết đầy đủ các test case
    //nguyên lí nghịch lí thuốc trừ sâu có khả năng xuất hiện ta sex fix bằng 1 kỹ thuật mới
    //DDT - DATA DRIVEN TESTING
}
