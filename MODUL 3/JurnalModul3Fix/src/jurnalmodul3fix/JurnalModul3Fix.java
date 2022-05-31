package jurnalmodul3fix;
import java.util.Scanner;

public class JurnalModul3Fix {
    public static void main(String[] args) {
        int pasien = 1500000;
        
        System.out.println("Program Menghitung Pengurangan Pasien Covid 19");
        System.out.println("Tanggal sekarang 23 April 2021");
        System.out.println("Total pasien covid 19 : "+pasien);
        
        Scanner input = new Scanner (System.in);
        System.out.print("Masukan tanggal akhir yang ingin dicari dd/mm/yyyy : ");
        tanggal = input.nextLine();
        
        int hari1 = Integer.parseInt(tanggal.substring(0, 2));
        int bulan1 = Integer.parseInt(tanggal.substring(3, 5));
        int tahun1 = Integer.parseInt(tanggal.substring(6, 10));
        
        System.out.print(hitung(pasien,23,4,2021, hari1+1, bulan1, tahun1));
    }
    private static String tanggal;

    private static int hitung (int pasien,int hari, int bulan, int tahun, int parhari, int parbulan, int partahun){
        hari ++;
        int max;
        if (bulan==4||bulan==6||bulan==9||bulan==11){
            max = 30;
        }else if (bulan==1||bulan==3||bulan==5||bulan==7||bulan==8||bulan==10||bulan==12){
            max = 31;
        }else {
            max = 29;
        }
        if (hari > max){
            bulan++;
            hari = 1;
        }
        if (bulan>12){
            tahun++;
            bulan = 1;
        }
        if (hari==parhari&&bulan==parbulan&&tahun==partahun){
            return hari;
        }
        if (hari==3||hari==6||hari==10||hari==15||hari==21||hari==28){
            int tambah = (int) (pasien*0.003);
            pasien += tambah; 
        }
        if (hari%2 == 0){
            int kurang = (int) (pasien*0.005);
            pasien -= kurang;
        }
        else if (hari%2 != 0){
            int kurang = (int) (pasien*0.01);
            pasien -= kurang;
        }
        System.out.println("Pasien covid pada tanggal "+hari+" "+bulan+" "+tahun+" = "+pasien);
        return hitung(pasien, hari, bulan, tahun, parhari, parbulan,partahun);    
    } 
}
