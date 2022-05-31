package nomor1final;
import java.util.*;
public class Nomor1Final {
    static int a;
//    static int [][]matriks1;
//    static int [][]matriks2;
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
//        System.out.print("Jika diperoleh dua buah matriks dengan ukuran axa, maka masukkan nilai a = ");
//        a = input.nextInt();
//        inputmatriks(matriks1, 1);
//        inputmatriks(matriks2, 2);

        int [] matriks1d = {9,7,8,5,6,1,3,2,4};
        int [][]matriks1 = {{6,7,8},{4,3,5},{1,2,9}};
        int [][]matriks2 = {{8,9,11},{10,8,7},{6,4,3}};
        System.out.println("Urut matriks1d");
        sort(matriks1d);
        print1D(matriks1d);
        print1D(matriks1d);
        System.out.println("Matriks pertama");
        print2d(matriks1);
        
        System.out.println("Urut matriks pertama");
        sort2d(matriks1);
        print2d(matriks1);
        
        System.out.println("Matriks kedua");
        print2d(matriks2);
        
        System.out.println("Urut matriks kedua");
        sort2d(matriks2);
        print2d(matriks2);
        
//        printarray(matriks1);
//        printarray(matriks2);
        
        
    }
     //fungsi input matriks
    static int [][]  inputmatriks (int [][]tampung, int b){
        tampung = new int [a][a];
        for (int i = 0; i <a; i++) {
            for (int j = 0; j < a; j++) {
                Scanner input = new Scanner (System.in);
                System.out.print("Matriks"+b+" ["+i+"]["+j+"] : ");
                tampung [i][j] = input.nextInt();
            }   
        }
        return tampung;
    }
    //fungsi print array2d
    static void print2d(int [][]array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]+"  ");    
            }
            System.out.println("");
        }    
    }
    //sort array2d
    static void sort2d (int[][]array){
        int k=0;
        int [] baru = new int [9];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                baru [k] = array[i][j];
                k++;
            }   
        }
        sort(baru);
        k=0;
        for (int i = 0; i <array.length; i++) {
            for (int j = 0; j <array.length; j++) {
                array[i][j]=baru[k];
                k++;
            }
            
        }
    }
    
    //fungsi print array1d
    static void print1D(int []matriks1d){
        System.out.print("Array 1d = [");
        for (int i = 0; i < matriks1d.length; i++) {
            if (i<matriks1d.length-1){
                 System.out.print(matriks1d[i]+ ", ");
            }
            else {
                System.out.println(matriks1d[i]+ "]");
            }
            
        }
    }
    
    //sort array1d
    static void sort (int [] array){
        int simpan = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] > array[j+1]){
                simpan = array[j];
                array[j] = array[j+1];
                array[j+1] = simpan;
                } 
            }
        }     
    }
}

