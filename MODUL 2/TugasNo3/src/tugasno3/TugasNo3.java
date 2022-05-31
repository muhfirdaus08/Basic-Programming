package tugasno3;
import java.util.Scanner;
public class TugasNo3 {
    
    public static void main(String[] args) {
        System.out.println("===================================");
        System.out.println("        Program Isi Pulsa XL");
        System.out.println("===================================");
        System.out.print("\n");
        
        char kodeawal, kodeakhir;
        int angka, jumlah;
        int x=0;
        
        Scanner input = new Scanner (System.in);
        System.out.println(">>>Masukan kode XL");
        
        System.out.print("Masukan satu simbol awal  : ");
        kodeawal = input.next().charAt(0); 
        System.out.print("Masukan tiga angka        : ");
        angka = input.nextInt(); 
        System.out.print("Masukan satu simbol akhir : ");
        kodeakhir = input.next().charAt(0);
        
        char tampung1 = '*';
        int tampung = 123;
        char tampung2 = '#';
        
        if ((kodeawal==tampung1) && (angka==tampung)&&(kodeakhir==tampung2)){
            System.out.print("\n");
            System.out.println(">>>Pilih menu yang diinginkan ");
            System.out.println("1. Kuota Internet");
            System.out.println("2. Pulsa Telepon");
            System.out.println("3. Exit");
            System.out.print(">>>Pilih nomor : ");
            x = input.nextInt(); 
            if (x==1){
                System.out.println(">>>Pilih kuota Internet");
                System.out.println("1. 1 Gb");
                System.out.println("2. 10 Gb");
                System.out.println("3. 300 Gb");
                System.out.println("7. Exit");
                System.out.print(">>>Pilih nomor : ");
                x = input.nextInt();
                if (x==1){
                     System.out.println("Anda akan membeli paket 1 Gb seharga Rp. 15.000");
                } else if (x==2){
                     System.out.println("Anda akan membeli paket 10 Gb seharga Rp. 50.000");
                } else if (x==3){
                     System.out.println("Anda akan membeli paket 30 Gb seharga Rp. 100.000");
                }  else if (x==4){
                     System.out.println(">>>Sampai Jumpa Kembali");
                }
            }else if(x==2){
                System.out.println(">>>Pilih pulsa Telepon");
                System.out.println("1. 5000");
                System.out.println("2. 20000");
                System.out.println("3. 50000");
                System.out.println("4. Exit");
                System.out.print(">>>Pilih nomor : ");
                x = input.nextInt();
                if (x==1){
                     System.out.println("Anda akan membeli pulsa 5000 seharga Rp. 6.000");
                } else if (x==2){
                     System.out.println("Anda akan membeli pulsa 20000 seharga Rp. 20.000");
                } else if (x==3){
                     System.out.println("Anda akan membeli pulsa 50000 seharga Rp. 50.000");
                }  else if (x==4){
                     System.out.println(">>>Sampai Jumpa Kembali");
                }
            }else if(x==3){
                System.out.println(">>>Sampai Jumpa Kembali");
        }   
        }else {
        System.out.print("\n");
        System.out.println(">>>Maaf, Kode yg Anda Masukan Salah ");
        }
   
    }
    
}
