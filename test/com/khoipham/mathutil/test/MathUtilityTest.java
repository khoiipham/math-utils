/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khoipham.mathutil.test;

import com.khoipham.mathutil.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class MathUtilityTest {
    
    @Test //bien ham nay thanh main(), Shift-F6 de chay
    //goi ham getF() nhu thuong le, hay hon la tu dong ss gium
    //expected va actual coi co khop nhau hk?? co thay mau xanh
    //hk khop nhau thay mau do. Ta chi can nhin mau ma hk can mat cong
    //ss nua!!!!!!
    public void testFactorialRighArgumentRunsWell() {
        long expected = 120; //em muon biet 5! co dung la 120 hk?
        int n = 5;           //em dua 5 day a
        long actual = MathUtility.getFactorial(n); //tinh thiet coi
        //va so gium to luon
        assertEquals(expected, actual); //to chi thich den bao
        //giao thong hoy

        //TUI SẼ TEST TẤT CẢ CÁC TÌNH HUỐNG CÒN LẠI
        assertEquals(720, MathUtility.getFactorial(6));//6! có phải là 720 ko?
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(1, MathUtility.getFactorial(0));
        //0! là một tình huống cần phải test
        //1! cũng là một tình huống để test
        //6! cũng là một tính huống để test
        //TÌNH HUỐNG: LÀ TEST CASE. NGHỀ TESTER/QC LÀ NGHĨ RA CÁC TEST CASE
        //SAU ĐÓ THỬ NGHIỆM.
        
        
//        assertEquals(0, MathUtility.getFactorial(0));
        //kì vọng sai, nhưng tính thì đúng -> 1 màu đỏ, ko khớp
        //kì vọng đúng, tính sai -> 1 màu đỏ
        //tao hy vọng 5! là 120, mày tính ra mấy, hàm máy tính ra mấy?

//notes:equivalent partitioning kỹ thuật phân vùng tương đương
    }
    //ta test phần ngoại lệ - exception
    //exception là tình huống bất thường xảy ra trong app, trong code
    //khi thực thi. Nó ko phải là một value để có thể so sánh
    //Lỗi SQL trùng key, sai khóa ngoại, null trên cột yêu cầu khác null
    //đều là lỗi SQL, nhưng ko thể nói thằng nào bằng thằng nào?
    //Đối với exception, chỉ có thể đo nó bằng câu hỏi mày có xuất hiện ko
    //Ko được sử dụng assertEqual() so sánh coi có bằng nhau hay không?
    //Trong thiết kế của cái hàm getFactorial(), thì nếu đưa vào n< 0 hoặc
    //n> 20, thì hàm sẽ ném ra, sẽ new một ngoại lệ
    //cứ đưa n vi phạm, nhận về ngoại lệ
    //Vậy nếu có ngoại lệ xảy ra khi n đưa vào cà chớn < 0 > 21
    // có nghĩa là hàm chạy đúng, thấy ngoại lệ là mừng
    //VÌ CHẠY THEO THIẾT KẾ -> ĐÚNG NGOẠI LỆ TA CẦN NÓ XUẤT HIỆN -> MÀU XANH
    //SẼ CÓ TEST CASE: XEM NGOẠI LỆ CÓ XUẤT HIỆN HAY KO, CÓ -> XANH
    //                                              KO XH DỰ KIẾN -> ĐỎ

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgmentThrowsException() {
        MathUtility.getFactorial(30);// phải xuất hiện ngoại lệ
        MathUtility.getFactorial(-10);// phải xuất hiện ngoại lệ
        MathUtility.getFactorial(21);// phải xuất hiện ngoại lệ
        MathUtility.getFactorial(40);// phải xuất hiện ngoại lệ
        
        //nếu xh Exception như kì vọng, thì phải XANH
        //vì màu xanh here hàm ý rằng chạy như thiết kế
        //ném ngoại lệ khi đưa n cà chớn!!!

        //ta cần kĩ thuật để bắt ngoại lệ, nếu đúng ngoại lệ cần bắt xuất hiện
        //thì ta có XANH
    }

    //quy ước về màu xanh: NẾU TẤT CẢ CÁC LỜI GỌI HÀM getFuctorial()
    //đều trả ra giá trị đúng như kì vọng, nói cách khác tất cả các
    //hàm assertEqual() đều so sánh khớp expected vs actual
    //thì có màu xanh
    //XANH: KHI TẤT CẢ CÁC TÌNH HUỐNG TEST HÀM ĐỀU, ĐỀU CHẠY ĐÚNG
    //ĐỎ: chỉ cần 1 trong đám này sai, coi như ĐỎ CHO TÂT CẢ 
    //Lí do phía sau: ĐÃ TEST HÀM THÌ PHẢI ĐÚNG CHO CÁC TÌNH HUỐNG TEST,
    //ĐƯỢC ĐƯA RA...
    // ĐÃ TEST THÌ PHẢI ĐÚNG CHO CÁC TRƯỜNG HỢP
    //KO CHƠI TRÒ: hầu hết là đúng, lâu lâu mới sai...
    
}
