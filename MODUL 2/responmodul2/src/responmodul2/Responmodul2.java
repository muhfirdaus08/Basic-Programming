package responmodul2;
import java.util.Scanner;
public class Responmodul2 {

    public static void main(String[] args) {
        int a =0;
        char b = '*';
        char c = '#';
        Scanner input = new Scanner (System.in);
        do {
            System.out.print("Masukan satu simbol awal  : ");
            b= input.next().charAt(0); 
            System.out.print("Masukan tiga angka        : ");
            a=input.nextInt();
            System.out.print("Masukan satu simbol akhir : ");
            c= input.next().charAt(0); 
        }while (a !=123 && b!='*' && c!='#' );
                
    }
    
}
