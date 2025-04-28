/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firsttestjava;

/**
 *
 * @author Admin
 */
public class Day2_ToanTuLogic_TienToHauTo {

    public static void main(String[] args) {
// toán tử logic
// && : Và : khi cả 2 điều kiện đều đúng 
// || : Hoặc : 1 trong 2 vế đúng , k nhất thiết đúng cả 2
// ! : phủ định : ngược lại của vế được đặt dấu phủ định
        int i = 10;
        System.out.println(i > 12 && i < 11); // cả 2 dk phải đúng thì mới trả về true
        System.out.println(i > 2 || i < 10); // 1 dk đúng -> true
        System.out.println(!(i > 2 || i < 10)); // phủ dinh của true -> false

// Tiền tố hậu tố
// b++ : là dùng giá trị của i trước rồi mới cộng
// ++b : tăng giá trị i lên và dùng giá trị đó
        int a = 1;
        int b = 2;
        int c = a++ - ++b + 1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
