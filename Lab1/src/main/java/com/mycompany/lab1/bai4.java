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
import java.io.*;
import java.util.*;
public class bai4 {
    public static void main(String[] agrs) 
    {
    
        Scanner x=new Scanner(System.in);
        
        System.out.print("Nhap so A : ");
        int a=x.nextInt();
        System.out.print("Nhap so B : ");
        int b=x.nextInt();
        
        System.out.println("====================================");
        int tong = a+b;
        System.out.println("Tong  : "+tong);
        int hieu=a-b;
        System.out.println("Hieu  : "+hieu);
    }
    
    
}
