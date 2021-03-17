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
public class bai7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap a[" + i + "]: ");
            a[i] = sc.nextInt();
        }

        //xuat SNT
        for (int i = 0; i < n; i++) {
            if (ktraSNT(a[i]) == true) {
                System.out.println("SNT la: " + a[i]);
            }
        }
    }

    public static boolean ktraSNT(int n) {
        if (n < 2) {
            return false;
        }
        int Check = (int) Math.sqrt(n);
        for (int i = 2; i <= Check; i++) {
            if (n % i == 0) {
                return true;
            }
        }
        return false;
    }

}
