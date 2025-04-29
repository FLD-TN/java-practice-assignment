/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firsttestjava;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Day3_Array {

    public static void main(String[] args) {
        mang1Chieu Lt = new mang1Chieu();
        Lt.Bai1();
    }
}

class mang1Chieu {

    Scanner input = new Scanner(System.in);

    public void LyThuyet() {
        // 1. Cách khai báo mảng
        int[] arr1;
        boolean[] arr2;
        String[] arr3;

        // 2. Khởi tạo mảng đi kèm kích thước cho trước
        int[] arr4 = new int[15]; // Mảng arr4 chứa 15 phần tử
        String[] arr5 = new String[5]; // Mảng arr5 chứa 5 phần tử

        // 3. Khởi tạo mảng kèm giá trị ban đầu
        String[] arr6 = new String[]{"Trần Anh Duy", "HUFLIT"};
        String[] arr7 = {"Bà rịa- Vũng Tàu"};
        int[] arr8 = new int[]{12, 51, 2, 3, 0, 53, 23};
    }

    void Bai1() {

        System.out.println("Nhập số phần tử muốn khởi tạo mảng: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Nhập phần tử thứ"+i+": ");
            arr[i]=input.nextInt();
        }
        
        System.out.print("Mảng ban đầu đã tạo: ");
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        
        System.out.print("Mảng sau khi đảo ngược: ");
        int temp=0;
        for(int i =0;i<arr.length/2;i++)
        {
            temp = arr[i];
             arr[i]= arr[arr.length-1-i] ;
            arr[arr.length-1-i] = temp;
        }
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        

    }
}
