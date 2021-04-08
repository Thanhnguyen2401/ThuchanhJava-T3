/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;
public class bai2 {
 
    public static void main(String[] args) {
        int[] a;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = scanner.nextInt();
        a = new int[n];
        nhap(a,n);
        xuat(a,n);
        System.out.print("Cac so nguyen to la: ");
        for (int i=0;i<n;i++) {
            if (check(a[i])  )
                System.out.print(a[i] + " ");
        }
        System.out.println("");
        
        sapxep(a,n);
  
    }
    public static void nhap(int a[],int n){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap vao mang: ");
        for (int i=0;i<n;i++)
            a[i] = scanner.nextInt();
 
    }
    public static void xuat(int a[],int n){
      
    }
    public static boolean check(int n){
        if(n<=1) return false;
        for (int i = 2;i<= Math.sqrt(n); i++)
            if(n%i==0) return false;
        return true;
    }
 
    public static void sapxep(int a[],int n){
        for (int i =0;i<n;i++)
            for (int j=0;j<n-1;j++){
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
    }
}