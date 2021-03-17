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
public class bai5 {
    
    public static void main(String[] agrs)
    {
        Scanner x=new Scanner(System.in);
        
        System.out.print("Nhap nguyen A : ");
        int a=x.nextInt();
        System.out.print("Nhap nguyen B : ");
        int b=x.nextInt();
        
        System.out.println("UCLN cua a va b : "+UCLN(a,b));
        System.out.println("BCNN cua a va b : "+BCNN(a,b));
    }
        public static int UCLN(int a, int b)
        {
            if(b==0)
            return a;
        else
            return UCLN(b, a % b);
        }
        public static int BCNN(int a, int b)
        {
           return (a*b)/ UCLN(a,b);
        }
    
}
