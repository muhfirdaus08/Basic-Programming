package jurnalmodul3;
import java.util.Scanner;
public class JurnalModul3 {
    public static void main(String[] args) {
        int total = 1500000;
        int tglskrng = 23;
        System.out.println("Program Menghitung Pengurangan Pasien Covid 19");
        System.out.println("Tanggal sekarang 23 April 2021");
        System.out.println("Total pasien Covid 19 : "+total);
        
        Scanner input = new Scanner (System.in);
        System.out.print("Masukan tanggal akhir yang ingin dicari dd : ");
        int tanggal = input.nextInt();
        
        System.out.print("Masukan tanggal akhir yang ingin dicari mm : ");
        int bulan = input.nextInt();
        
        System.out.print("Masukan tanggal akhir yang ingin dicari yyyy : ");
        int tahun = input.nextInt();
        
        System.out.println("Tanggal yang Anda masukan : "+tanggal+" "+bulan+" "+tahun);
        hitungTanggal1(tanggal,bulan,tahun);
        hitungTanggal(tanggal,bulan,tahun);
    }
    private static void hitungTanggal1(int tanggal, int bulan, int tahun){
        for (bulan = 4; bulan<=12; bulan++){
            for (tanggal = 23; tanggal<=30; tanggal++){
            
            System.out.println("Pasien covid 19 : "+tanggal+" "+bulan+" "+tahun);
            }
        }    
        
    }
        
    private static void hitungTanggal(int tanggal, int bulan, int tahun){
        for (tanggal = 1; tanggal<= 30; tanggal++) {
            if (tanggal==31){
                bulan++; 
                for (bulan = 1; bulan<= 12; bulan++) {
                    if (bulan==12){
                    bulan=1;
                    tahun++;
                    }       
                }     
            }
            System.out.println("Pasien covid 19 : "+tanggal+" "+bulan+" "+tahun);
        }    
    }
    //ganjil
    private static int ganjil (int tanggal, int total){
        if (tanggal%2==0){
            total = total - ((5/1000)*total);
        }
        return total;
    }
    //gaenap
    private static int genap (int tanggal, int total){
        if (tanggal%2!=0){
            total = total - ((1/100)*total);
        }
        return total;
    }
    //segitiga
    private static int segitiga (int tanggal, int total){
       if (tanggal==1){
           total = total - ((1/100)*total);
       }
       return total;
    }

}
    

