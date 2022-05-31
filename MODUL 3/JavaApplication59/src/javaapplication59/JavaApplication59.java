/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication59;
import java.util.Scanner;
public class JavaApplication59 {

    /**
     * @param args
     */
    public static void main(String[] args) {
            Login();
    }//static void menu (){
        static void Login (){
        Scanner input = new Scanner (System.in);
        System.out.println("====Pilihan Menu===");
        System.out.println("1. Cek Saldo");
        System.out.println("2. Top Up Saldo");
        System.out.println("3. Transfer");
        System.out.println("4. Pembayaran");
        System.out.println("5. Ubah Profil");
        System.out.println("6. Logout");
        System.out.print( "Pilih Menu   : " );
        int pilih = input.nextInt();
        switch (pilih){
        case 1 :
        CekSaldo();
        break;
        case 2 :
        TopUpSaldo();
        break;
        case 3 :
        Transfer();
        break;
        case 4 :
        Pembayaran();
        break;
        case 5 :
        UbahProfil();
        break;
        case 6 :
        break;
        }
        }
    static void CekSaldo(){
        Scanner input = new Scanner (System.in);
        System.out.print("Saldo Ovo anda adalah   = ");
        String a = input.nextLine();
        Login();
    } 
    static void TopUpSaldo(){
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan jumlah saldo   : ");
        String a = input.nextLine();
        System.out.print("Saldo anda sekarang   = ");
        String b = input.nextLine();
        Login();
    }
    static void Transfer(){
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan no id penerima   = ");
        String a = input.nextLine();
        System.out.print("Masukkan nominal   = ");
        String b = input.nextLine();
        System.out.println("Transfer Berhasil");
        System.out.print("No Id penerima  = 300421");
        System.out.print("\nNominal = 500000");
        System.out.print("\nSisa saldo anda ");
        String e = input.nextLine();
        Login();
    }
    static void Pembayaran(){
        Scanner input = new Scanner (System.in);
        System.out.println( "1. Listrik" );
        System.out.println( "2. Air" );
        System.out.println( "3. Belanja Online" );
        System.out.print("Pilih : ");
        int a = input.nextInt();
        System.out.print("Masukkan no pelanggan   :  ");
        String b = input.nextLine();
        System.out.print("\nNomor pelanggan anda    : ");
        String c = input.nextLine();
        System.out.print("Tagihan Listrik anda    : ");
        String d = input.nextLine();
        System.out.println("Lanjutkan Pembayaran? y/n : y ");
        System.out.println("Pembayaran Berhasil");
        System.out.print("Sisa saldo anda ");
        String sisa = input.nextLine();
        Login();
        System.out.print("Pilih : ");
        int log1 = input.nextInt();
        System.out.print("Masukkan no pelanggan   :  ");
        String e = input.nextLine();
        System.out.print("\nNomor pelanggan anda    : ");
        String f = input.nextLine();
        System.out.print("Tagihan Air anda    : ");
        String g = input.nextLine();
        System.out.println("Lanjutkan Pembayaran? y/n : y ");
        System.out.println("Pembayaran Berhasil");
        System.out.print("Sisa saldo anda ");
        String sisa1 = input.nextLine();
        Login();
        System.out.print("Pilih : ");
        int log2 = input.nextInt();
        System.out.print("Masukkan nomor pembayaran   : ");
        String h = input.nextLine();
        System.out.print("\nNomor Pembayaran anda    : ");
        String i = input.nextLine();
        System.out.print("Jumlah Pembayaran    : ");
        String j = input.nextLine();
        System.out.println("Lanjutkan Pembayaran? y/n : y ");
        System.out.println("Pembayaran Berhasil");
        System.out.print("Sisa saldo anda ");
        String sisa2 = input.nextLine();
    }
    static void UbahProfil(){
        Scanner input = new Scanner (System.in);
        System.out.println( "1. Ubah Username" );
        System.out.println( "2. Ubah Password" );
        System.out.print("Pilih : ");
        int log1 = input.nextInt();
        System.out.print("Masukkan username baru : ");
        int a = input.nextInt();
        System.out.println("\nLanjutkan Perubahan? y/n : y ");
        System.out.println("\nPerubahan Berhasil");
        Login();
        System.out.print("Pilih : ");
        int log2 = input.nextInt();
        System.out.print("Masukkan pass baru : ");
        int b = input.nextInt();
        System.out.println("\nLanjutkan Perubahan? y/n : y ");
        System.out.println("\nPerubahan Berhasil");
        Login();
        
    }
    static void menu (int utama){
        Scanner input = new Scanner (System.in);
        System.out.println("1. Masuk");
        System.out.println("2. Daftar");
        System.out.println("3. Masuk");
        System.out.print("Pilih : ");
        int log = input.nextInt();
        System.out.print("Username    : ");
        System.out.print("Password    : ");
        System.out.println("Login berhasil, pilih menu dibawah ini");
        Login();
    }
}

    
    

