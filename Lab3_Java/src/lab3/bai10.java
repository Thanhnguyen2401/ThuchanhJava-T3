/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;


public class bai10 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        try {
            OutputStream os = new FileOutputStream("test.txt");

        os.write(("Copyright by Nguyen Duc Thanh - ").getBytes(Charset.forName("UTF-8")));
        os.write(("2021\n").getBytes(Charset.forName("UTF-8")));
        os.write(("http://thayphet.net").getBytes(Charset.forName("UTF-8")));
        os.close();

        InputStream is = new FileInputStream("test.txt");
        int size = is.available();

        for(int i = 0; i < size; i++) {
           System.out.print((char)is.read() + "");
        }
        is.close();
        } catch (IOException e) {
            System.out.print("File đã tồn tại");
        }
    }
}
