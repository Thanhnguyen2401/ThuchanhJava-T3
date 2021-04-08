/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
public class bai8 {

    public static void main(String[] args) throws IOException {
        StringWriter ost = new StringWriter();
        String s = "Xin chào, đây là chương trình đọc xuất chuỗi";
        for(int i=0; i<s.length(); i++)
            ost.write(s.charAt(i));
        System.out.println("Xuất chuỗi: " + ost);
        StringReader inst;
        inst = new StringReader(ost.toString());
        int a= 0;
        @SuppressWarnings("StringBufferMayBeStringBuilder")
        StringBuffer sb1 = new StringBuffer("");
        while((a = inst.read()) != -1)
            sb1.append((char) a);
        s = sb1.toString();
        System.out.println("Chiều dài chuỗi đọc được: "+ s.length());
        System.out.println("Đây là chuỗi đọc được: " + s);
    }
}
