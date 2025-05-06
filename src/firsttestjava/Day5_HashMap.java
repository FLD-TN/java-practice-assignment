/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firsttestjava;

import java.util.HashMap;
import java.util.Scanner; 
        /**
         *
         * @author Admin
         */

public class Day5_HashMap {

    public static void main(String[] args) {
       
      BaiTap bt = new BaiTap();
      bt.Bai32();
    }
}

class BaiTap {

    HashMap<String, String> dict = new HashMap<>();
    Scanner input = new Scanner(System.in);

    public void Bai32() {

        // viết ct sử dụng dict chứa 10 username và password
        // ct yêu cầu nhập vào username và password
        // . Nếu username k có trong dict , ct báo username k tồn tại 
        // . nếu username đúng mà password sai thì báo : PASSWORD SAI 
        // . nếu username và password đúng thì login thành công
        dict.put("user1", "666666");
        dict.put("user2", "666666");
        dict.put("user3", "666666");
        dict.put("user4", "666666");
        dict.put("user5", "666666");
        dict.put("user6", "666666");
        dict.put("user7", "666666");
        dict.put("user8", "666666");
        dict.put("user9", "666666");
        dict.put("user10", "666666");

            System.out.println("Nhập username: ");
            String username = input.nextLine();
            System.out.println("Nhập password: ");
            String password = input.nextLine();
            if(!dict.containsKey(username))
            {
                System.out.println("username không tồn tại !");
            }
            else if (!dict.containsValue(password)){
                System.out.println("password sai !");
            }
            else{
                System.out.println("Đăng Nhập Thành Công");
            }

    }
}
