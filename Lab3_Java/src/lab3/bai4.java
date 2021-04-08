/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("Nhập vào 1 xâu: "); 
        String strInput = x.nextLine();
        String[] arrOfStr = strInput.split(" "); 
        String result = "";
        for (String a : arrOfStr) 
            result += (a.substring(0, 1).toUpperCase() + a.substring(1).toLowerCase()) + " "; 
        System.out.print("Kết quả in Hoa chữ cái đầu của xâu là: " + result);
    }
}
