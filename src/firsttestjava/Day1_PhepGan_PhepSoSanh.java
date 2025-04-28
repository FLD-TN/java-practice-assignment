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
public class Day1_PhepGan_PhepSoSanh {

    public static void main(String args[]) {
        int x = 4;
        x += 5;
        System.out.println("Kết quả sau khi dùng x+=5 là :" + x);
        x -= 5;
        System.out.println("Kết quả sau khi dùng x-=5 là (x trước khi trừ là 9) :" + x);
        x *= 2;
        System.out.println("Kết quả sau khi dùng x*=2 là ( x trước khi nhân là 4) :" + x);
        x /= 2;
        System.out.println("Kết quả sau khi x/=2 là ( x trước khi chia lấy nguyên là 8) :" + x);
        x%=3;
        System.out.println("Kết quả sau khi x%=3 là ( x trước khi chia lấy dư là 4) :"+ x);
    }

}
