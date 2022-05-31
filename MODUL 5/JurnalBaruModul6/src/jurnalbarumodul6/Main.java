package jurnalbarumodul6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu baru = new Menu();
        baru.Utama();   
    }
}
class Menu {
    static String username = "";
    String nama, namaTeman;
    int umur;
    int pilihan;
    String namaArray [] = {"ifan","Azzam","daus ","Dirga","Ryand","Rudi","Rizky","Indah","Mitha","Hazmi"};
    int umurArray [] = {19,19,19,19,19,19,19,19,19,19};
    
    void simpanData(){
        for (int i = 0; i < 10; i++) {
            System.out.print("Nama : "+namaArray[i]);
            System.out.println(" Umur : "+umurArray[i]);
        }     
        System.out.print("Nama : "+this.nama);
        System.out.println(" Umur : "+this.umur);
        
    } 
    
    void menuUtama(){
        Scanner input = new Scanner (System.in);
        System.out.println("=== Menu Utama ===");
        System.out.println("1. Sudah punya akun ? >> Login");
        System.out.println("2. Belum punya akun ? >> Daftar/Buat Akun");
        System.out.println("3. Data Semua Akun");
        System.out.println("4. Data Pertemanan");
        System.out.println("5. Data Saran Pertemanan");
        System.out.print("Pilih : ");
        pilihan = input.nextInt();
        switch (pilihan){
            case 1 : 
                Login();
                break;
                
            case 2 : 
                BuatAkun();
                break;
                
            case 3 :
                DataSemuaAkun();
                break;
                
            case 4 :
                
                break;
                
            case 5 :
                
                break;
                
            default :
                System.out.println("Pilihan tidak ditemukan");
                menuUtama();
                break;
        }
    }
    void Tambahkanteman(String namaTeman){
        String tambah = namaTeman;
    }
    
    void LihatTeman(String namaTeman){
        String tambah = namaTeman;
        System.out.println(this.nama+ ": " +tambah);
    }
    
    void SaranPertemanan(){
        
    }
    
    
    //Menu kembali
    void BackMenuUtama(){
        Scanner input = new Scanner (System.in);
        System.out.println("1. Kembali");
        System.out.println("2. Stop");
        System.out.print("Pilih : ");
        pilihan = input.nextInt();
        switch (pilihan){
            case 1 :
                menuUtama();
                break;
            
            case 2 :
                System.exit(0);
                break;
                
            default :
                System.out.println("Pilihan tidak ditemukan");
                BackMenuUtama();
                break;
        }     
    }
 
    
    void BuatAkun(){
        Scanner input = new Scanner (System.in);
        System.out.print("\n");
        System.out.println("Daftarkan nama dan umur anda");
        System.out.print("Nama : ");
        this.nama = input.nextLine();
        System.out.print("Umur : ");
        this.umur = input.nextInt(); 
        System.out.println("Pembuatan Akun Berhasil");
        menuUtama();
    }
    
    void Login(){
        System.out.print("\n");
        Scanner input = new Scanner (System.in);
        System.out.print("Masukan nama anda : ");
        username = input.nextLine();
        Login1();
    }
    void Login1(){
        Scanner input = new Scanner (System.in);
        if (username.equals(this.nama)){
            System.out.println("===Menu Login===");
            System.out.println("1. Tambahkan teman");
            System.out.println("2. Lihat teman");
            System.out.println("3. Lihat Saran Pertemanan");
            System.out.println("4. Kembali ke Menu Utama");
            System.out.print("Pilih : ");
            pilihan = input.nextInt();
            switch (pilihan){
                case 1 : 
                    System.out.print("Masukan nama teman : ");
                    namaTeman = input.next();
                    Tambahkanteman(namaTeman);
                    System.out.println("Penambahan Teman Berhasil");
                    Login1();
                    BackMenuUtama1();
                    break;
                    
                case 2 : 
                    LihatTeman(namaTeman);
                    Login1();
                    BackMenuUtama1();
                    break;
                    
                case 3 : 
                    
                    BackMenuUtama1();
                    break;
                    
                case 4 : 
                    menuUtama();
                    break;
                    
                default :
                    System.out.println("Pilihan tidak ditemukan");
                    BackMenuUtama();
                    break;        
            }
        }else {
            System.out.println("Anda salah memasukan nama/Akun tidak terdaftar");
            System.out.println("Silahkan Daftar");
            menuUtama();
        }
    }
    
    void DataSemuaAkun(){
        System.out.println("DATA SEMUA AKUN");
        System.out.println("===============");
        simpanData();
        BackMenuUtama();
    }

    void Utama (){
        Scanner input = new Scanner (System.in);
        System.out.println("Selamat Datang Di Media Sosial Kami");
        System.out.println("1. Menu Utama");
        System.out.println("2. Home");
        System.out.print("Pilih : ");
        pilihan = input.nextInt();
        switch (pilihan){
            case 1 : 
                menuUtama();
                break;
                
            case 2 :
                Login();
                break;
                
            default :
                System.out.println("Pilihan tidak ditemukan");
                Utama();
                break;
        }        
    }
   
    void BackMenuUtama1(){
        Scanner input = new Scanner (System.in);
        System.out.println("1. Kembali");
        System.out.println("2. Stop");
        System.out.print("Pilih : ");
        pilihan = input.nextInt();
        switch (pilihan){
            case 1 :
                Login1();
                break;
                
            case 2 :
                System.exit(0);
                break;
                
            default :
                System.out.println("Pilihan tidak ditemukan");
                Login1();
                break;
        }
    }        
}
