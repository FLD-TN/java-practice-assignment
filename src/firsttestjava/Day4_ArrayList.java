/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firsttestjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Day4_ArrayList {

    public static void main(String[] args) {
        LyThuyet lt = new LyThuyet();
//            lt.lyThuyet();
        BaiTapArrayList bt = new BaiTapArrayList();
        bt.Bai2();
    }

}

class BaiTapArrayList {

    Scanner input = new Scanner(System.in);

    public void Bai2() {
        //Viết ct tạo ra 1 list có n phần tử , n nhập từ bàn phím
        // các phần tử là số ngẫu nhiên từ 1 -> 100

        System.out.println("Nhập số phần tử của list: ");
        int n = input.nextInt();
        Random rd = new Random();
        ArrayList<Integer> arrList = new ArrayList();
        for(int i=0;i<n;i++)
        {
            int random = rd.nextInt(1,101);
            arrList.add(random);
        }
        System.out.println(arrList);

    }
}

class LyThuyet {

    public void lyThuyet() {
        // Nhược điểm của mảng 1 chiều là k thể thêm , sửa , xoá phần tử
        // ArrayList hỗ trợ việc đó
        //khai báo 1 list rỗng
        ArrayList<Integer> arrList1 = new ArrayList<>();

        //Khai báo 1 list với kích thước cho trước
        ArrayList<Integer> arrList2 = new ArrayList<>(5);

        //Khai báo 1 list với các pt cho trước
        ArrayList<Integer> arrList3 = new ArrayList<>(List.of(3, 12, 95, 52, 82));

        // Xuất list
        System.out.println(arrList1);
        System.out.println(arrList2);
        System.out.println(arrList3);

        // Thêm vào list giá trị 6 vào index 3
        arrList3.add(3, 6);
        System.out.println("List sau khi thêm 6 vào index 3 là: " + arrList3);
        System.out.println(" ");

        // Trả về giá trị cụ thể tại vị trí index 
        int temp = arrList3.get(4);
        System.out.println("Giá trị tại vị trí của index 4 là: " + temp);
        System.out.println(" ");

        // Trả về số phần tử của list
        int temp2 = arrList3.size();
        System.out.println("Số phần tử của list là: " + temp2);
        System.out.println(" ");

        // Xoá theo vị trí index chỉ định
        arrList3.remove(5);
        System.out.println("Mảng xoá khi xoá vị trí index 5 " + arrList3);
        System.out.println(" ");

        // Xoá giá trị cụ thể đầu tiên trong list
        arrList3.remove(Integer.valueOf(6));
        System.out.println("Mảng sau khi xoá số 6 " + arrList3);
        System.out.println(" ");

        // Đặt giá trị thay thế vào vị trí index chỉ định
        arrList3.set(3, 5);
        System.out.println("List sau khi thay giá trị ở index 3 thành số 5: " + arrList3);
        System.out.println(" ");

        //kiểm tra list có chứa phần tử nào đó hay k
        boolean temp3 = arrList3.contains(12);
        System.out.println("Kiểm tra list có contains số 12 hay không: " + temp3);
        System.out.println(" ");

        // Sắp xếp tăng dần
        Collections.sort(arrList3);
        System.out.println("List sau khi dùng Collections.sort để sx tăng dần: " + arrList3);
        System.out.println(" ");

        // Đảo ngược list
        Collections.reverse(arrList3);
        System.out.println("List sau khi đảo ngược bằng Collections.reverse: " + arrList3);
        System.out.println(" ");

        //kiểm tra list có rỗng k
        boolean temp4 = arrList3.isEmpty();
        System.out.println("List có rỗng không bằng hàm isEmpty: " + temp4);
        System.out.println(" ");

        // Xoá toàn bộ pt của list
        arrList3.clear();
        System.out.println(arrList3);
        System.out.println("Xoá arrList3 hoàn tất!!!!");
    }
}
