package prima;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Prima {

    public static void main(String[] args) {
        int x=0, y, bantu=0, angka, jumlah=0;
        Scanner input = new Scanner (System.in);
        System.out.print("Masukan tahun : ");
        angka = input.nextInt();
        
        /*for (x=1; x<=angka; x++){
            for (y=1; y<x; y++){
                bantu = x%y;
                if (bantu==0){
                    bantu++;
                }
            }if (bantu==2){
                jumlah=x+7;
                System.out.println("Air laut naik dalam "+x+" tahun : "+jumlah);
                
                
            }else {
                jumlah=x+5;
                System.out.println("Air laut naik dalam "+x+" tahun : "+jumlah);
            }
        }*/
        int hitung=0;
            if (angka>=1){
            jumlah=jumlah+5;
            System.out.println("Air laut naik dalam 1 tahun :  "+jumlah+" cm");
        }
        for (x=2; x<=angka; x++){
            for (y=2; y<x; y++){
            if (x%y==0){
               hitung++;
            }
        }if (hitung==0){
            jumlah += 7;
            System.out.println("Air laut naik dalam "+x+" tahun :  "+jumlah+" cm");
        }else {
            jumlah += 5;
            System.out.println("Air laut naik dalam "+x+" tahun :  "+jumlah+" cm");
        }
        
        /*t hitung = 0;
        //Hanya ada 2 angka yang bisa habis membagi nilai x
        for(int i = 1; i<=angka; i++){
            int simpan = angka%i; //Berapa bagi berapa agar hasilnya itu adalah 0 atau habis dibagi i
            if(simpan==0){
                hitung++;
            }
        }
        if(hitung==2){
            System.out.println(angka + " adalah angka prima");
        }else{
            System.out.println(angka + " adalah bukan angka prima");
        }
        */
        
    }
    
}
}
