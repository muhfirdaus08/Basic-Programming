package inversmod;
import java.util.Scanner;
public class classname{
    static Scanner input = new Scanner(System.in);
    public static void main(String[]args){
        char ulangi;
        
        do{
            
        System.out.println("MENENTUKAN FPB & INVERS DUA BILANGAN(M MOD N)");
        System.out.print("Masukkan nilai M :");
        int m=input.nextInt();
        System.out.print("Masukkan nilai N :");
        int n=input.nextInt();
        System.out.print("Masukkan interval :");
        int interval=input.nextInt();
        System.out.println("1. Menentukan nilai invers "+m+" (mod "+n+") terbesar yang lebih kecil dari "+interval);
        System.out.println("2. Menentukan nilai invers "+m+" (mod "+n+") terkecil yang lebih besar dari "+interval);
        System.out.print("Pilih  : ");
        int pilih=input.nextInt();
        int bawah=0,atas=0;
        if(pilih==1){
            bawah=interval-n;
            atas=interval;
        }else if(pilih==2){
            bawah=interval+1;
            atas=interval+n;
        }
        int savem=m;
        int saven=n;
        int mod=0;
        if(m<n){
            int tukar=m;
            m=n;
            n=tukar;
        }
        while(n!=0){
        mod=m%n;
        m=n;
        n=mod;
        }
        int bantu;
        for(int i=0;i<saven;i++){
            for(int j=-1000;j<=1000;j++){
                bantu=savem*i+saven*j;
                if(bantu==m){
                     System.out.println("Kombinasi lanjar : "+m+" = "+savem+"("+i+") + "+saven+"("+j+")"); 
                     i=saven;
                }
            }
        }
        if (m==1){
        for(int i=bawah;i<=atas;i++){
            for(int j=-1000;j<=1000;j++){
                bantu=savem*i+saven*j;
                if(bantu==m){
                     System.out.println(m+" = "+savem+"("+i+") + "+saven+"("+j+")"); 
                     System.out.println("Jawaban ="+i);
                }
            }
        }
        }else{
            System.out.println(savem+" tidak memiliki invers dalam modulo "+saven+" karena FPB dari "+savem+" dan "+saven+" adalah "+m);
        }
        System.out.print("Ulangi?(y/n) :");
        ulangi=input.next().charAt(0);
        
        }while(ulangi=='y');
    }
}