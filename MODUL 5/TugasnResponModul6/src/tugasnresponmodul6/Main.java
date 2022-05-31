
package tugasnresponmodul6;
import java.util.Scanner;

class CalculatorSimple {
    int a, b, c, result, pilih, jumlahbil;
    int []space;
    
    void displayresult (){
        Scanner input = new Scanner (System.in);
        System.out.println("\n===CALCULATOR SEDERHANA===");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
        System.out.println("5. Faktorial (!)");
        System.out.println("6. FPB");
        System.out.println("7. Mengurutkan Bilangan");
        System.out.println("8. Stop");
        System.out.print("Pilih : ");
        pilih = input.nextInt();
        
        switch (pilih){
            case 1 :
                inputNilai();
                tambah();
                displayresult();
                break;
            case 2 : 
                inputNilai();
                kurang();
                displayresult();
                break;
            case 3 : 
                inputNilai();
                kali();
                displayresult();
                break;
            case 4 : 
                inputNilai();
                bagi();
                displayresult();
                break;
            case 5 :
                System.out.print("Masukan angka : ");
                c = input.nextInt();
                int hasil = faktorial(c);
                System.out.println("Faktorial dari "+c+" = "+hasil);
                displayresult();
                break;
            case 6 : 
                inputNilai();
                Fpb();
                displayresult();
                break;
            case 7 :
                System.out.print("Masukan jumlah angka : ");
                jumlahbil = input.nextInt();
                inputBil(space);
                System.out.println("Hasil masukan sebelum diurutkan ");
                printBil(space);
                System.out.println("Hasil masukan setalah diurutkan");
                sortBil(space);
                printBil(space);
                displayresult();
                break;
            case 8 :
                System.exit(0);
            default :
                System.out.println("Pilihan tidak ditemukan, silahkan pilih kembali!");
                displayresult();
                break;
        }
        
    }
    
    void inputNilai(){
        Scanner input = new Scanner (System.in);
        System.out.println("Masukan angka a dan b");
        System.out.print("a = ");
        a = input.nextInt();
        System.out.print("b = ");
        b = input.nextInt();
    }
    
    void inputFaktorial(){
        Scanner input = new Scanner (System.in);
        System.out.print("Masukan angka = ");
        c = input.nextInt();
    }  
    void tambah(){
        result = a + b;
        System.out.println("Hasil = "+result);
    }   
    void kurang(){
        result = a - b;
        System.out.println("Hasil = "+result);
    }    
    void kali(){
        result = a * b;
        System.out.println("Hasil = "+result);
    }   
    void bagi (){
        result = a / b;
        System.out.println("Hasil = "+result);
    }   
    void Fpb (){
        if (a>=b && (a>=0 && b>=0)){
            result = a%b;
            while (result != 0){
                a = b;
                b = result;
                result = a%b;
            }
            System.out.println("Maka FPB (a,b) = "+b);
        }else {
            System.out.println("Nilai a !>= b dan/atau a dan b !>= 0");
        }
    }   
    int faktorial(int in_c){
        System.out.println("angka ke : " + in_c);

        if (in_c == 1){
            return in_c;
        }
        return in_c * faktorial(in_c - 1);
    }   
    
    int []inputBil (int []tampung){
        tampung = new int [jumlahbil];
        for (int i = 0; i < jumlahbil; i++) {
            Scanner input = new Scanner (System.in);
            System.out.print("Angka ke ["+i+"] : ");
            tampung [i] = input.nextInt();
            space = tampung;
        }
        return space;
    }
    void printBil(int[] dataArray){
        for (int cetakBil : dataArray){
            System.out.print(cetakBil +" ");
        }
        System.out.print("\n");
    }
    void sortBil(int []matriksurut){
        for (int i = 0; i < jumlahbil; i++) {
            for (int j = 0; j < jumlahbil; j++) {
                if (matriksurut[i] < matriksurut[j]) {
                            int simpan = matriksurut[i];
                            matriksurut[i] = matriksurut[j];
                            matriksurut[j] = simpan;
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        CalculatorSimple user1 = new CalculatorSimple();
        user1.displayresult();
    }
    
}
