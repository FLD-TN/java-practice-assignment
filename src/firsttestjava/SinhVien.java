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
public class SinhVien {
    Scanner input = new Scanner(System.in);
    
    // Khai báo thuộc tính
    private String hoTen;
    private int tuoi;
    
    //constructer
    
    public SinhVien()
    {
        hoTen = "Vô Danh";
        tuoi = 0;
    }
    
    public SinhVien(String hoTen , int tuoi)
    {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }
    
    
    public void NhapThongTin()
    {
        System.out.println("Nhập họ tên: ");
        hoTen = input.nextLine();
        System.out.println("Nhập tuổi: ");
        tuoi = input.nextInt();
    }
    
    public void InRaThongTin()
    {
        System.out.println(hoTen+" "+tuoi);
    }
    
    
}
