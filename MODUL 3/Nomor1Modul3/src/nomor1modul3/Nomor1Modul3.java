package nomor1modul3;
import java.util.Scanner;
public class Nomor1Modul3 {
    public static void main(String[] args) {
        int total = 1500000;
        
        System.out.println("Program Menghitung Pengurangan Pasien Covid 19");
        System.out.println("Tanggal sekarang 23 April 2021");
        System.out.println("Total pasien Covid 19 : "+total);
        
        tanggal();
    }
    private static void tanggal(){
        Scanner input = new Scanner (System.in);
        //System.out.print("Masukan tanggal akhir yang ingin dicari dd/mm/yyyy: ");
        //String tanggal1 = input.nextLine();

        String voa = "23/42/21";
        char daus = voa.charAt(10);
        System.out.println("Coba "+voa);
        System.out.println("Coba "+daus);
        
    }
    private static void hitungtanggal(int tanggal, int tanggals){
        System.out.println("Pasien covid 19 pada tanggal : "+tanggal);
        if (tanggal==tanggals){
            return;
        }
        tanggal++;
        hitungtanggal(tanggal, tanggals);
    }
   
}
