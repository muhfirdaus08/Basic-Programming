package responakhirmodul1;
import java.util.Scanner;
public class ResponAkhirModul1 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);       
        //nomor2
        System.out.println("Program Mendekteksi Angka Ganjil");
        System.out.print("Input angka : ");
        int angkaGanjil = input.nextInt();
        
        angkaGanjil = angkaGanjil%2; 
        boolean penentu = angkaGanjil==1;
        System.out.println("Angka tersebut adalah "+penentu+ " angka ganjil");
       
    }
    
}
