package jurnalmodul4;
import java.util.Scanner;
public class JurnalModul4 {
    
    static int a = 0;
    static int [][]matriks1;
    static int [][]matriks2;
    static int []tampung;
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Jika diperoleh dua buah matriks dengan ukuran axa, maka masukkan nilai a = ");

        a = input.nextInt();
        System.out.println("Maka masukan nilai pada matriks 1 : ");
        int [][] inputmat1 = inputmatriks(matriks1);
        System.out.println("Kemudian, masukan nilai pada matriks 2 : ");        
        int [][] inputmat2 = inputmatriks(matriks2);
 
        System.out.print("\n");
        
        System.out.println("Sehingga diperoleh matriks berdasarkan inputan : ");
        System.out.println("Matriks 1 :");
        printmatriks(inputmat1);
        System.out.println("Matriks 2 :");
        printmatriks(inputmat2);
        
        System.out.println("====================================================================");
        
        System.out.println("Matriks setelah diurutkan : ");
        System.out.println("Matriks 1 :");
        urut(inputmat1);
        System.out.println("Matriks 2 :");
        urut(inputmat2);  
        
        System.out.println("====================================================================");
       
        System.out.println("Hasil penjumlahan matriks1 dan matriks2 setelah diurutkan adalah : ");
        int [][] hasil = tambah(inputmat1, inputmat2);
        printmatriks(hasil);
        
        System.out.println("====================================================================");
        
        System.out.println("Hasil pengurangan matriks1 dan matriks2 setelah diurutkan adalah : ");
        hasil = kurang(inputmat1, inputmat2);
        printmatriks(hasil);
        
        System.out.println("====================================================================");
        
        System.out.println("Hasil perkalian matriks1 dan matriks2 setelah diurutkan adalah : ");
        int [][] hasilkali = new int [a][a];
        hasilkali = kali(inputmat1, inputmat2);
        printmatriks(hasilkali);
        
        System.out.println("====================================================================");
        System.out.println("Angka terbesar dari matriks1 dan matriks2 adalah :");
        maxbanding(inputmat1, inputmat2);
        
        System.out.println("====================================================================");
        System.out.println("Angka terkecil dari matriks1 dan matriks2 adalah :");
        minbanding(inputmat1, inputmat2);
        
        System.out.println("====================================================================");
        System.out.println("Hasil konversi matriks setelah diurutkan ke dalam romawi :");
        System.out.println("Matriks 1 :");
        romawi(inputmat1);
        System.out.println("Matriks 2 :");
        romawi(inputmat2); 
            
    }
    
    //FUNGSI INPUT DATA MATRIKS 
    static int [][]  inputmatriks (int [][]tampung){
        tampung = new int [a][a];
        for (int i = 0; i <a; i++) {
            for (int j = 0; j < a; j++) {
                Scanner input = new Scanner (System.in);
                System.out.print("Matriks1 ["+i+"]["+j+"] : ");
                tampung [i][j] = input.nextInt();
            }   
        }
        return tampung;
    }

    //FUNGSI PRINT
    static void printmatriks (int [][] datamatriks ){
        for (int[] i : datamatriks) {
            for(int j : i){
                System.out.print(j + "  ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
       
    //FUNGSI SORT 
    static void urut (int matriksurut[][]){
        int small, row = 0, col = 0, z;
        for(int k = 0; k < matriksurut.length; k++){
            for(int p = 0; p < matriksurut[k].length; p++){
                small = matriksurut[k][p];
                for(int i = k; i < matriksurut.length; i++){
                    if(i == k)
                        z = p + 1;
                    else
                        z = 0;
                    for(;z < matriksurut[i].length; z++){
                        if(matriksurut[i][z] <= small){
                            small = matriksurut[i][z];
                            row = i;
                            col = z;
                        }
                    }
                }
            matriksurut[row][col] = matriksurut[k][p];
            matriksurut[k][p] = small;
            System.out.print(matriksurut[k][p] + "  ");
            }
            System.out.println();
        }
    }
    
    //FUNGSI TAMBAH
    static int[][] tambah(int[][] a, int[][] b){    
    
        int [][] hasil = new int [a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                hasil [i][j] = a[i][j] + b[i][j]; 
            }   
        }
        return hasil;
    }
    
    //FUNGSI KURANG
    static int[][] kurang(int[][] a, int[][] b){    
        int [][] hasil = new int [a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                hasil [i][j] = a[i][j] - b[i][j]; 
            }   
        }
        return hasil;
    }
    
    //FUNGSI KALI
    static int[][] kali(int[][] a, int[][] b){
        int row1 = a.length;
        int col1 = a[0].length;

        int row2 = b.length;
        int col2 = b[0].length;

        int[][] hasil = new int[row1][col2];

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
        return hasil;
    }
    
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
    
    //FUNGSI BANDING MIN
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
                System.out.print("\n\n");
            }    
        }
    }
}

