/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sonaincry.mathutil.core;

/**
 *
 * @author Son
 */
public class MathUtility {
    
    public static final double PI = 3.1415;
    
    //21! vượt kiểu long - 18 con số 0
    //ta thí nghiệm hàm n! với n = 0...20 ->  đủ kiểu long
    //n! = 1 x 2 x 3 x ... x n
    // không có giai thừa âm
    //21! tràn long, do đó n chỉ áp dụng 0..20
    //0! = 1! = 1; quy ước 0! = 1
    public static long getFactorial(int n){
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0 to 20");
        if (n == 0 || n == 1)
            return 1;
        long product = 1;
        for (int i = 2; i <= n; i++) 
            product *=i;
        return product;        
    }
}
