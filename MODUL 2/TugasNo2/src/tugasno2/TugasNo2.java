package tugasno2;
import java.util.Scanner;
public class TugasNo2 {
    public static void main(String[] args) {
        System.out.println("===Menentukan Tahun Kabisat===");
        int t;
        Scanner input = new Scanner (System.in);
        System.out.print("Masukan Tahunnya : ");
        t = input.nextInt();
        
        if (t%400==0 || ((t%400!=0 && t%100!=0) && t%4==0)){
            System.out.println("                   "+t+" adalah Tahun Kabisat");
        }
        else {
            System.out.println("                   "+t+" BUKAN Tahun Kabisat");
        }
            
    }
    
}
