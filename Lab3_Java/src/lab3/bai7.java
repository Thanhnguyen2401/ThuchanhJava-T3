/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

public class bai7 {
    public static void main(String [] arg){
    int a[]={1,5,4,12,15};
    output(a,10);
    }  
    static int getPos(int i,int a[]){
        return a[i];
    }
    static void output(int a[], int n){
        try{
            for(int i=0; i< n; i++)
                System.out.print(getPos(i,a) + "\n");
        }
        catch(java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println("Vượt quá chỉ số mảng!");
        }
    }
    
}
