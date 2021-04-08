/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
public class bai11 {

    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("data.txt");
            os.write(("0.5 0.6 0.7 0.1 2.2").getBytes(Charset.forName("UTF-8")));
            os.close();

            InputStream is = new FileInputStream("data.txt");
            int size = is.available();
            float sum = 0;
            float average = 0;
            String result= "";
            for(int i = 0; i < size; i++) {
               result += ((char)is.read() + "");
            }
            System.out.print(result);
            String[] arrOfStr = result.split(" "); 
            for(int i=0; i< arrOfStr.length; i++)
            {
                sum += Float.parseFloat(arrOfStr[i]);
            }
            average = sum / arrOfStr.length;
            System.out.print("\nTổng chuỗi số thực là: "+ sum + "\nTrung bình cộng chuỗi số thực là: " + average);
           
            is.close();
            } 
        catch (IOException e) {
               System.out.print(e.toString());
        }
    }
}
