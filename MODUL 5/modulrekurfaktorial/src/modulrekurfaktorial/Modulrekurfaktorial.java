
package modulrekurfaktorial;
import java.util.Scanner;
public class Modulrekurfaktorial {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int inUser;
        System.out.println("Program Mencari Faktorial");
        System.out.print("Masukan angka : ");
        inUser = input.nextInt();
        
        int hasil = factorialrec(inUser);
        System.out.println("Maka faktorialnya adalah "+hasil);
    }
    
    static int factorialrec(int a){
        System.out.println("angka ke : " + a);

        if (a == 1){
            return a;
        }
        return a * factorialrec(a - 1);
    }   
}
    

