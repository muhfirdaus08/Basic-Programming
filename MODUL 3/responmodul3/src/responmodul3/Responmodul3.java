package responmodul3;
import java.util.Scanner;
public class Responmodul3 {

    public static int tabungan = 500000;;
    public static void main(String[] args) {
        ambilUang();
    }
    public static void ambilUang(){
        System.out.println("ATM");
        
        Scanner in = new Scanner(System.in);
        System.out.println("Jumlah Saldo : "+tabungan);
        System.out.print("uang yang mau diambil : ");
        int uang = in.nextInt();
        
        tabungan -= uang;
        System.out.println("Uang Berhasil Diambil");
        System.out.println("uang yang diambil : " + uang + "\nsisa tabungan : " + tabungan);
        yesno();
        
    }
    
    public static void yesno (){
        Scanner input = new Scanner (System.in);
        System.out.print("Lagi ? Y/N : ");
        String yn = input.nextLine();

        if (yn.equals("Y")|| yn.equals("y")){
            ambilUang();
            System.out.println("Uang Berhasil Diambil");
        }   
        else if (yn.equals("N")|| yn.equals("n")){
            System.out.println("Sampai Jumpa");
            System.exit(0);
        }
    }    
}