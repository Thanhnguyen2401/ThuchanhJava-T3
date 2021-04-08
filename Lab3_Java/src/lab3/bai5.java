/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;
public class bai5 {
  
    public static void main(String[] arrg){
        Scanner x = new Scanner(System.in);
        
        System.out.println("Nhập vào chuỗi ký tự bất kỳ: "); 
        String strInput = x.nextLine();
        String[] arrOfStr = strInput.split(" "); 
        int maxLength = 0;
        int index = 0;
        String result = "";
        for(int i=0; i< arrOfStr.length; i++) 
        {
            if(arrOfStr[i].length() >= maxLength)
            {
                maxLength = arrOfStr[i].length();
                index = i;
                result = arrOfStr[i]; 
            }
        }
        System.out.println("Độ dài xâu lớn nhất là: "+ maxLength + "\nGía trị chuỗi là: " + result + " \nTại vị trí thứ: "+index); 
    }
}
