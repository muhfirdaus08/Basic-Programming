package changenumbertowords;
import java.util.Scanner;

public class ChangeNumberToWords {
    
    private String change (int number){
        String [] num = {" "," Satu"," Dua"," Tiga"," Empat"," Lima"," Enam",
                        " Tujuh"," Delapan"," Sembilan"};
        String [] num1011 = {" Sepuluh", " Sebelas"};
        String save = " ";
        switch (number) {
            case 10:
                save = num1011[0]; break;
            case 11:
                save = num1011[1]; break;
            default:
                break;
        }
        if (number<10){
            save = num[number];
        }
        else if(number<20){
            if (number==10||number==11){
                //kosong
            }
            else {
                save = change(number-10) + " Belas";
            }     
        }
        else if(number<100){
            save = change(number/10) + " Puluh" + change(number%10);
        }
        else if(number<200){
            save = " Seratus " + change(number-100);
        }
        else if(number<1000){
            save = change(number/100) + " Ratus" + change(number%100);
        }
        else if(number<2000){
            save = " Seribu "+ change(number-1000);
        }
        else if(number<1000000){
            save = change(number/1000) + " Ribu" + change (number%1000);
        }
        else if(number<2000000){
            save = " Satu Juta"+ change(number-1000000);
        }
        else if(number<100000000){
            switch (number) {
                case 10000000:
                    save = " Sepuluh Juta"; break;
                case 11000000:
                    save = " Sebelas Juta"; break;
                default:
                    save = change(number/1000000) + " Juta" + change (number%1000000);
                    break;
            }
        }
        else if(number<200000000){
            switch (number) {
                case 110000000:
                    save = " Seratus Sepuluh Juta"; break;
                case 111000000:
                    save = " Seratus Sebelas Juta"; break;
                default:
                    save = " Seratus "+ change(number-100000000);
                    break;
            }
        }
        else if(number<1000000000){
            save = change(number/100000000) + " Ratus" + change (number%100000000);
        }
        else if(number<2000000000){
            save = " Satu Milyar"+ change(number-1000000000);
        }
        return save;
    }
    
    public static void main(String[] args) {
        
        char yesno;
        
        ChangeNumberToWords convert = new ChangeNumberToWords();
        
        System.out.println("\nPROGRAM MENGUBAH ANGKA MENJADI ANGKA TERBILANG");
        
        do {
            Scanner input = new Scanner (System.in);
            System.out.print("\nMasukan angka   : ");
            int numberIn = input.nextInt();

            if (numberIn >= 2000000000){
                System.out.println("Angka Terlalu Besar! Angka Harus dibawah 2 Milyar");
            }
            else {    
            String word = convert.change(numberIn);
            System.out.println("Angka terbilang :"+word);
            }
            System.out.print("Coba angka lain? Y/N : ");
            yesno = input.next().charAt(0);
            
        } while(yesno=='y'||yesno=='Y');      
    }  
}
