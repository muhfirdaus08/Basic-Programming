package respon21;
import java.util.Scanner;
public class Respon21 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int l;
        String s, r;
        char ch;
        System.out.print("masukkan kalimat: ");
        s=input.nextLine();
        l=s.length();
        r= " ";
        for (int i=0; i<l; i++)
        {
            ch=s.charAt(i);
            if (!Character.isUpperCase(ch)) {
                r = r + ch;
            }
        }
        System.out.println("hasilnya "+r);        
    }
    
}
