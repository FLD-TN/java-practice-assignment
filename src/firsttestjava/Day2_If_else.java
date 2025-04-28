/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firsttestjava;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Day2_If_else {

    public static void main(String[] args) {

        BaiTap baiTap = new BaiTap();
        baiTap.Bai6();
    }
}

class BaiTap {

    Scanner input = new Scanner(System.in);

    public boolean checkYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public void Bai1() {

        //Tìm x ,y khi biết tổng và hiệu của chúng
        //case test : Tong=14 , hieu=4 =>x=9,y=5
        // case2 : Tong=8, hieu = 5 => x=6,5,  y 1.5
        // gợi ý :  x+y=14 , x-y=4
        System.out.println("Nhập Tổng x,y: ");
        double tong = input.nextDouble();
        System.out.println("Nhập Hiệu x,y: ");
        double hieu = input.nextDouble();

        double x, y;
        x = (tong + hieu) / 2;
        y = tong - x; // y = x-hieu
        System.out.println("x là :" + x);
        System.out.println("y là :" + y);

    }

    public void Bai2() {

        //Viết ct nhập vào chiều cao , cân nặng , tính BMI và xuất ra thông báo
        //BMI<15: Thân hình quá gầy
        //BMI>=15 and BMI<16: Thân hình gầy
        //BMI>=16 and BMI<18.5: Thân hình hơi gầy
        //BMI>=18.5 and BMI<25:Thân hình bình thường 
        //BMI>=25 and BMI < 30:Thân hình hơi béo
        //BMI >=30 and BMI<35:Thân hình béo
        //BMI >=35:Thân hình quá béo
        //Gợi ý cách tính : BMI=canNang/(chieuCao ^2 )
        System.out.println(" Nhập chiều cao (m): ");
        double height = input.nextDouble();
        System.out.println(" Nhập cân nặng (kg): ");
        double weight = input.nextDouble();
        double BMI = (weight / (Math.pow(height, 2)));
        System.out.println("BMI của bạn là: " + BMI);

        if (BMI < 15) {
            System.out.println("Quá gầy !");
        } else if (BMI >= 15 && BMI < 16) {
            System.out.println("Gầy !");
        } else if (BMI >= 16 && BMI < 18.5) {
            System.out.println("hơi gầy !");
        } else if (BMI >= 18.5 && BMI < 25) {
            System.out.println("bình thường !");
        } else if (BMI >= 25 && BMI < 30) {
            System.out.println("hơi béo !");
        } else if (BMI >= 30 && BMI < 35) {
            System.out.println("béo!");
        } else {
            System.out.println("Quá béo");
        }
    }

    public void Bai3() {
        //Viết chương trình nhập vào 1 năm dương lịch, kiểm tra năm đó có phải năm nhuận hay không .
        //Gợi ý : Năm nhuận là năm
        //(chia hết cho 4, và không chia hết cho 100) hoặc ( chia hết cho 400)
        //=((nam %4 ==0) && (nam %100 !=0)) | | ( nam %400 ==0)
        //Case test:
        //Năm nhuận : 2004, 2008, 2012, 2016, 2020, 2024
        //Năm không nhuận : 1900, 2005   

        System.out.println("Nhập năm bất kì > 0: ");
        int year = input.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(String.format("Năm %d là năm nhuần", year));
        } else {
            System.out.printf("Năm %d là năm không nhuận", year);
        }

    }

    public void Bai4() {

        System.out.println("Nhập vào 1 tháng bất kì trong năm: ");
        int month = input.nextInt();
        while (month > 12 || month < 0) {
            System.out.println("Vui lòng nhập vào 1 tháng từ 1->12: ");
            month = input.nextInt();
        }
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println(String.format("Tháng %d có 31 ngày", month));
        } else if (month == 2) {
            System.out.println("Nhập năm của tháng 2 đó: ");
            int year = input.nextInt();
            if (checkYear(year)) {
                System.out.println(String.format("Tháng %d có 29 ngày", month));
            } else {
                System.out.println(String.format("Tháng %d có 28 ngày", month));
            }
        } else {
            System.out.println(String.format("Tháng %d có 30 ngày", month));
        }
    }

    public void Bai5() {
        // Viết ct giải phương trình bậc 2
        // ax^2 + bx + c = 0

        System.out.println("Nhập a: ");
        int a = input.nextInt();
        System.out.println("Nhập b: ");
        int b = input.nextInt();
        System.out.println("Nhập c: ");
        int c = input.nextInt();

        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phương trình " +a+"x^2 +"+b+"x +"+c+"= 0 vô nghiệm");
        } else if (delta == 0) {
            double nghiemkep = -b / 2 * a;
            System.out.println("Phương trình " +a+"x^2 +"+b+"x +"+c+"= 0 có nghiệm kép x= "+ nghiemkep);
        } else {
            double nghiem1 = (-b + Math.sqrt(delta)) / 2*a ;
            double nghiem2 = (-b - Math.sqrt(delta)) / 2*a ;
            System.out.println("Phương trình " +a+"x^2 +"+b+"x +"+c+"= 0 có 2 nghiệm phân biệt: \nx1=" +nghiem1 +"\nx2="+ nghiem2);
        }

    }
    
    public void Bai6()
    {
        System.out.println(" Nhập tháng :");
        int month = input.nextInt();
        switch (month) {
            case 1,2,3:
                System.out.println("Quý 1");
                break;
            case 4,5,6:
                System.out.println("Quý 2");
                break;
            case 7,8,9:
                System.out.println("Quý 3");
                break;
            case 10,11,12:
                System.out.println("Quý 4");
                break;
            default:
                System.out.println("Nhập tháng tào lao à");;
        }
    }
        
}
