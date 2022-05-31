package jurnal.modul.pkg3;
import java.util.Scanner;
public class JurnalModul3 {
    public static void main(String[] args) {
        int totalawal = 1500000;
        int tglskrng = 23;
        System.out.println("Program Menghitung Pengurangan Pasien Covid 19");
        System.out.println("Tanggal sekarang 23 April 2021");
        System.out.println("Total pasien Covid 19 : "+totalawal);
        
        Scanner input = new Scanner (System.in);
        System.out.print("Masukan tanggal akhir yang ingin dicari dd : ");
        int tanggal = input.nextInt();
        
        System.out.print("Masukan tanggal akhir yang ingin dicari mm : ");
        int bulan = input.nextInt();
        
        System.out.print("Masukan tanggal akhir yang ingin dicari yyyy : ");
        int tahun = input.nextInt();
        
        System.out.println("Tanggal yang Anda masukan : "+tanggal+" "+bulan+" "+tahun);
        
        genap(tanggal, totalawal);
        ganjil(tanggal, totalawal);
        segitiga(tanggal, totalawal);
        
    }
    
    private static int genap (int angka, int total){
        System.out.println("Pasien covid 19 pada tanggal "+total);
        for (int i = 23; i <= angka; i++) {
            if (angka%2==0){
            total = total - ((5/1000)*total);
            }
        }
        return total;
    }
    
    private static int ganjil (int angka, int total){
        System.out.println("Pasien covid 19 pada tanggal "+total);
        for (int i = 23; i <= angka; i++){
            if (angka%2!=0){
            total = total - ((1/100)*total);
            }
        }
        return total;
    }
    private static int segitiga (int angka, int total){
        System.out.println("Pasien covid 19 pada tanggal "+total);
        for(int x = angka; x <= angka; x++){
            int r = (x*(x+1))/2;
            int n, a;
            for (int i=angka; i>=angka; i++){
                if (r==i){
                    total = total - ((3/1000)*total);
                }
            } r=0;
        }
        return total;
    }
}
