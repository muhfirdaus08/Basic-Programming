package jurnalmodul1nomor1;
import java.util.Scanner;
public class JurnalModul1Nomor1 {
    public static void main(String[] args) {
        int a, b, c, d, e, f, bantu=0;
        
        Scanner input = new Scanner (System.in);
        System.out.print("Masukan nilai a : ");
        a = input.nextInt();
        System.out.print("Masukan nilai b : ");
        b = input.nextInt();
        System.out.print("Masukan nilai c : ");
        c = input.nextInt();
        System.out.print("Masukan nilai d : ");
        d = input.nextInt();
        System.out.print("Masukan nilai e : ");
        e = input.nextInt();
        System.out.print("Masukan nilai f : ");
        f = input.nextInt();
        
        bantu=a;
        a=c;  
        c=e;
        e=b;
        b=f;
        f=d;
        d=bantu;  
        
        System.out.println("===Maka nilai setalh diubah===");
        System.out.println("Nilai a : "+a);
        System.out.println("Nilai b : "+b);
        System.out.println("Nilai c : "+c);
        System.out.println("Nilai d : "+d);
        System.out.println("Nilai e : "+e);
        System.out.println("Nilai f : "+f);
    }
    
}
