
package responakhirmodul4;
import java.util.Scanner;
public class ResponAkhirModul4 {
   
    static void nomor1(){

        String kata1, kata2;
        System.out.println("Nomor 1");
        Scanner input = new Scanner (System.in);
        System.out.print("Tulis kata pertama : ");
        kata1 = input.nextLine();
        
        System.out.print("Tulis kata kedua : ");
        kata2 = input.nextLine();
        
        //cek kata
        if (kata1.equals(kata2)){
            System.out.println("Kedua kata sama");
        }else {
            System.out.println("Kedua kata berbeda");
        }
        
        //menghitung jumlah huruf
        System.out.println("Jumlah huruf kata pertama : "+kata1.length());
        System.out.println("Jumlah huruf kata kedua : "+kata2.length());
        
    }
    
    //nomor 2
    
    //mengurutkan
    static void  mengurutkanArray(int[] larikA) {
      for (int x = larikA.length - 1; x >= 1; x--) {
         for (int j = 0; j <= x; j++) {
            if (larikA[j] > larikA[x])
               menukar(larikA, j, x);
         }
      }
    }
    
    static void menukar(int[] larikB, int indekj, int indekx) {
      int sementara;
 
      sementara = larikB[indekx];
      larikB[indekx] = larikB[indekj];
      larikB[indekj] = sementara;
    }
    
    //mean
    static int  mean (int [] array){
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total = total + array[i];
        }
        return total;
    }
    
    static void maksmin(int []array){
        //maksimum
        int maksimum = array[0], minimum = array[0];
        int simpan = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i]> maksimum){
                maksimum = array[i];
                simpan = i + 1;
            }
        }
        System.out.println("\nNilai maksimum : "+maksimum);
        
        //minimum
        for (int i = 0; i < array.length; i++) {
            if (array[i]< minimum){
                minimum = array[i];
                simpan = i + 1;
            }
        }
        System.out.println("Nilai minimum : "+minimum);
    }
    
   
    public static void main(String[] args) {
        nomor1();
        
        //nomor2
        Scanner input = new Scanner (System.in);
        System.out.println("Nomor 2");
        System.out.print("Masukan ukuran array yang diinginkan : ");
        int a = input.nextInt();
        
        int [] ArrayBaru1 = new int [a];
        System.out.println("Masukan nilai array ");
        
        for (int i = 0; i < ArrayBaru1.length; i++) {
            System.out.print("Array "+i+ " : ");
            ArrayBaru1[i]= input.nextInt();
        }
        
        //panggil method urut
        mengurutkanArray(ArrayBaru1);
        
        //print array
        System.out.println("Array yang sudah diurutakan");
        for (int print : ArrayBaru1){
            System.out.print(print+ " ");
        }
        
        //mean
        float rata2;
        float baru = 5/3;
        System.out.println(baru);
        rata2 = mean(ArrayBaru1)/ArrayBaru1.length;
        System.out.print("\nMean : "+rata2);
        
        //nilai maksimum dan minimum
        maksmin(ArrayBaru1);
        
    }
    
}
