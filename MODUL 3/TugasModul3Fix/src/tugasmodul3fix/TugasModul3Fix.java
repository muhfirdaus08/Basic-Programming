
package tugasmodul3fix;
import java.util.Scanner;
public class TugasModul3Fix {
    static String Username;
    static String password;
    static String masuk;
    static String daftar;
    static String User;
    static String pw;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
         int pilih;

        do {
            System.out.println("1. Masuk");
            System.out.println("2. Daftar");
            System.out.println("3. keluar");
            System.out.print("pilih: ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    masuk(masuk);
                    break;
                case 2:
                    daftar(daftar);
                    break;
                case 3:
                    break;
            }
        }while(pilih!=3);
        
        

    }
    static void daftar(String gas){
        Scanner input=new Scanner(System.in);
        System.out.print("Username anda: ");
        User=input.nextLine();
        System.out.print("password anda: ");
        pw = input.nextLine();
        System.out.println("terima kasih sudah daftar");

    }static void masuk(String ayo){
        Scanner input=new Scanner(System.in);
        System.out.print("Username: ");
        Username= input.nextLine();
        System.out.print("password: ");
        password= input.nextLine();
        if (Username.equals(User) && password.equals(pw)){
            System.out.println("berhasil masuk!");
        }else{
            System.out.println("Username atau password salah atau anda belum daftar yaa");
        }

    }
}