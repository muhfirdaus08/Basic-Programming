package tugasnomor3;
import java.util.Scanner;
public class TugasNomor3 {
    public static void main(String[] args) {
        
        //Nama programa
        System.out.println("\nPROGRAM KONVERSI USIA");

        //Deklarasi
        int usia, usiatahun, usiabulan, usiaminggu, usiahari;
        
        //Output1
        Scanner input = new Scanner (System.in);
        System.out.print("Masukaan usia Anda hari ini (hari) : ");
        usia = input.nextInt();
        
        //misal 6981/365 maka sisanya 46 hari (hasilnya jumlah tahun)
        //46 hari/30 sisanya 16 hari (hasilnya jumlah bulan)
        //16 hari/7 sisnya 2 hari (hasilnya jumlah minggu)
        //2 hari (hasilnya jumlah hari)
        
        //Proses
        usiatahun   = usia/365;
        usiabulan   = (usia%365)/30;
        usiaminggu  = ((usia%365)%30)/7;
        usiahari    = ((usia%365)%30)%7;
        
        //Output2
        System.out.print("Jadi usia Anda adalah     : " +usiatahun+" tahun, ");
        System.out.print(+usiabulan+" bulan, ");
        System.out.print(+usiaminggu+" minggu, ");
        System.out.println(+usiahari+" hari ");
        System.out.println("");
        
    }
    
}
