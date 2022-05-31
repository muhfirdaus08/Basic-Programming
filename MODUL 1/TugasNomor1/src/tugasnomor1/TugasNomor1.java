package tugasnomor1;
import java.text.DecimalFormat;
public class TugasNomor1 {
    public static void main(String[] args) {
        
        //Nama program
        System.out.println("\nPROGRAM MENGHITUNG AKAR-AKAR PERSAMAAN KUADRAT");
        System.out.println("");
        
        //Format angka dibelakang koma
        DecimalFormat x=new DecimalFormat("#.#####");
        
        //Deklarasi
        int a, b, c;
        double x1, x2, dalamakar;
        
        //Inisialisasi
        a = 1;
        b = -4;
        c = -6;
        
        //Mencari hasil dalam akar
        dalamakar = Math.pow(b, 2)-(4*a*c);
        
        //Mencari x1 dan x2
        x1 = ((-1*b) + (Math.sqrt(dalamakar)))/(2*a);
        x2 = ((-1*b) - (Math.sqrt(dalamakar)))/(2*a);
        
        //output
        System.out.println("Diketahui persamaan kuadrat : "+a+"x^2"+b+"x"+c);
        System.out.println("");
        System.out.println("Maka diperoleh : ");
        System.out.println("Nilai a =  "+a);
        System.out.println("Nilai b =  "+b);
        System.out.println("Nilai c =  "+c);
        System.out.println("");
        System.out.println("Maka nilai akar - akarnya : ");
        System.out.println("Akar x1 = " +x.format(x1));
        System.out.println("AKar x2 = " +x.format(x2));
        System.out.println("");
    }
    
}
