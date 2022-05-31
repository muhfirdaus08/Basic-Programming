package modul6;
import java.util.Scanner;

class Menu {
    static String username = "";
    String nama, namaTeman, namaSaranTeman;
    int umur;
    int pilihan;
    //DataBaseAkun            0       1      2       3       4       5      6       7       8       9
    String namaArray [] = {"Daus","Azzam","Ifan","Dirga","Ryand","Rudi","Rizky","Indah","Mitha","Hazmi"};
    int umurArray [] = {19,19,19,19,19,19,19,19,19,19};
    
    //DataBaseTeman
    String temanDaus [] = {"Azzam","Ifan","Rudi"};
    String temanAzzam[] = {"Daus","Ryand","Indah"};
    String temanIfan [] = {"Daus","Dirga","Rudi"};
    String temanDirga [] = {"Ifan"};
    String temanRyand [] = {"Azzam","Rizky"};
    String temanRudi [] = {"Daus","Ifan"};
    String temanRizky [] = {"Ryand","Hazmi"};
    String temanIndah [] = {"Azzam","Mitha","Hazmi"};
    String temanMitha [] = {"Indah"};
    String temanHazmi [] = {"Rizky","Indah"};
    
    //Tampilkan Database Semua Akun
    void DataBase(){
        for (int i = 0; i < 10; i++) {
            System.out.print("Nama : "+namaArray[i]);
            System.out.println(" Umur : "+umurArray[i]);
        }     
        System.out.print("Nama : "+this.nama);
        System.out.println(" Umur : "+this.umur);      
    }

    //Pilihan Menu
    void Awal (){
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
                Awal();
                break;
        }        
    }
    
    //Menu Utama
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
                BackMenuUtama();
                break;
                
            case 2 : 
                BuatAkun();
                BackMenuUtama();
                break;
                
            case 3 :
                DataSemuaAkun();
                BackMenuUtama();
                break;
                
            case 4 :
                DataSaranPertemanan();
                BackMenuUtama();
                break;
                
            case 5 :
                DataSaranPertemanan();
                BackMenuUtama();
                break;
                
            default :
                System.out.println("Pilihan tidak ditemukan");
                menuUtama();
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
        if (this.nama.equals(username)){
            Login1();
        }else {
            System.out.println("Akun dengan nama tersebut tidak ditemukan");
            menuUtama();
        }
        
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
                    namaSaranTeman = namaTeman;
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
                    SaranPertemanan(namaSaranTeman);
                    BackMenuUtama1();
                    break;
                    
                case 4 : 
                    menuUtama();
                    break;
                    
                default :
                    System.out.println("Pilihan tidak ditemukan");
                    Login1();
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
        DataBase();
        BackMenuUtama();
    }
    
    void DataPertemanan(){
        System.out.println("DATA FRIENDLIST SEMUA AKUN");
        System.out.println("==========================");
        
        System.out.print("Azzam : ");
        for(String baru : temanAzzam){
            System.out.print(baru+" ");
        }
        System.out.println("");
        System.out.print("Dirga : ");
        for(String baru : temanDirga){
            System.out.print(baru+" ");
        }
        System.out.println("");
        System.out.print("Daus : ");
        for(String baru : temanDaus){
            System.out.print(baru+" ");
        }
        System.out.println("");
        System.out.print("Hazmi : ");
        for(String baru : temanHazmi){
            System.out.print(baru+" ");
        }
        System.out.println("");
        System.out.print("Ifan : ");
        for(String baru : temanIfan){
            System.out.print(baru+" ");
        }
        System.out.println("");
        System.out.print("Indah : ");
        for(String baru : temanIndah){
            System.out.print(baru+" ");
        }
        System.out.println("");
        System.out.print("Mitha : ");
        for(String baru : temanMitha){
            System.out.print(baru+" ");
        }
        System.out.println("");
        System.out.print("Rizky : ");
        for(String baru : temanRizky){
            System.out.print(baru+" ");
        }
        System.out.println("");
        System.out.print("RUdi : ");
        for(String baru : temanRudi){
            System.out.print(baru+" ");
        }
        System.out.println("");
        System.out.print("Ryan : ");
        for(String baru : temanRyand){
            System.out.print(baru+" ");
        }
        System.out.println("");
        System.out.print(this.nama+" : ");
        LihatTeman(namaTeman);
    }
    //DataBAseSaranTeman
    String saranDaus [] = {"Ryand","Indah","Dirga","Rudi","Ifan"};
    String saranAzzam[] = {"Ifan","Rudi","Rizky","Mitha","Hazmi"};
    String saranIfan [] = {"Azzam","Rudi"};
    String saranDirga [] = {"Daus","Rudi"};
    String saranRyand [] = {"Daus","Indah","HAzmi"};
    String saranRudi [] = {"Azzam","Ifan","Dirga"};
    String saranRizky [] = {"Azzam","Rizky","Indah"};
    String saranIndah [] = {"Daus","Ryand","Rizky"};
    String saranMitha [] = {"Azzam","Hazmi"};
    String saranHazmi [] = {"Ryand","Azzam","Mitha"};
    
    void DataSaranPertemanan(){
        System.out.print("Azzam : ");
        for(String baru : saranAzzam){
            System.out.print(baru+" ");
        }
        System.out.println("");
        System.out.print("Dirga : ");
        for(String baru : saranDirga){
            System.out.print(baru+" ");
        }
        System.out.println("");
        System.out.print("Daus : ");
        for(String baru : saranDaus){
            System.out.print(baru+" ");
        }
        System.out.println("");
        System.out.print("Hazmi : ");
        for(String baru : saranHazmi){
            System.out.print(baru+" ");
        }
        System.out.println("");
        System.out.print("Ifan : ");
        for(String baru : saranIfan){
            System.out.print(baru+" ");
        }
        System.out.println("");
        System.out.print("Indah : ");
        for(String baru : saranIndah){
            System.out.print(baru+" ");
        }
        System.out.println("");
        System.out.print("Mitha : ");
        for(String baru : saranMitha){
            System.out.print(baru+" ");
        }
        System.out.println("");
        System.out.print("Rizky : ");
        for(String baru : saranRizky){
            System.out.print(baru+" ");
        }
        System.out.println("");
        System.out.print("Rudi : ");
        for(String baru : saranRudi){
            System.out.print(baru+" ");
        }
        System.out.println("");
        System.out.print("Ryand : ");
        for(String baru : saranRyand){
            System.out.print(baru+" ");
        }
        System.out.println("");
        System.out.print(this.nama+" : ");
        SaranPertemanan(namaSaranTeman);
    }
    
    //Menu Home
    void Tambahkanteman(String namaTeman){
        String tambah = namaTeman;
    }
    
    void LihatTeman(String namaTeman){
        String tambah = namaTeman;
        System.out.println(this.nama+ ": " +tambah);
    }
    
    void SaranPertemanan(String namaTeman1){
        namaTeman = namaTeman1;
        if (namaTeman.equals("Azzam")){
            for(String baru : saranAzzam){
                System.out.print(baru+" ");
            }
        }
        if (namaTeman.equals("Daus")){
            for(String baru : saranDaus){
                System.out.print(baru+" ");
            }
        }
        if (namaTeman.equals("Dirga")){
            for(String baru : saranDirga){
                System.out.print(baru+" ");
            }
            System.out.println("");
        }
        if (namaTeman.equals("Ifan")){
            for(String baru : saranIfan){
                System.out.print(baru+" ");
            }
            System.out.println("");
        }
        if (namaTeman.equals("Rizky")){
            for(String baru : saranRizky){
                System.out.print(baru+" ");
            }
        }
        if (namaTeman.equals("Ryand")){
            for(String baru : saranRyand){
                System.out.print(baru+" ");
            }
        }
        if (namaTeman.equals("Indah")){
            for(String baru : saranIndah){
                System.out.print(baru+" ");
            }
        }
        if (namaTeman.equals("Mitha")){
            for(String baru : saranMitha){
                System.out.print(baru+" ");
            }
        }
        if (namaTeman.equals("Ryand")){
            for(String baru : saranRyand){
                System.out.print(baru+" ");
            }
        }
        if (namaTeman.equals("Rudi")){
            for(String baru : saranRudi){
                System.out.print(baru+" ");
            }
        }
        System.out.println("");
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
    
    //MenuKembali1
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
                BackMenuUtama1();
                break;
        }
    }   
}
public class Modul6 {
    public static void main(String[] args) {
        Menu akun = new Menu();
        akun.Awal();    
    }
}
