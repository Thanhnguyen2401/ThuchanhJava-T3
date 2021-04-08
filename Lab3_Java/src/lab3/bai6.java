/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.swing.JOptionPane;

public class bai6 {

    public static void main(String[] arg) {
        int n;
        try {
           n = Integer.parseInt(JOptionPane.showInputDialog(null, "Nhập số nguyên: ",""));
        }
        catch(java.lang.NumberFormatException e1){
            System.out.println(e1.toString());
        }
        finally{
            System.out.println("Gioi");
        }
    }
    
}
