/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bai1 {
     private static Scanner scanner = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.print("Nhap he so bac 2, a = ");
       float a= bai1.scanner.nextFloat();
       System.out.print("Nhap he so bac 2, b = ");
       float b= bai1.scanner.nextFloat();
       System.out.print("Nhap he so bac 2, c = ");
       float c= bai1.scanner.nextFloat();
       bai1.GiaiPTB2(a,b,c);
    }
    public static void GiaiPTB2(float a, float b,float c)
    {
        if(a==0){
            if(b==0){
            System.out.print("Phuong trinh vo nghiem");
            }else{
                System.out.println("Pt co 1 nghiem : "+ "x = " + (-c/b));
            }
            return;
        }
        float delta = b*b -4*a*c;
        float x1;
        float x2;
        if(delta >0){
            x1= (float)((-b + Math.sqrt(delta))/(2*a));
            x2= (float)((-b - Math.sqrt(delta))/(2*a));
            System.out.println("Pt co 2 nghiem la : " + "x1 = " + x1 + "va x2 = " + x2);
        }else if (delta ==0){
            x1= (-b/(2*a));
            System.out.println("Pt co 1 nghiem la : "+ "x1 = x2 = " + x1);
        }else{
            System.out.println("Pt vo nghiem  ");
             }
        }
    }
