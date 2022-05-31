package jurnalsatu;
import java.util.Scanner;
public class JurnalSatu {
    
     public static void main(String[] args) {
        System.out.println("Program Menghitung Tinggi Air");
        
        int tahun, bantu, j, x=0;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan tahun : ");
        tahun = input.nextInt();
        
        if (tahun>=1){
            x=x+5;
            System.out.println("Air laut naik dalam 1 tahun : "+x);
        }
        for (int i=2; i<=tahun; i++) {
            int tampung = 0;
            for (j=2; j<i; j++){
                if (i%j==0) {
                    tampung = 1;
                } 
            }
            if (tampung==0) {
                x=x+7;
                System.out.println("Air laut naik dalam "+i+" tahun : "+x);
            }
            else {
                x=x+5;
                System.out.println("Air laut naik dalam "+i+" tahun : "+x);
            }     
        } 
        System.out.print("Kenaikan air laut selama "+tahun+" tahun : "+x+" cm\n");
    }
}       
        
        /*
        for (int i=1; i<=tahun; i++) {
            if (i==1){
                x += 5;
                System.out.println("Air laut naik dalam "+i+" tahun : "+x);  
            } else if ((i>3) && ((i%2==0) || (i%3==0))){
                x += 5;
                System.out.println("Air laut naik dalam "+i+" tahun : "+x);  
            } else {
                x += 7;
                System.out.println("Air laut naik dalam "+i+" tahun : "+x);
            }
            
        }System.out.println("Kenaikan air laut selama "+tahun+" tahun : "+x);
        
    } 
    
}
                
        /*int y=tahun%i;
        if (y==0){
            x++;
            }  
        }      
        if (x==2){
        for (int z=1; z<=tahun ; z++){
            totalprima=totalprima+7;
            System.out.println("Air laut naik dalam "+z+" tahun : "+totalprima+" cm");
               } 
        } 
        else {
        for (int z=1; z<=tahun ; z++){
            totalbukanprima=totalbukanprima+5;
            System.out.println("Air laut naik dalam "+z+" tahun : "+totalbukanprima+" cm");
        } 
           
                    
        }
        
    } 
    
}*/

