package cobah;
import java.util.Scanner;
public class Cobah {
    public static void main(String[] args) {
        int angka, w, x, y, z;
        Scanner input = new Scanner (System.in);
        System.out.print("Masukan banyak data : ");
       angka = input.nextInt();
       
       w = angka;
       for (x = angka; x>=1; x--) {
           for (y=x; y<angka; y++){
               System.out.print(" ");
           }
           for (z=1; z<=w; z++){
               System.out.print(z);
           }
           System.out.println();
           w -= 1;
        }
       
        for (x=1; x<=angka; x++){
            for (y=angka; y>x; y--){
                System.out.print(" ");                
            }
            for (z=1; z<=y; z++){
                    System.out.print(z);
                }
            System.out.print("\n");
        }
   }
}
    

