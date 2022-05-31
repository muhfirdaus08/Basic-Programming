package nomor2baru;
public class Nomor2Baru{
    public static void main(String[] args) {
        // 1 pon = 13 ion > 1 pon = 13*21 cal = 273 cal
        // 1 ion = 21 cal > 1 cal = 1/273 pon
        
        /*Rincian pengeluaran Ijang secara keseluruhan
        a = Biaya nginap = 3*50 
        b = Oleh-oleh = 240 ion
        c = Biaya tiket ke Kazakhstan = 159 ion
        d = Biaya M&G Dayana = 9000 call/21 
        e = Tiket pesawat ke Indonesia = 99 pon*13 ion 
        f = Gaji kotor = Gaji - potongan = 10 pon - 1250/273
        g = Total pengeluaran seluruhnya tanpa dihitung gaji = a+b+c+d
        h = Total uang mula mula = 110 pon/ 1430 ion/ 30030 cal
        i = Jumlah uang tersisa tanpa hitung gaji
        cari = jumlah uang yg harus dicari untuk membeli tiket = e - i
        */
        
        //Deklarasi
        float dompetsatu;
        float dompetdua;
        float dompettiga;
        int totalhari;
        
        //Inisialisasi dalam Ion
        float a = 150;
        float b = 240;
        float c = 159;
        float d = 9000/13;
        float e = 99;               //dalam pon
        float f = (10)-(1250/273);  //gaji kotor dalam pon
        float f1= 1250/273;         //potongan gaji dalam pon
        float g = a+b+c+d;
        float h = 1430;
        float i = (h - g)/13;
        
        float cari = e-i; //jumlah uang yg harus dicari untuk membeli tiket 
        
        //Proses
        dompetsatu = (a/13) + (b/13) + (c/13);
        dompetdua  = a + b + c;
        dompettiga = (a*21) + (b*21) + (c*21);
        totalhari  = (int) (cari/f);
        
        //PERTANYAAN
        //Nomor Dua A
        System.out.println("a. Biaya pengeluaran Ijang selama di Amerika");
        System.out.println("   " +dompetsatu + " Pon");
        System.out.println("   " +dompetdua + " Ion");
        System.out.println("   " +dompettiga + " Cal");
        
        //Nomor Dua B
        System.out.println("b. Jumlah hari Ijang harus bekerja selama "+totalhari+" hari" );
        
        //Nomor Dua C
        System.out.println("c. Potongan gaji Ijang adalah "+f1+" Pon dan gaji kotor yang diterima adalah "+f+" Pon");
        
        //Nomor Dua D
        System.out.println("d. Ijang bisa kembali ke Indonesia namun harus bekerja ");
        System.out.println("   selama " +totalhari+ " hari untuk mengumpulkan uang sebesar 99 Pon");      
    }   
}
