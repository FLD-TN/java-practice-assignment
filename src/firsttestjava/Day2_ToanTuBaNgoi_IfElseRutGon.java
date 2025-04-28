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
public class Day2_ToanTuBaNgoi_IfElseRutGon {

    public static void main(String[] args) {
        // cấu trúc if-else rút gọn như sau
//         System.out.println("Nhập i: ");
//         int i = input.nextInt();
//         String traloi = (i%2==0) ? "chẵn" : "lẻ";
//         System.out.println(traloi);
        baiTap BT = new baiTap();
        BT.Bai1();
    }
}

class baiTap {

    Scanner input = new Scanner(System.in);

    public void Bai1() {
        System.out.println("Nhập điểm TB: ");
        double score = input.nextDouble();
        String xeploai = ((score >= 8) && (score <= 10))
                ? "Giỏi" : ((score < 8) && (score >= 6.5))
                        ? "Khá" : ((score < 6.5) && (score >= 5))
                                ? "Trung bình" : "Yếu";

        System.out.println(xeploai);
    }
}
