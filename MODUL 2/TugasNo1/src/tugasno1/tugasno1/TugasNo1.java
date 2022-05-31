package tugasno1;
import java.util.Scanner;
public class TugasNo1 {
     public static void main(String[] args) {
        
        int w, a, b, c, x, y, z, tampung, tampung2;
        int angka;
        char d;
        
        Scanner input = new Scanner (System.in);
        System.out.print("Masukan banyak data : ");
        angka = input.nextInt();
         
        w = angka;
        for (a = angka; a>=1; a--) {
            for (b=a; b<angka; b++){
                System.out.print(" ");
            }
            for (c=1; c<=w; c++){
                System.out.print(c);
            }
                System.out.println();
                w--;
        }
       
        for (a=1; a<=angka; a++){
            for (b=angka; b>a; b--){
                System.out.print(" ");                
            }
            for (c=1; c<=b; c++){
                    System.out.print(c);
                }
            System.out.print("\n");
        }
        
        System.out.print("\n");
        System.out.print("Masukan character : ");
        d = input.next().charAt(0);
        System.out.print("Masukan banyak data : ");
        angka = input.nextInt();
        
        // //Satu
        // for (x=1; x<=angka; x++){
        //     for (y=1; y<=angka; y++){
        //         System.out.print(y);
        //     }
        //     System.out.print("\n");
        // }
        
        // //Dua
        // System.out.println("\n");
        // for (x=1; x<=angka; x++){
        //     for (y=1; y<=x; y++){
        //         System.out.print(y);
        //         if (x==y){
        //             break;
        //         }
        //     }
        //     System.out.print("\n");
        // }
        
        // //Tiga
        // System.out.println("\n");
        // for (x=1; x<=angka; x++){
        //     for (y=1; y<=angka; y++){
        //         System.out.print(y);
        //         if ((x+y)==angka+1){
        //             break;
        //         }
        //     }
        //     System.out.print("\n");
        // }
        
        // //Empat
        // System.out.print("\n");
        // tampung = (angka*2);
        // for (x=1; x<=tampung; x++){
        //     if (x==tampung){
        //         break;
        //     }
        //     for (y=1; y<=tampung; y++){
        //         System.out.print(y);
        //         if (x==y){
        //             break;
        //         }
        //         else if ((x+y)==tampung){
        //             break;
        //         }
        //     }
        //     System.out.print("\n");
            

        // }
        // tampung = 0;
        
        // System.out.print("\n");
        // //Tugas sendiri
        // for (x=angka; x>=1; x--){
        //     for (y=x; y<=angka; y++){
        //         System.out.print(" ");
        //     }
        //     for (z=1; z<=angka; z++){
        //         System.out.print(z);
        //     }
        //     System.out.print("\n");
        // }
        // //segitiga siku siku kanan bawah
        // for (x=1; x<=angka; x++){
        //     for (y=angka; y>x; y--){
        //         System.out.print(" ");                
        //     }
        //     for (z=1; z<=y; z++){
        //             System.out.print(z);
        //         }
        //     System.out.print("\n");
        // }

        // //persegi
        // System.out.println("\n");
        // tampung = (angka*2)+1;
        // tampung2 = angka+1;
        // for (x=1; x<=tampung2; x++){
        //     for (y=1; y<=tampung; y++){
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }
        
        // //persegi
        // System.out.println("\n");
        // tampung = (angka*2)+1;
        // tampung2 = angka+1;
        // for (x=1; x<=tampung2; x++){
        //     for (y=1; y<=tampung; y++){
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }
        // //ketupat
        // System.out.println("\n");
        // for (x =0;x<9;x++){
        //     for(y=0;y<9;y++){

        //         if ((x+y<4)||((x-y>=5)&&(x-y<=8))){
        //             System.out.print("   ");
        //         }
        //         else if((y-5==x)||(x+y>12)){
        //             break;
        //         }
        //         else{
        //             System.out.print(" * ");
        //         }
        //     }
        //     System.out.println("\n");

        // }
        // //Huruf H
        // for (x=1; x<=angka; x++){
        //     for (y=1; y<=angka; y++){
        //         if (y==1 && x>=1 && x<=angka || y==angka && x>=1 && x<=angka || x==(angka+1)/2 && y>=1 && y<=angka){
        //             System.out.print(d+" ");
        //         }
        //         else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.print("\n");
        // }
        // System.out.print("\n");
        // //Huruf O
        // for (x=1; x<=angka; x++){
        //     for (y=1; y<=angka; y++){
        //         if (x==1 && y>=1 && y<=angka || x==angka && y>=1 && y<=angka || y==1 && x>=1 && x<=angka ||  y==angka && x>=1 && x<=angka){
        //             System.out.print(d+" ");
        //         }
        //         else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.print("\n");
        // }
        // System.out.print("\n");
        //Huruf I
        for (x=1; x<=angka; x++){
            for (y=1; y<=angka; y++){
                if (x==1 && y>=1 && y<=angka || y==(angka+1)/2 && x>=2 && x<=angka-1 || x==angka && y>=1 && y<=angka){
                    System.out.print(d+" ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        } 
        System.out.print("\n");
        //Huruf C
        for (x=1; x<=angka; x++){
            for (y=1; y<=angka; y++){
                if (x==1 && y>=1 && y<=angka || x==angka && y>=1 && y<=angka || y==1 && x>=1 && x<=angka){
                    System.out.print(d+" ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        //Huruf L
        for (x=1; x<=angka; x++){
            for (y=1; y<=angka; y++){
                if (y==1 || x==angka ){
                    System.out.print(d+" ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        //Huruf T
         for (int i = 1; i <= angka; i++) {
             for (int j = 1; j <= angka; j++) {
                if (i==1 && j>=1 && j<=angka || j==(angka+1)/2 && i>=2 && i<=angka){
                     System.out.print(d+" ");
                }else {
                     System.out.print("  ");
                }
            }
             System.out.println();
             
        }
        System.out.print("\n");
        //Huruf U
        for (x=1; x<=angka; x++){
            for (y=1; y<=angka; y++){
                if (y==1 && x>=1 && x<=angka || y==angka && x>=1 && x<=angka || x==angka && y>=1 && y<=angka){
                    System.out.print(d+" ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}

