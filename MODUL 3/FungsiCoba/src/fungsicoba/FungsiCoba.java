package fungsicoba;
import java.util.Scanner;
public class FungsiCoba {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("===Persegi/Persegi Panjang===");
        
        System.out.print("Masukan panjang : ");
        int panjang = input.nextInt();
        
        System.out.print("Masukan lebar : ");
        int lebar = input.nextInt();
        
        tampilkan(panjang,lebar);        
    }
    //Tampilkan seluruh fungsi
    private static void tampilkan(int p, int l){
       System.out.println(""); 
       gambar(p, l);
       
       System.out.println(""); 
       System.out.println("Luasnya adalah : "+luas(p,l)); 
       
       System.out.println(""); 
       System.out.println("Kelilingnya adalah : "+keliling(p,l));
    }
    //Menghitung Keliling
    private static int keliling(int p, int l){
        int hasil = (p+l)*2;
        return hasil;
    }
    //Menghitung Luas
    private static int luas(int p, int l){
        int hasil = p*l;
        return hasil;
    }
    //Menggambar Persegi/Persegi Panjang
    private static void gambar(int p, int l){
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print("* ");         
            }
             System.out.print("\n");
        }
       
    }  
    
}
