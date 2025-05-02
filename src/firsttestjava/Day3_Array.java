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
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ" + i + ": ");
            arr[i] = input.nextInt();
        }

        // khởi tạo mảng
        System.out.print("Mảng ban đầu đã tạo: ");
        System.out.println(Arrays.toString(arr));

        //đảo ngược mảng
        System.out.print("Mảng sau khi đảo ngược: ");
        int temp = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));

        //sắp xếp mảng tăng dần
        System.out.print("Mảng sau khi sắp xếp tăng dần: ");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        //Tính tổng các phần tử trong mảng
        System.out.print("Tổng các phần tử trong mảng là: ");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
             sum += arr[i];
        }
        System.out.print(sum);
        System.out.println(" ");
    
        
        //Cho người dùng nhập 1 số bất kì 
        // kiểm tra số đó có trong mảng hay không
        // nếu có thì xuất ra vị trí index số đó trong mảng
        
        System.out.println("Nhập 1 số muốn kiểm tra: ");
        int x = input.nextInt();
        boolean flag = false;
        for(int i =0;i<arr.length;i++)
        {   
            if(arr[i]==x)
            {
               System.out.println("Số "+x+" có tồn tại trong mảng\nvà nằm ở index: "+i);
                flag=true;
                break;
            }
        }
        if(flag==false){
            System.out.println("Số "+x+" không có trong mảng");   
        }
    }
}
   

