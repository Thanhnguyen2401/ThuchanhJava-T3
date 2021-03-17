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
public class bai3 {
    public static void main(String[] args)
    {
        //ma so sinh vien
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien : ");
        String masv = x.nextLine();
        
        //ho ten sv
        System.out.print("Nhap ho ten : ");
        String hoten=x.nextLine();
        
        //tuoi
        System.out.print("nhap tuoi : ");
        Byte tuoi=x.nextByte();
        //nam sinh
        System.out.print("Nhap nam sinh :");
        Double namsinh=x.nextDouble();
        //Diem trung binh
        System.out.print("Nhap dtb : ");
        Double dtb=x.nextDouble();
        
        System.out.println(" Ten : "+ hoten+ 
                           "Diem : "+ dtb+"diem");
        
    }
}