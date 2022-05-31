package nomor1;
import java.util.Scanner;
public class Nomor1 {
    public static void main(String[] args) {
        
        System.out.println("===PROGRAM MENUKAR NILAI===");      
        Scanner input = new Scanner (System.in);
        int a; //mangga
        System.out.print("Masukan nilai a (mangga) : ");
        a = input.nextInt();       
        int b; //manggis
        System.out.print("Masukan nilai b (manggis): ");
        b = input.nextInt();      
        int c; //jeruk
        System.out.print("Masukan nilai c (jeruk)  : ");
        c = input.nextInt();      
        int d; //apel
        System.out.print("Masukan nilai d (apel)   : ");
        d = input.nextInt();      
        int e; //salak
        System.out.print("Masukan nilai e (salak)  : ");
        e = input.nextInt();       
        int f; //duren
        System.out.print("Masukan nilai f (duren)  : ");
        f = input.nextInt();
        
        System.out.println("\nNilai Awal Ember SEBELUM Ditukar");    
        System.out.println("nilai a (mangga)         : "+a);
        System.out.println("nilai b (manggis)        : "+b);
        System.out.println("nilai c (jeruk)          : "+c);
        System.out.println("nilai d (apel)           : "+d);
        System.out.println("nilai e (salak)          : "+e);
        System.out.println("nilai f (duren)          : "+f);
        
        int emberbantu; // sebagai ember bantu
        //Pemindahan isi ember 
        emberbantu = a;
        a = c;
        c = e;
        e = b;
        b = f;
        f = d;
        d = emberbantu;
     
        System.out.println("\nNilai Akhir Ember SETELAH Ditukar");    
        System.out.println("nilai a (mangga)         : "+a);
        System.out.println("nilai b (manggis)        : "+b);
        System.out.println("nilai c (jeruk)          : "+c);
        System.out.println("nilai d (apel)           : "+d);
        System.out.println("nilai e (salak)          : "+e);
        System.out.println("nilai f (duren)          : "+f); 
    }
    
}
