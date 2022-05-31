package responakhirmodul3;
import java.util.Scanner;
public class ResponAkhirModul3 {
    
    static int FactorialRec(int a){
        System.out.print(a+" ");
                    
        if (a == 1){
            System.out.print("= ");
            return a;
        }
        System.out.print("x ");
        return a * FactorialRec(a - 1);
    } 
    
    static int TambahRec (int b){
        System.out.print(b+" ");
        
        if (b == 1){
            System.out.print("= ");
            return b;
        }
        System.out.print("+ ");
        return b + TambahRec(b - 1);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukan angka : ");       
        int inUser = input.nextInt();
        
        int hasil_a = FactorialRec(inUser);
        System.out.println(hasil_a);
        
        int hasil_b = TambahRec(inUser);
        System.out.println(hasil_b);
        
        int hasil = hasil_a + hasil_b;
        System.out.println("hasil akhir " +hasil);
    }
    
}
