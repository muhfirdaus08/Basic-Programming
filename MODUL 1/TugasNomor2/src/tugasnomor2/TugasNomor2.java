package tugasnomor2;
import java.text.DecimalFormat;
public class TugasNomor2 {
    public static void main(String[] args) {
        
        //Nama program
        System.out.println("PROGRAM MENGHITUNG KECEPATAN DAN WAKTU");
        System.out.println("");
        
        //Format angka dibelakang koma
        DecimalFormat x=new DecimalFormat("#.#");
        
        //Deklarasi
        int s;
        float v1, v2, vtotal, t1, t2, ttotal;
        
        //Inisialisasi
        s  = 1500;        //jarak kota aska ke kota galaksi
        v1 = 20;          //kecepatan kendaraan Mr. Dum (km/jam)
        v2 = (float)21.5; //kecepatan kendaraan Mr. Stum (km/jam)
        
        //Proses
        t1 = s/v1;        //waktu tempuh kendaraan Mr. Dum (jam)
        t2 = s/v2;        //waktu tempuh kendaraan Mr. Stum (jam)
        vtotal = ((v1*t1) + (v2*t2))/(t1+t2); //Kecepatan setelah digabungkan
        ttotal = s/vtotal;                    //Waktu tempuh setelah digabungkan
        
        //Output
        System.out.println("Diketahui : ");
        System.out.println("Jarak tempuh      = "+s+" km");
        System.out.println("Kecepatan pertama = "+v1+" km/jam");
        System.out.println("Kecepatan kedua   = "+v2+" km/jam");
        System.out.println("");
        System.out.println("Maka diperoleh");
        System.out.println("Kecepatan kendaraan setelah digabungkan    = "+x.format(vtotal)+" km/jam");
        System.out.println("Waktu tempuh kendaraan setelah digabungkan = "+x.format(ttotal)+" jam");
        System.out.println("");
        System.out.println("Kesimpulan :");
        System.out.println("Kendaraan tersebut tidak dapat tiba ke kota Asska dibawah 24 jam");
        System.out.println("");
    }
    
}
