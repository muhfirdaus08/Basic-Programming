package jurnaldua;
import java.util.Scanner;
public class JurnalDua {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai akhir (a)          : ");
        int a = input.nextInt();
        System.out.print("Masukkan selisih (b)              : ");
        int b = input.nextInt();
        System.out.print("Masukkan banyak barisan (n)       : ");
        int n = input.nextInt();
        
        int jumlah = 0;
        //aritmatika
        System.out.print("\na. Seluruh bilangan aritmatika    : ");
        for (int x = n*b+(a-b); x>=a; x-=b) {
            System.out.print(x+ " ");
            jumlah = jumlah + x;
        }
        System.out.println("\njumlah : " + jumlah);
        jumlah = 0;
        
        //genap
        System.out.print("\nb. Seluruh bilangan genap         : ");
        for (int x = n*b+(a-b); x>=a; x-=b) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
                jumlah = jumlah + x;
            }
        }
        System.out.println("\njumlah : " + jumlah);
        jumlah = 0;
        
        //ganjil
        System.out.print("\nc. Seluruh bilangan ganjil        : ");
        for (int x = n*b+(a-b); x>=a; x-=b) {
            if (x % 2 != 0) {
                System.out.print(x + " ");
                jumlah = jumlah + x;
            }
        }
        System.out.println("\njumlah : " + jumlah);
        jumlah = 0;
        
        //prima
        System.out.print("\nd. Seluruh bilangan prima         : ");
        for (int x = n*b+(a-b); x>=a; x--) {
            int hitung=0;
            for(int i=1; i<=n; i++){
                int simpan = x%i;
                if (simpan==0){
                    hitung++;
                }
            }
            if (hitung == 2) {

                System.out.print(x+" ");
                jumlah=jumlah+x;
            }
        }
        System.out.print("\njumlah : "+jumlah);
        int k,l,r;

        jumlah=0;
        System.out.println();
        
        //fibonanci
        System.out.print("\ne. Seluruh bilangan fibonacci     : ");
        for(int x = a+(n-1)*b; x>=a; x-=b){
            k=0;
            l=1;
            if(x==1 || x==0){
                System.out.print(x+ " ");
            }
            for (int i=x; i>=0; i--){
                r=k+l;
                k=l;
                l=r;
                if (r==x){
                    System.out.print(r+ " ");
                    jumlah=jumlah+x;
                }
            }
        }
        if (a==1){
            jumlah=jumlah+a;
            System.out.println("\njumlah : " +jumlah );
        }
        jumlah=0;
        
        //segitiga
        System.out.print("\nf. Seluruh bilangan segitiga      : ");
        for(int x = a+(n-1)*b; x>=a; x-=b){
            r = (x*(x+1))/2;
            for (int i=n; i>=a; i--){
                if (r==i){
                    System.out.print(r+ " ");
                    jumlah=jumlah+r;
                }
            } r=0;
        }
        System.out.println("\njumlah : "+jumlah); 
    }
}
        
        /*int a, b, n, i, p, q, r, k, jumlah;
        i=0;
        jumlah=0;
        r=0;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nilai akhir (a)        :  ");
        a = input.nextInt();

        System.out.print("Masukan selisih (b)            :  ");
        b = input.nextInt();
        
        System.out.print("Masukan banyak barisan (n)     :  ");
        n = input.nextInt();
        
        System.out.print("\n");
        System.out.print("a. Seluruh bilangan aritmatika : ");
        
        //aritmatika
        for (i= (a + ((n-1)*b)); i>=a; i-=b){
            System.out.print(i+" ");
            jumlah = jumlah + i;
        }
        System.out.print("\n   Jumlah : "+jumlah);
        jumlah = 0;
        
        //genap
        System.out.print("\nb. Seluruh bilangan genap      : ");
        for (i= (a + ((n-1)*b)); i>=a; i-=b){
            if (i%2==0){
                System.out.print(+i+" ");
                jumlah = jumlah + i;
            }
        }
        System.out.print("\n   Jumlah : "+jumlah);
        jumlah = 0;
        
        //ganjil
        System.out.print("\nc. Seluruh bilangan ganjil     : ");
        for (i= (a + ((n-1)*b)); i>=a; i-=b){
            if (i%2 !=0){
                System.out.print(+i+" ");
                jumlah = jumlah + i;
            }
        }
        System.out.print("\n   Jumlah : "+jumlah);  
        jumlah = 0;
        
        //prima 
        System.out.print("\nd. Seluruh bilangan prima      : ");
        for (i= (a + ((n-1)*b)); i>=a; i-=b){
            int penghitung = 0;
            for (int j3=1; j3<=i; j3++){
                if (i%j3==0) 
                    penghitung++;       
            }
            if (penghitung == 2) {
                System.out.print(+i+" ");
                jumlah = jumlah + i;
            }          
        }
        System.out.print("\n   Jumlah : "+jumlah);
        jumlah = 0;
        
        //fibonanci
        System.out.print("\ne. Seluruh bilangan fibonanci  : ");
        for (i= (a + ((n-1)*b)); i>=a; i-=b){
        p=0;
        q=1;
        if (i==1||i==0) {
            System.out.print(i+" ");
        }
        for (k=i; k>=0; k--){
            r = p+1;
            p = q;
            q = r;
            if (r==i){
                System.out.print(r+" ");
                jumlah = jumlah + i;
            }
        }
        }
        if (a==1){
            jumlah = jumlah + a;
        }
        System.out.print("\nJumlah : "+jumlah);
        jumlah = 0;
        
        //segitiga
        System.out.print("\ne. Seluruh bilangan segitiga   : ");
        for (i= (a + ((n-1)*b)); i>=a; i-=b){
            r = (i*(i+1))/2;
            for (k=n; k>=a; k--){
                if (r==1){
                    System.out.print(r+" ");
                    jumlah = jumlah + r;
                }
            }
        }
        System.out.print("\n   Jumlah : "+jumlah);
        jumlah = 0;
        System.out.print("\n");

    }
}*/

