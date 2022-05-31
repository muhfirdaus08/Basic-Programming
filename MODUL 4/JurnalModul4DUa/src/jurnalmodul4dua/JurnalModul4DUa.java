package jurnalmodul4dua;
import java.util.Scanner;
public class JurnalModul4DUa {

    public static void main(String[] args) {
        System.out.println("ABECEDARIAN DAN POLINDROME PROGRAM");
        nama();
    }
    
    static void nama (){
        Scanner input = new Scanner (System.in);
        System.out.print("Nama Panggilan Anda : ");
        String nama = input.nextLine();
        if ("DAUS".equals(nama) ||"Daus".equals(nama) || "daus".equals(nama) ){
            
            System.out.println("Hai "+nama+", Selamat datang di ABECEDARIAN DAN POLINDROME PROGRAM");
            System.out.println("========================================");
            abecedarian();
            polindrome();
        }
        else {
            System.out.println("Anda salah memasukkan nama");
        }
    }
    
    static void abecedarian (){
        System.out.println("ABECEDARIAN PROGRAM");
        Scanner input = new Scanner (System.in);
        System.out.print("MASUKKAN KATA : ");
        String kata = input.nextLine();
        kata = kata.replace(" ", "");
        
        for (int i = 0; i < kata.length()-1; i++) {
            if (kata.charAt(i) <= kata.charAt(i+1)){
            }
            else {
                System.out.println("TIDAK Termasuk Abecedarian");
                return;
            }
        }
        System.out.println("Termasuk Abecedarian");
        System.out.println("========================================");
    }
                         
    static void polindrome(){
        System.out.println("POLINDROME PROGRAM");
        Scanner input = new Scanner (System.in);
        System.out.print("MASUKKAN KATA : ");
        String kata = input.nextLine();
        kata = kata.replace(" ", "");
        
        String balik = "";
        for (int i = kata.length()-1; i >= 0; i--) {
            balik += kata.charAt(i);
        }
        boolean polindrome = true;
        for (int i = 0; i < kata.length(); i++) {
            if (kata.charAt(i) != balik.charAt(i)){
                polindrome = false;
            }
            
        }
        if (polindrome){
            System.out.println("Termasuk Polindrome");
        }
        else {
            System.out.println("TIDAK Termasuk Polindrome");
        }
        System.out.println("========================================");
    }
}
        

    

