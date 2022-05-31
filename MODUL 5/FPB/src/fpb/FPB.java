
package fpb;
import java.util.Scanner;
public class FPB {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int m, n, r;
        System.out.println("==Program Mencari FPB==");
        System.out.print("Masukan nilai m : ");
        m = input.nextInt();
        System.out.print("Masukan nilai n : ");
        n = input.nextInt();
        
        if (m>= n && (m>=0 && n>=0)){
            r = m%n;
            while (r != 0){
                m = n;
                n = r;
                r = m%n;
            }
            System.out.println("Maka FPB (m,n) = "+n);
        }else {
            System.out.println("Nilai m !>= n dan/atau m dan n !>= 0");
        }
    }
    
}
