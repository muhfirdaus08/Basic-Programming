
package respon2;
import java.util.Scanner;
public class Respon2 {
    public static void main(String[] args) {
        
        int urutan;
        int b = 0;
        
        System.out.println("===Program Membalik Urutan Angka===");
        Scanner input = new Scanner (System.in);
        System.out.print("Masukan angka yang akan dibalik : ");
        urutan = input.nextInt();
        
        while (urutan !=0){
            b = b*10; 
            b = b + urutan%10; 
            urutan = urutan/10;    
        }
        System.out.println("Urutan angka setelah dibalik    : "+b);
    }
    
}
