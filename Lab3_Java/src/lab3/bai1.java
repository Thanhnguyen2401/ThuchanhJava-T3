/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import static java.lang.Math.sqrt;
import java.util.Scanner;






public class JavaApplication1 {
    public static void main(String[] args) {
        int a, b, c;
        float x1, x2, detail;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Nhap a= ");
        a = scan.nextInt();
        
        System.out.println("Nhap b= ");
        b = scan.nextInt();
        
        System.out.println("Nhap c= ");
        c = scan.nextInt();
        
        detail = (b*b - (4*a*c))/(2*a);
        if (detail<0) {
            System.out.println("PT  vo nghiem");
        } else if(detail==0) {
            x1=x2= (-b/(2*a));
            System.out.println("PT co nghiem kep x1 = x2= " + x1);
        }
        else {
            x1 = (float) ((-b + sqrt(detail))/(2*a));
            x2 = (float) ((-b - sqrt(detail))/(2*a));
            System.out.println("PT co 2 nghiem x1 = " + x1 + "x2 = " + x2);
        } 
                
            
    } 
}


