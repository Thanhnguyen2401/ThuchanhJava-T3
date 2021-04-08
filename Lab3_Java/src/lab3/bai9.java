/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class bai9 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream os  = new FileOutputStream("abc.txt");
        String s = "Chao cac ban den voi chuong trinh doc xuat File";
        for(int i=0; i< s.length(); i++)
            os.write(s.charAt(i));
        
        FileInputStream is = new FileInputStream("abc.txt");
        int ibyts = is.available();
        System.out.println("File có tất cả " + ibyts + " ký tự.");
        byte charList[] = new byte[ibyts];
        int maxlength = is.read(charList, 0 ,ibyts);
        System.out.print("\nTổng số ký tự có được là: " + maxlength);
        System.out.print("\nChuỗi ký tự là: " + new String(charList) + "\n");
        File f1 = new File("abc.txt");
        f1.delete();
    }
}
