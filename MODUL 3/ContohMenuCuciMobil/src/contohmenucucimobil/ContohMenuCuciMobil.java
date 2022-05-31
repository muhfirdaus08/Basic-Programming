package contohmenucucimobil;
import java.util.Scanner;
public class ContohMenuCuciMobil {
    
    static String Mobil;
    static String CuciMobil;
    static int biaya;
    static int jenisCuci;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jenisMobil;
        System.out.println("Pilih Jenis Mobil");
        System.out.println("1. Mini Bus");
        System.out.println("2. Bus");
        System.out.println("3. Truk");
        System.out.print("masukkan Jenis Mobil = ");
        jenisMobil = input.nextInt();

        switch(jenisMobil){
            case 1 : Mobil = "Mini Bus";break;
            case 2 : Mobil = "Bus";break;
            case 3 : Mobil = "Truk";break;
        }
        Tarif(jenisMobil);
        input.close();
        
    }
    
    static void Tarif(int model){
        Scanner input = new Scanner(System.in);
        int harga=0;
        switch(model){
            case 1 : harga = 450000;break;
            case 2 : harga = 550000;break;
            case 3 : harga = 650000;break;
        }

        System.out.println("1. Interior dan Exterior Rp." + harga);
        System.out.println("2. Cuci Mesin Rp."+(harga+200000));
        System.out.println("3. Full service Rp."+(harga+400000));
        System.out.print("masukkan Jenis pencucian = ");
        jenisCuci = input.nextInt();
        switch(jenisCuci){
            case 1 : 
                CuciMobil = "Interior dan Exterior";
                biaya = harga;
            break;
            case 2 : 
                CuciMobil = "Cuci Mesin";
                biaya = harga+200000;
            
            break;
            case 3 : 
                CuciMobil = "Full service";
                biaya = harga + 400000;
            break;
        }
        data();
    }

    static void data(){
        Scanner input = new Scanner(System.in);
        int pembayaran;
        System.out.println("Data pembayaran");
        System.out.println("Jenis Mobil "+Mobil);
        System.out.println("Jenis Pencucian "+CuciMobil);
        System.out.println("Tarif "+biaya);

        System.out.print("Masukkan jumlah uang = ");
        pembayaran = input.nextInt();
        System.out.print("Masukkan jumlah uang = ");
        pembayaran = input.nextInt();
        
        System.out.println("1. Jumlah uang anda = "+pembayaran);
        System.out.println("2. Biaya pencucian = "+biaya);
        System.out.println("3. Kembalian ="+(pembayaran-biaya));
    }
}
    
    

