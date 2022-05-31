/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;
import java.util.Scanner;
public class JavaApplication15 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai akhir (a)          : ");
        int a = input.nextInt();
        int jumlah = 0;
        System.out.print("Masukkan selisih (b)              : ");
        int b = input.nextInt();
        System.out.print("Masukkan banyak barisan (n)       : ");
        int n = input.nextInt();
        
        //aritmatika
        System.out.print("\na. Seluruh bilangan aritmatika    : ");
        for (int i = n*b+(a-b); i>=a; i-=b) {
            System.out.print(i + " ");
            jumlah = jumlah + i;
        }
        System.out.println("\njumlah : " + jumlah);
        jumlah = 0;
        
        //genap
        System.out.print("\nb. Seluruh bilangan genap         : ");
        for (int x = n*b+(a-b); x>=a; x-=b) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
                jumlah = jumlah + x;
            }
        }
        System.out.println("\njumlah : " + jumlah);
        jumlah = 0;
        
        //ganjil
        System.out.print("\nc. Seluruh bilangan ganjil        : ");
        for (int x = n*b+(a-b); x>=a; x-=b) {
            if (x % 2 != 0) {
                System.out.print(x + " ");
                jumlah = jumlah + x;
            }
        }
        System.out.println("\njumlah : " + jumlah);
        jumlah = 0;
        
        //prima
        System.out.print("\nd. Seluruh bilangan prima         : ");
        for (int x = n*b+(a-b); x>=a; x--) {
            int hitung=0;
            for(int i =1; i<=n; i++){
                int simpan = x%i;
                if (simpan==0){
                    hitung++;
                }
            }
            if (hitung == 2) {

                System.out.print(x+" ");
                jumlah=jumlah+x;
            }
        }
        System.out.print("\njumlah : "+jumlah);
        int k,l,r;

        jumlah=0;
        System.out.println();
        System.out.print("\ne. Seluruh bilangan fibonacci     : ");
        for(int x = a+(n-1)*b; x>=a; x-=b){
            k=0;
            l=1;
            if(x==1 || x==0){
                System.out.print(x+ " ");
            }
            for (int i=x; i>=0; i--){
                r=k+l;
                k=l;
                l=r;
                if (r==x){
                    System.out.print(r+ " ");
                    jumlah=jumlah+x;

                }
            }
        }
        if (a==1){
            jumlah=jumlah+a;
            System.out.println("\njumlah : " +jumlah );
        }
        jumlah=0;
        
        //segitiga
        System.out.print("\nf. Seluruh bilangan segitiga      : ");
        for(int x = a+(n-1)*b; x>=a; x-=b){
            r = (x*(x+1))/2;
            for (int i=n; i>=a; i--){
                if (r==i){
                    System.out.print(r+ " ");
                    jumlah=jumlah+r;

                }
            } r=0;

        }
        System.out.println("\njumlah : "+jumlah);
        
       /*Scanner input = new Scanner(System.in);
       System.out.print("masukkan tahun ");
        
       int angka = input.nextInt();
       int jumlah=0;
       for (int i = 1; i <= angka; i++) {
            int hitung = 0;
                    
            for (int x=1; x <=i; x++){
                int simpan =i%x;
                if (simpan==0){
                    hitung++;
                }
            }
 
            if(hitung==2){
                jumlah=jumlah+7;
                System.out.println("air laut naik dalam " + i 
                + " tahun " +jumlah );
            }
            else {
                jumlah=jumlah+5;
                System.out.println("air laut naik dalam " + i 
                + " tahun " +jumlah );
            }
        }
        System.out.println("kenaikan air laut selama "+angka+ 
        " tahun : "+jumlah);
*/
    }
    
}
