package javaapplication53;
import java.util.Scanner;
import java.util.Arrays;
public class CobaArray1 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int [] arrayAngka1 = new int [5];
        arrayAngka1 [1]= 5;
        
        int [] data = {1,2,3,4,5,6,5,2,3,44};
        
        String [] nama = {"daus", "alif", "fikri"};
        tampilkan(nama);
        
       
        int saldo = 10, online = 3;
        
        System.out.print("Masukan Nomor Pelanggan     : ");
        int nomor = input.nextInt();
        System.out.println("Tagihan Belanja Online Anda : "+online);
        
        System.out.print("Lanjutkan Pembayaran ? Y/N : ");
        String yn = input.nextLine();

        if (yn.equals("Y")|| yn.equals("y")){
            saldo = saldo - online;
            System.out.println("Pembayaran Berhasil");
        }   
        else if (yn.equals("N")|| yn.equals("n")){
            System.out.println("Pembayaran Gagal");
        }
        System.out.println("Sisa Saldo Anda "+saldo);

           
        
        
    }
    static void tampilkan (String baru []){
        System.out.println("Angka array "+Arrays.toString(baru));
    }
    
}
    

