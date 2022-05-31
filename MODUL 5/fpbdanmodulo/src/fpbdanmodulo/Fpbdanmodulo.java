
package fpbdanmodulo;
import java.util.Scanner;
public class Fpbdanmodulo {

    void fpb(){
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
            System.out.println(">>>>>>> Maka FPB (m,n) = "+n);
        }else {
            System.out.println(">>>>>>> Nilai m !>= n dan/atau m dan n !>= 0");
        }
    }
    
    void modulo (){
        Scanner input = new Scanner (System.in);
        int m, n, r;
        System.out.println("==Program Mencari Modulo (m mod n)==");
        System.out.print("Masukan nilai m : ");
        m = input.nextInt();
        System.out.print("Masukan nilai n : ");
        n = input.nextInt();
        
        r = m%n;
        System.out.println(">>>>>>> "+m+" mod "+n+" = "+r);
    }
    public static void main(String[] args) {
        int pilih, choice=1;
        Scanner input = new Scanner (System.in);
        
        while (choice != 0){
            System.out.println("1. FPB");
            System.out.println("2. MODULO");        
            System.out.print("Pilih : ");
            pilih = input.nextInt();

            Fpbdanmodulo baru = new Fpbdanmodulo();

            switch (pilih){
                case 1 :
                    baru.fpb();
                    break;
                case 2 :
                    baru.modulo();
                    break;
                default:
                    System.out.println("Pilihan tidak ditemukan");  
                    break;
            }
            System.out.println("");
            System.out.print("Stop? >> 0 || Lanjut? >> != 0 : ");
            choice = input.nextInt();
            System.out.println("");
        }      
    }   
}
