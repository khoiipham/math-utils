/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khoipham.mathutil;

/**
 *
 * @author PC
 */
public class MathUtility {
        //đây là class mô phỏng lại clas Math, chứa các hàm xài chung
    //hàm xài chung không lưu lại điều gì => static
    
    public static  final double PI = 3.14;
    
    
    //ham tinh n!
    //n! tang rat nhanh ve gia tri
    //21! tran kieu long, hon 18 so 0
    //bai nay ta tinh tu 0..20!. Am ko tinh duoc, 0! = 1
    public static long getFactorial(int n){
        
        if (n < 0 || n > 20)
            throw new IllegalArgumentException(" n must be between 0..20");
    
        //song xot đến đây thì n = 0,1,....20.
        
        //sửa code dùng đệ quy cho lẹ
        if (n == 0  || n == 1)
            return 1; //0! = 1! = 1 tính luôn cho nhanh
            return n * getFactorial( n - 1);
            //n! = n * (n-1)!
            //đệ quy, vòng lại chính mình với quy mô khác
            //recusion. Làm khéo nếu ko nó đi mãi mãi
            //STACKOVERFLOW
//        
//        long result = 1;//XANH LOCAL VÀ SERVER   //giả bộ bằng 0
//        
//        for (int i = 2; i <= n; i++) 
//            result *=  i;
//        
//        return result;// nhân từ  2 3 4 5 6 7 ....

    
    }
}
