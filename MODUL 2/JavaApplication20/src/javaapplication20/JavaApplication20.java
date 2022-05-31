/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class JavaApplication20 {
    public static void main(String[] args) {
        int a, b, y, bantu, hitung;
        System.out.println("masukan batas nilai : ");
        Scanner input = new Scanner (System.in);
        hitung = input.nextInt();
        bantu = (hitung*2);
        for (a=1; a<=bantu; a++){
            if (a==bantu){
                break;
            }
            for (b=1; b<=bantu; b++){
                System.out.print(b);
                if (a==b){
                    break;
                }
                else if ((a+b)==bantu){
                    break;
                }
            }
            System.out.print("\n");
            

        }
    }
    
}
