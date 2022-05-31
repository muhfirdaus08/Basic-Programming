package percobaanjurnal;

import java.util.Scanner;

public class PercobaanJurnal {
    static int a;
    static int b;
    static int [][]matriks1;
    static int [][]matriks2;
    static int [][]hasil1;
    static int [][]hasil2;
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Jika diperoleh dua buah matriks dengan ukuran axa, maka masukkan nilai a = ");
        a = input.nextInt();
        System.out.println("Maka masukan nilai pada matriks 1 : ");
        hasil1 = inputmatriks(matriks1, 1);
        System.out.println("Kemudian, masukan nilai pada matriks 2 : ");
        hasil2 = inputmatriks(matriks2, 2);
        
        System.out.println("Sehingga diperoleh matriks berdasarkan inputan : ");
        System.out.println("Matriks 1 :");
        printmatriks(hasil1);
        System.out.println("Matriks 2 :");
        printmatriks(hasil2);
        
        System.out.println("====================================================================");
        
        System.out.println("Matriks setelah diurutkan : ");
        System.out.println("Matriks 1 :");
        sort2d(hasil1);
        printmatriks(hasil1);
        System.out.println("Matriks 2 :");
        sort2d(hasil2);
        printmatriks(hasil2);

        System.out.println("====================================================================");
        System.out.println("Hasil penjumlahan matriks1 dan matriks2 setelah diurutkan adalah : ");
        int [][] hasiltambah = plusminuskali(hasil1, hasil2, '+');
        printmatriks(hasiltambah);
        
        System.out.println("====================================================================");
        System.out.println("Hasil pengurangan matriks1 dan matriks2 setelah diurutkan adalah : ");
        int [][]hasilkurang = plusminuskali(hasil1, hasil2,'-');
        printmatriks(hasilkurang);
        
        System.out.println("====================================================================");
        System.out.println("Hasil perkalian matriks1 dan matriks2 setelah diurutkan adalah : ");
        int [][] hasilkali = new int [a][a];
        hasilkali = plusminuskali(hasil1, hasil2,'*');
        printmatriks(hasilkali);
        
        System.out.println("====================================================================");
        System.out.println("Angka terbesar dari matriks1 dan matriks2 adalah :");
        maxbanding(hasil1, hasil2);
        
        System.out.println("====================================================================");
        System.out.println("Angka terkecil dari matriks1 dan matriks2 adalah :");
        minbanding(hasil1, hasil2);
        
        System.out.println("====================================================================");
        System.out.println("Hasil konversi matriks setelah diurutkan ke dalam romawi :");
        System.out.println("Matriks 1 :");
        romawi(hasil1);
        System.out.println("Matriks 2 :");
        romawi(hasil2); 
  
    }
    
    //fungsi input matriks
    static int [][]  inputmatriks (int [][]tampung, int b){
        tampung = new int [a][a];
        for (int i = 0; i <a; i++) {
            for (int j = 0; j < a; j++) {
                Scanner input = new Scanner (System.in);
                System.out.print("Matriks"+b+"["+i+"]["+j+"] : ");
                tampung [i][j] = input.nextInt();
            }   
        }
        return tampung;
    }
    
    //fungsi urut matriks DARI 2D DIUBAH MENJADI 1D KEMUDIAN DIURUTKAN BARU DIUBAH JADI 2D
    static void sort2d (int[][]array){
        int k=0;
        int [] baru = new int [a*a];
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
    // fungsi SORTING 1 DIMENSI
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
    
//    //fungsi urut matriks
//    static void matriksurut(int [][] matriksurut){
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < a; j++) {
//                for (int k = 0; k < a; k++) {
//                    for (int l = 0; l < a; l++) {
//                        if (matriksurut[i][j] < matriksurut[k][l]) {
//                            int simpan = matriksurut[i][j];
//                            matriksurut[i][j] =matriksurut[k][l];
//                            matriksurut[k][l] = simpan;
//                        }
//                    }
//                }
//            }
//        }
//    }
     
    //FUNGSI TAMBAH KURANG KALI
    static int[][] plusminuskali(int[][] a, int[][] b, char tanda){
        int [][] hasil = new int [a.length][a[0].length];
        if (tanda == '+'){           
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {
                hasil [i][j] = a[i][j] + b[i][j]; 
                }   
            }
        }
        else if (tanda == '-'){
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[0].length; j++) {
                hasil [i][j] = a[i][j] - b[i][j]; 
                }   
            }
        }
        else if (tanda == '*'){
            int row1 = a.length;
            int col1 = a[0].length;

            int row2 = b.length;
            int col2 = b[0].length;

            int hitung;
            for (int i = 0; i < row1; i++){
                for (int j = 0; j < col2 ; j++){
                hitung = 0;
                    for (int k = 0; k < col1; k++){
                    hitung += a[i][k] * b[k][j];
                    }
                hasil[i][j] = hitung;
                }
            }
        }
        return hasil;
    }    
        
        
    
//    //FUNGSI TAMBAH
//    static int[][] tambah(int[][] a, int[][] b){    
//    
//        int [][] hasil = new int [a.length][a[0].length];
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < b.length; j++) {
//                hasil [i][j] = a[i][j] + b[i][j]; 
//            }   
//        }
//        return hasil;
//    }
    
//    //FUNGSI KURANG
//    static int[][] kurang(int[][] a, int[][] b){    
//        int [][] hasil = new int [a.length][a[0].length];
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < b[0].length; j++) {
//                hasil [i][j] = a[i][j] - b[i][j]; 
//            }   
//        }
//        return hasil;
//    }
    
//    //FUNGSI KALI
//    static int[][] kali(int[][] a, int[][] b){
//        int row1 = a.length;
//        int col1 = a[0].length;
//
//        int row2 = b.length;
//        int col2 = b[0].length;
//
//        int[][] hasil = new int[row1][col2];
//
//        int hitung;
//        for (int i = 0; i < row1; i++){
//            for (int j = 0; j < col2 ; j++){
//                hitung = 0;
//                for (int k = 0; k < col1; k++){
//                    hitung += a[i][k] * b[k][j];
//                }
//                hasil[i][j] = hitung;
//            }
//        }
//        return hasil;
//    }
    
    //FUNGSI ANGKA TERBESAR
    static int max (int [][]angka){
        int angkamax = angka [0][0];
        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka[i].length; j++) {
                if (angka[i][j]>angkamax){
                    angkamax = angka[i][j];
                }
            }            
        }
        return angkamax;
    }
    
    //FUNGSI BANDING MAX
    static void maxbanding(int [][]angkaA, int [][]angkaB){
        int matriksper = max(angkaA);
        int matriksked = max(angkaB);
        
        if (matriksper > matriksked){
            System.out.println(matriksper+", pada matriks1");
        }else if (matriksper < matriksked){
            System.out.println(matriksked+", pada matriks2");
        }
    }
    
    //FUNGSI ANGKA TERKECIL
    static int min (int [][]angka){
        int angkamix = angka [0][0];
        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka[i].length; j++) {
                if (angka[i][j] < angkamix){
                    angkamix = angka[i][j];
                }
            }            
        }
        return angkamix;
    }
    
    //FUNGSI BANDING MAX
    static void minbanding(int [][]angkaA, int [][]angkaB){
        int matriksper = min(angkaA);
        int matriksked = min(angkaB);
        
        if (matriksper > matriksked){
            System.out.println(matriksked+", pada matriks2");
        }else if (matriksper < matriksked){
            System.out.println(matriksper+", pada matriks1");
        }
    }
    
    
    //FUNGSI ROMAWI
    static void romawi (int [][]matriks){
        for(int i = 0; i < matriks.length; i++){
            for(int j = 0; j < matriks[i].length; j++){
                while (matriks[i][j]>=1000){
                    System.out.print("M");
                    matriks[i][j] = matriks[i][j] - 1000;
                }    
                if (matriks[i][j]>=500){
                    if (matriks[i][j]>=900){
                        System.out.print("CM");
                        matriks[i][j] = matriks[i][j] - 900;
                    }
                    else {
                        System.out.print("D");
                        matriks[i][j] = matriks[i][j] - 500;
                    }         
                }
                while (matriks[i][j]>=100){
                    if (matriks[i][j]>=400){
                        System.out.print("CD");
                        matriks[i][j] = matriks[i][j] - 400;
                    }
                    else {
                        System.out.print("C");
                        matriks[i][j] = matriks[i][j] - 100;
                    }         
                }
                if (matriks[i][j]>=50){
                    if (matriks[i][j]>=90){
                        System.out.print("XC");
                        matriks[i][j] = matriks[i][j] - 90;
                    }
                    else {
                        System.out.print("L");
                        matriks[i][j] = matriks[i][j] - 50;
                    }     
                }
                while (matriks[i][j]>=10){
                    if (matriks[i][j]>=40){
                        System.out.print("XL");
                        matriks[i][j] = matriks[i][j] - 40;
                    }
                    else {
                        System.out.print("X");
                        matriks[i][j] = matriks[i][j] - 10;
                    }         
                }
                if (matriks[i][j]>=5){
                    if (matriks[i][j]==9){
                        System.out.print("IX");
                        matriks[i][j] = matriks[i][j] - 9;
                    }
                    else {
                        System.out.print("V");
                        matriks[i][j] = matriks[i][j] - 5;
                    }         
                }
                while (matriks[i][j]>=1){
                    if (matriks[i][j]==4){
                        System.out.print("IV");
                        matriks[i][j] = matriks[i][j] - 4;
                    }
                    else {
                        System.out.print("I");
                        matriks[i][j] = matriks[i][j] - 1;
                    }         
                }     
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }
    
    //fungsi print 
    private static void printmatriks(int[][] dataArray){
        for (int[] baris: dataArray) {
            for(int angka: baris){
                System.out.print(angka + "  ");
            }
            System.out.print("\n");
        }
    }
}
        

        
        
