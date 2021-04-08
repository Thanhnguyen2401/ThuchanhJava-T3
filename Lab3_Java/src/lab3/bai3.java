/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;

public class bai3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bài 3: \nNhập m dòng: ");
        int m = scanner.nextInt();
        System.out.print("Nhập n cột: ");
        int n = scanner.nextInt();
        if(n <= 0 || m <= 0)
            System.out.print("N bị sai!");
        else
        {
            int a[][] = new int[m][n];
            System.out.print("Danh sách mảng hai chiều sinh ngẫu nhiên là:\n");
            for(int i=0; i<m; i++)
            {
                for(int j=0; j< n; j++)
                {
                    a[i][j] = (int)(Math.random()*100);
                    System.out.print(a[i][j]+ " ");
                }
                System.out.print("\n");
            }
            System.out.print("Nhập hàng thứ k muốn tính tổng: ");
            int k = scanner.nextInt();
            if(!(k-1>=0 && k-1<m))
                System.out.print("Giá trị k bị sai");
            else{
                long tong = 0;
                for(int j=0; j< n; j++)
                    tong+= a[k-1][j];
                System.out.print("Kết quả tổng tại dòng k là: "+tong);
            }
            System.out.print("\n");
        }
        
    }
    public boolean KtSoNguyenTo(int n){
        for(int i=2; i<=n/2; i++)
            if(n%i==0)
                return false;
        return true;
    }
}
