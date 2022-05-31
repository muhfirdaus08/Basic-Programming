package TugasModul3;
import java.util.Scanner;
public class dausModul3 {
    
    static String username = "", password = "";
    static String username1 = "", password1 = "";
    static int pilihan = 0;
    static int saldo = 1000000;
    static int listrik = 150000, air = 100000, online = 200000;

    public static void main(String[] args) {
        login();        
    }
    static void login (){
        Scanner input = new Scanner (System.in);
        while(pilihan != 3){
            System.out.println("1. Masuk");
            System.out.println("2. Daftar");
            System.out.println("3. Keluar");
            System.out.print("Pilih = ");
            pilihan = input.nextInt();
            
            switch (pilihan){
                case 1 : 
                    masuk();
                    break;
                case 2 : 
                    daftar();
                    break;
                case 3 :
                    System.out.println("Sampai Jumpa :)");
                    System.exit(0);
                    break;       
            }                
        }               
    }
 
    static void masuk (){
        System.out.print("\n");
        Scanner input = new Scanner (System.in);
        System.out.print("Username anda : ");
        username = input.nextLine();
        System.out.print("Password anda : ");
        password = input.nextLine();
        
        if ((username.equals(username1) && password.equals(password1))){
            System.out.println("Login berhasil, pilih menu di bawah ini"); 
            menu();
        }
        else {
            System.out.println("Username atau Password Salah atau Tidak Terdaftar");
            System.out.print("\n");
            login ();
        }
    }
    
    static void daftar (){
        Scanner input = new Scanner (System.in);
        System.out.print("\n");
        System.out.println("Selamat Datang di Menu Daftar");
        System.out.print("Username anda : ");
        username1 = input.nextLine();
        System.out.print("Password anda : ");
        password1 = input.nextLine();
        System.out.println("Terima Kasih, Silahkan Login");
        System.out.print("\n");
        login();
    }
    
    static void menu (){
        System.out.print("\n");
        Scanner input = new Scanner (System.in);
        System.out.println("1. Cek Saldo");
        System.out.println("2. Top Up Saldo");
        System.out.println("3. Transfer");
        System.out.println("4. Pembayaran");
        System.out.println("5. Profil");
        System.out.println("6. Logout");
        System.out.print("Pilih = ");
        pilihan = input.nextInt();
        System.out.print("\n");
        
        switch (pilihan){
            case 1 :
                cekSaldo();
                break;
            case 2 :
                topUp();
                break;
            case 3 :
                tranfer();
                break;
            case 4 :
                pembayaran();
                break;
            case 5 :
                profil();
                break;
            case 6 :
                login();
                break;
                
        }
    }
    
    static void cekSaldo(){
        System.out.println("Saldo Anda Adalah = "+saldo);
        menu();
    }
    
    static void topUp (){
        Scanner input = new Scanner (System.in);
        System.out.println("1. Lanjutkan TopUp");
        System.out.println("2. Kembali");
        System.out.print("Pilih = ");
        pilihan = input.nextInt();
        System.out.print("\n");
        
        switch (pilihan){
            case 1 :
                System.out.print("Masukan Jumlah Saldo : ");
                int jumlah = input.nextInt();
        
                saldo = jumlah + saldo;
                
                System.out.println("Saldo Anda Sekarang Adalah = "+saldo);
                menu();
                break;
                
            case 2 :
                menu();
                break;
        }    
    }
    
    static void tranfer (){
        int idPenerima =0, nominal=0;
        Scanner input = new Scanner (System.in);
        System.out.println("1. Lanjutkan Transfer   ");
        System.out.println("2. Kembali");
        System.out.print("Pilih = ");
        pilihan = input.nextInt();
        System.out.print("\n");
        
        switch (pilihan){
            case 1 :
                if (saldo == 0){
                    System.out.println("Saldo Anda Kosong, Silahkan TopUp");
                }
                else {
                    System.out.print("Masukan No. ID Penerima : ");
                    idPenerima = input.nextInt();
                    System.out.print("Masukan Nominal         : ");
                    nominal = input.nextInt();
                    System.out.println("Transfer Berhasil");

                    saldo = saldo - nominal;

                    System.out.println("No. ID Penerima        : "+idPenerima);
                    System.out.println("Nominal                : "+nominal);
                    System.out.println("Sisa Saldo Ando Adalah = "+saldo);
                }
                menu();
                break;
            case 2 :
                menu();
                break;
        }
                  
    }
    static void pembayaran (){
        Scanner input = new Scanner (System.in);
        System.out.println("1. Listrik");
        System.out.println("2. Air");
        System.out.println("3. Belanja Online");
        System.out.println("4. Kembali");
        System.out.print("Pilih = ");
        pilihan = input.nextInt();
        System.out.print("\n");
        
        switch (pilihan){
            case 1 :
                System.out.print("Masukan Nomor Pelanggan : ");
                int nomor = input.nextInt();
                System.out.println("Nomor Pelanggan Anda  : "+nomor);
                pemblistrik();
                break;
                
            case 2 :
                System.out.print("Masukan Nomor Pelanggan : ");
                nomor = input.nextInt();
                System.out.println("Nomor Pelanggan Anda  : "+nomor);
                pembair();
                break;
              
            case 3 :
                System.out.print("Masukan Nomor Pembayaran   : ");
                nomor = input.nextInt();
                System.out.println("Nomor Pembayaran Anda    : "+nomor);
                pembonline();
                break;
                
            case 4 :
                menu();
                break;
        }
        pembayaran();
    }
    
    static void pemblistrik (){
        Scanner input = new Scanner (System.in);
        System.out.println("Tagihan Listrik Anda  : "+listrik);
        System.out.print("Lanjutkan Pembayaran ? Y/N : ");
        String yn = input.nextLine();

        if (yn.equals("Y")|| yn.equals("y")){
            if (saldo < listrik){
                System.out.println("Saldo Tidak Cukup, Silahkan TopUp");
                menu();
            }
            else {
                saldo = saldo - listrik;
                System.out.println("Pembayaran Berhasil");
            }  
        }   
        else if (yn.equals("N")|| yn.equals("n")){
            System.out.println("Pembayaran Gagal");
        }
        System.out.println("Sisa Saldo Anda "+saldo);
        menu();
    }
    
    static void pembair (){
        Scanner input = new Scanner (System.in);
        System.out.println("Tagihan Air Anda      : "+air);
        System.out.print("Lanjutkan Pembayaran ? Y/N : ");
        String yn = input.nextLine();

        if (yn.equals("Y")|| yn.equals("y")){
           if (saldo < air){
                System.out.print("Saldo Tidak Cukup, Silahkan TopUp");
                menu();
            }
            else {
                saldo = saldo - listrik;
                System.out.println("Pembayaran Berhasil");
            }  
        }   
        else if (yn.equals("N")|| yn.equals("n")){
            System.out.println("Pembayaran Gagal");
        }
        System.out.println("Sisa Saldo Anda "+saldo);
        menu();
    }
    
    static void pembonline (){
        Scanner input = new Scanner (System.in);
        System.out.println("Tagihan Belanja Online Anda : "+online);
        System.out.print("Lanjutkan Pembayaran ? Y/N : ");
        String yn = input.nextLine();

        if (yn.equals("Y")|| yn.equals("y")){
            if (saldo < online){
                System.out.print("Saldo Tidak Cukup, Silahkan TopUp");
                menu();
            }
            else {
                saldo = saldo - listrik;
                System.out.println("Pembayaran Berhasil");
            }  
        }   
        else if (yn.equals("N")|| yn.equals("n")){
            System.out.println("Pembayaran Gagal");
        }
        System.out.println("Sisa Saldo Anda "+saldo);
        menu();
    }

    static void profil(){
        Scanner input = new Scanner (System.in);
        System.out.println("1. Cek Profil");
        System.out.println("2. Ubah Profil");
        System.out.println("3. Kembali");
        System.out.print("Pilih = ");
        pilihan = input.nextInt();
        switch (pilihan){
            case 1 : 
                cekProfil();
                break;
            case 2 :
                ubahProfil();
                break;
            case 3 :
                menu();
                break;
        }
        profil();
    }
    static void cekProfil(){
        Scanner input = new Scanner (System.in);
        System.out.println("1. Cek Username");
        System.out.println("2. Cek Password");
        System.out.println("3. Kembali");
        System.out.print("Pilih = ");
        pilihan = input.nextInt();
        switch (pilihan){
            case 1 : 
                System.out.println("Username anda : "+username1);
                break;
            case 2 :
                System.out.println("Password anda : "+password1);
                break;
            case 3 :
                menu();
                break;
        }
        profil();
    }
    static void ubahProfil(){
        Scanner input = new Scanner (System.in);
        System.out.println("1. Ubah Username");
        System.out.println("2. Ubah Password");
        System.out.println("3. Kembali");
        System.out.print("Pilih = ");
        pilihan = input.nextInt();
        switch (pilihan){
            case 1 : 
                ubahUsername();
                break;
            case 2 :
                ubahPassword();
                break;
            case 3 :
                menu();
                break;
        }
        profil();
    }
    
    static void ubahUsername(){
        Scanner input = new Scanner (System.in);
        System.out.print("Masukan Username Baru : ");
        username1 = input.nextLine();
        username = username1;
        yesno();
    }
    
    static void ubahPassword(){
        Scanner input = new Scanner (System.in);
        System.out.print("Masukan Password Baru : ");
        password1 = input.nextLine();
        password = password1;
        yesno();
    }
    
    static void yesno (){
        Scanner input = new Scanner (System.in);
        System.out.print("Lanjutkan Perubahan ? Y/N : ");
        String yn = input.nextLine();

        if (yn.equals("Y")|| yn.equals("y")){
            System.out.println("Perubahan Berhasil");
        }   
        else if (yn.equals("N")|| yn.equals("n")){
            System.out.println("Perubahan Gagal");
        }
    }
}