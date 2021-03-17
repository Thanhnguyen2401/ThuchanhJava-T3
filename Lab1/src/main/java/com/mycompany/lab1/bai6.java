/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab1;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class bai6 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = x.nextInt();
        if( n==2 ){
            System.out.println("2 la so nguyen to");
        }else
            System.out.println(n + " La so nguyen to ");
        
            System.out.println("cac so nguyen to nho hon");
        for (int i = 3; i < n; i+=2) {
            if(kiemTraSoNguyenTo(n)){
                System.out.println(" " + i);
            } else {
                System.out.println("khong la so nguyen to");
            }
        }
    }
    
    public static boolean kiemTraSoNguyenTo(int n){
        // < 2 khong phai la SNT
        boolean check = false;
        if( n <= 2){
            return check;
        } 
        //n > 2
        int aaa = (int) Math.sqrt(n);
        for (int i = 3; i <= aaa; i++) {
            if(n%i == 0) {
                return check = true;
            }
        }
        return check;
    }
}
