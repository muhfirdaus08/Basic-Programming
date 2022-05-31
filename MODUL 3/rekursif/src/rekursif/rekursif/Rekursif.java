package rekursif;
import java.util.Scanner;
public class Rekursif {

    public static void main(String[] args) {
     Scanner userInput = new Scanner(System.in);
        System.out.print("masukan nilai:");
        int nilai = userInput.nextInt();
        System.out.println("anda memasukan nilai = " + nilai);


        printNilai(nilai);
        
        System.out.println("");
        int jumlah = jumlahNilai(nilai);
        System.out.println("jumlah = " + jumlah);
        
        System.out.println("");
        int faktorial = hitungFaktorial(nilai);
        System.out.println("hasil faktorial = " + faktorial);
        
        System.out.println("");
        int genap = genap(nilai);
        System.out.println("Jumlah bilangan Genap = " + genap);
    }
    // fungsi rekursif sederhana

    private static int hitungFaktorial(int parameter){
        System.out.println("parameter = " + parameter);

        if (parameter == 1){
            return parameter;
        }

        return parameter * hitungFaktorial(parameter - 1);

    }

    private static int jumlahNilai(int parameter){
        System.out.println("parameter = " + parameter);

        if (parameter == 0){
            return parameter;
        }

        return parameter + jumlahNilai(parameter - 1);

    }

    private static void printNilai (int parameter){
        System.out.println("nilai = " + parameter);

        if (parameter == 0){
            return;
        }

        parameter--;

        printNilai(parameter);
    }
    
    private static int genap (int parameter){
      
        if (parameter == 1||parameter == 2){
             return parameter;
        }
        System.out.println("genap = " + parameter);
        return parameter + genap(parameter-2);
    }
}
