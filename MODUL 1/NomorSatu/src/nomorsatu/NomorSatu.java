package nomorsatu;
import java.text.DecimalFormat;
public class NomorSatu {

    public static void main(String[] args) {
        System.out.println("PROGRAM MENGHITUNG AKAR PERSAMAAN KUADRAT");
        //Deklarasi
        int a,b,c;
        double dalamakar, x1, x2;
        //Inisalisasi
        a=1;
        b=-4;
        c=-6;
        
        System.out.println("Diketahui persamaan kuadrat : "+a+"x^2"+b+"x"+c);
        System.out.println("Nilai a = "+a);
        System.out.println("Nilai b = "+b);
        System.out.println("Nilai c = "+c);
        System.out.println("Maka diperoleh :");
        
        //Proses
        dalamakar = Math.pow(b,2) - (4*a*c);
        x1 = ((-1*b) + (Math.sqrt(dalamakar)))/(2*a);
        x2 = ((-1*b) - (Math.sqrt(dalamakar)))/(2*a);
        
        DecimalFormat z = new DecimalFormat("#.#####");
        System.out.println("Nilai x1 =  "+z.format(x1));
        System.out.println("Nilai x2 =  "+z.format(x2));
    }
    
}
