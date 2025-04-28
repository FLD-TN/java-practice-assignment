/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firsttestjava;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Day2_Scanner_NhapDuLieuTuBanPhim {

    public static void main(String[] args) {
            BaiTapVeScanner baitap = new BaiTapVeScanner();
            baitap.Bai2();
            // hoặc nếu muốn gọn hơn thì gọi 
            // BaiTapVeScanner.Bai1() : NHƯNG PHẢI ĐỔI HÀM BAI1() về static
    }
}

class LyThuyet {

    public void LyThuyetVeScanner() {
        // Khởi tạo 1 đối tượng Scanner ( util của java )
        // scanner giúp nhập từ bàn phím
        Scanner input = new Scanner(System.in);

        // Nhập chuỗi
        System.out.println("Mời nhập Họ và Tên:");
        String name = input.nextLine().trim();
        System.out.println("Xin Chào:" + name);
        //Nhập số nguyên
        System.out.println("Nhập năm sinh: ");
        int year = input.nextInt();
        System.out.println("Tuổi của bạn là: " + (LocalDate.now().getYear() - year));

//        Nhập số thực
        System.out.println("Nhập số điểm của bạn: ");
        float x = input.nextFloat();
        input.nextLine();
        System.out.println("SỐ điểm là:" + x);
// Test lỗi chuõi
        System.out.println("Nhập chuỗi bất kì:");
        String random = input.nextLine();
        System.out.println("Chuỗi bất kì là:" + random);
    }

}

class BaiTapVeScanner {

    public void Bai1() {
        //Tính chu vi , diện tích hình tròn 
        // Viết ct Nhập từ bàn phím bán kính r của đường tròn ,in ra kết quả .
        // a) Chu Vi = ?
        // b) Diện tích = ?
        // Gợi Ý : Chu vi = 2*math.PI*r
        // dientich = math.PI*math.pow(r,2);

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập bán kính r: ");
        double bankinh = input.nextDouble();
        double chuvi = bankinh * 2 * Math.PI;
        double dientich = Math.PI * Math.pow(bankinh, 2);
        System.out.println("Chu Vi hình tròn là:" + chuvi);
        System.out.println("Diện tích hình tròn là:" + dientich);

    }
    
    public void Bai2()
    {
        //Tính chu vi diện tích hình chữ nhật
        // viết ct nhập vào 2 số thực dương a,b từ bàn phím
        //a, b là chiều dài và chiều rồng của hcn
        // in ra màn hình chu vi và diện tích của hcn đó 
        
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập Chiều dài của HCN: ");
        double a = input.nextDouble();
        System.out.println("Nhập chiều rộng của HCN: ");
        double b = input.nextDouble();
        double chuvi = (a+b)*2;
        double dientich=a*b;
        System.out.println("Chu Vi hcn là: "+chuvi);
        System.out.println("Diện tích hcn là: "+dientich);
        
        
        
        
    }
}
