
package sortingarray1ddan2d;
import java.util.Scanner;
public class SortingArray1Ddan2D {
    static int a;
    static int []matriks1d;
    static int [][]matriks2d;
    public static void main(String[] args) {
        System.out.println("Masukan array 1D ");
        inputmatriks1d(matriks1d);
        System.out.println("Hasil masukan sebelum diurutkan ");
        printmatriks1d(matriks1d);
        System.out.println("Array 1D setalah diurutkan");
        matriksurut1d(matriks1d);
        
        System.out.println("Masukan array 2D ");
        inputmatriks2D(matriks2d);
        System.out.println("Hasil masukan sebelum diurutkan ");
        printmatriks2d(matriks2d);
        System.out.println("Array 1D setalah diurutkan");
        matriksurut2d(matriks2d);
        
    }
    //fungsi input array 1D
    static int []inputmatriks1d (int []tampung){
        tampung = new int [a];
        for (int i = 0; i <a; i++) {
            Scanner input = new Scanner (System.in);
            System.out.print("Matriks1D ["+i+"] : ");
            tampung [i] = input.nextInt();  
        }
        return tampung;
    }
    //fungsi print 1D
    private static void printmatriks1d(int[] dataArray){
        for (int i = 0; i < dataArray.length; i++) {
            System.out.println(dataArray[i]+" ");
        }
    }
    //fungsi sorting array 1D
    static void matriksurut1d(int []matriksurut){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (matriksurut[i] < matriksurut[j]) {
                            int simpan = matriksurut[i];
                            matriksurut[i] = matriksurut[j];
                            matriksurut[j] = simpan;
                }
            }
        }
    }
    //fungsi input array 2D
    static int [][]  inputmatriks2D (int [][]tampung){
        tampung = new int [a][a];
        for (int i = 0; i <a; i++) {
            for (int j = 0; j < a; j++) {
                Scanner input = new Scanner (System.in);
                System.out.print("Matriks2D ["+i+"]["+j+"] : ");
                tampung [i][j] = input.nextInt();
            }   
        }
        return tampung;
    }
    //fungsi print 2D
    private static void printmatriks2d(int[][] dataArray){
        for (int[] baris: dataArray) {
            for(int angka: baris){
                System.out.print(angka + "  ");
            }
            System.out.print("\n");
        }
    }
    //fungsi sorting array 2D
    static void matriksurut2d(int [][] matriksurut){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                for (int k = 0; k < a; k++) {
                    for (int l = 0; l < a; l++) {
                        if (matriksurut[i][j] < matriksurut[k][l]) {
                            int simpan = matriksurut[i][j];
                            matriksurut[i][j] =matriksurut[k][l];
                            matriksurut[k][l] = simpan;
                        }
                    }
                }
            }
        }
    }
    
}
