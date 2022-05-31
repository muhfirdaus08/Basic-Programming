package modul5nomor1;
import java.util.Scanner;
import java.text.DecimalFormat;

class DataMahasiswa{

    //variabel global
    static int umur, semes, umurSekarang;
    static double IPK;
    //definisi atribut
    String nama, NIM, kodeDosenPa,tahunLahir, tahunMasuk, mahasiswaIkutMawapres;

    void data(){
        Scanner input = new Scanner (System.in);           
        System.out.print("Masukan Nama              : ");
        this.nama = input.nextLine();
        System.out.print("Masukan NIM               : ");
        this.NIM = input.nextLine();
        System.out.print("Masukan Kode Dosen PA     : ");
        this.kodeDosenPa = input.nextLine();
        System.out.print("Masukan tahun lahir       : ");
        this.tahunLahir = input.nextLine(); 
    }

    //membuat method mengolah mengetahui tahun angkatan
    String Angkatan (String NIM){
        tahunMasuk = this.NIM.substring(4,6);
        return tahunMasuk;
    }

    //membuat method menentukan jurusan
    void Jurusan(String NIM){
        char jur = NIM.charAt(0);
        char jur1 = NIM.charAt(2);

        if ((jur=='F'&& jur1=='D')||(jur=='f'&&jur1=='d')){
            System.out.println("Teknik Informatika");
        } else if ((jur=='f'&& jur1=='D')||(jur=='F'&&jur1=='d')){
            System.out.println("Teknik Informatika");
        } else {
            System.out.println("Bukan Jurusan Teknik Informatika");
        }
    }
 
    //membuat method menetukan semester
    int semeseter (String NIM){
        String tahunmasuk = this.NIM.substring(4,6);
        int a = Integer.parseInt(tahunmasuk);
        int sem = (21-a);
        semes = (2*sem);
        return semes;
    }

    //membuat method menentukan umur
    int umur (String tahunlahir){
        int thnlahir = Integer.parseInt(tahunlahir);
        umurSekarang = 2021 - thnlahir;
        return umurSekarang;
    }

    //Method tampilkan data nomor a
    String dataDisplay (double ipk){
        System.out.println("Nama           : "+this.nama);

        Angkatan(this.NIM);
        System.out.println("Angkatan       : 20"+tahunMasuk);
        
        System.out.print("Jurusan        : ");
        Jurusan(this.NIM);

        semeseter(this.NIM);
        System.out.println("Semester       : "+semes);
        
        DecimalFormat df = new DecimalFormat("#.###"); 
        System.out.println("IPK            : "+df.format(ipk));

        System.out.println("Dosen Pengampu : "+this.kodeDosenPa);

        umur(this.tahunLahir);
        System.out.println("Umur           : "+umurSekarang+" tahun");
        
        //Mahasisiswa Yang Boleh Mengikuti Mawapres
        mahasiswaIkutMawapres = "";
        if (umurSekarang <= 22 && ipk >= 3.00){
            mahasiswaIkutMawapres = this.nama;
        }
        return mahasiswaIkutMawapres;       
    }
    
    //method nomor b
    void DataDosenPa(){
        String dosenPA = this.kodeDosenPa;
        System.out.println(dosenPA);
    }
       
    //method nomor c
    void ampu_IGP (){
        if ("IGP".equals(this.kodeDosenPa)){
            System.out.println(this.nama);
        }
    }
    
    //method nomor d
    void ampu_BI (){
        if ("BI".equals(this.kodeDosenPa)){
            System.out.println(this.nama);
        }
    }
    
    //mmethod nomor e
    void Mawapres (){
        if ("".equals(mahasiswaIkutMawapres)){
            mahasiswaIkutMawapres = mahasiswaIkutMawapres.replaceAll("\\s+","");
        }else {
            System.out.println(mahasiswaIkutMawapres);  
        }
    }
} 

public class Modul5Nomor1 {
    public static void main(String[] args) {
        
        //Membuat object DataMahasiswa
        System.out.println("===Masukan Data Mahasiswa 1===");
        DataMahasiswa mahasiswa1 = new DataMahasiswa();
        mahasiswa1.data();
        System.out.println("===Masukan Data Mahasiswa 2===");
        DataMahasiswa mahasiswa2 = new DataMahasiswa();
        mahasiswa2.data();
        System.out.println("===Masukan Data Mahasiswa 3===");
        DataMahasiswa mahasiswa3 = new DataMahasiswa();
        mahasiswa3.data();
        System.out.println("===Masukan Data Mahasiswa 4===");
        DataMahasiswa mahasiswa4 = new DataMahasiswa();
        mahasiswa4.data();
        System.out.println("===Masukan Data Mahasiswa 5===");
        DataMahasiswa mahasiswa5 = new DataMahasiswa();
        mahasiswa5.data();        
        System.out.println("===Masukan Data Mahasiswa 6===");
        DataMahasiswa mahasiswa6 = new DataMahasiswa();
        mahasiswa6.data();       
        System.out.println("===Masukan Data Mahasiswa 7===");
        DataMahasiswa mahasiswa7 = new DataMahasiswa();
        mahasiswa7.data();     
        System.out.println("===Masukan Data Mahasiswa 8===");
        DataMahasiswa mahasiswa8 = new DataMahasiswa();
        mahasiswa8.data();      
        System.out.println("===Masukan Data Mahasiswa 9===");
        DataMahasiswa mahasiswa9 = new DataMahasiswa();
        mahasiswa9.data();      
        System.out.println("===Masukan Data Mahasiswa 10===");
        DataMahasiswa mahasiswa10 = new DataMahasiswa();
        mahasiswa10.data();   
            
        System.out.println("\n===== a ====");
        System.out.println("===Data Mahasiswa 1===");
        double IPK = 2.55;
        mahasiswa1.dataDisplay(IPK);
        System.out.println("====Data Mahasiswa 2===");
        IPK = IPK + 0.15;
        mahasiswa2.dataDisplay(IPK);        
        System.out.println("====Data Mahasiswa 3===");
        IPK = IPK + 0.15;
        mahasiswa3.dataDisplay(IPK);          
        System.out.println("====Data Mahasiswa 4===");
        IPK = IPK + 0.15;
        mahasiswa4.dataDisplay(IPK);       
        System.out.println("====Data Mahasiswa 5===");
        IPK = IPK + 0.15;
        mahasiswa5.dataDisplay(IPK);        
        System.out.println("====Data Mahasiswa 6===");
        IPK = IPK + 0.15;
        mahasiswa6.dataDisplay(IPK);       
        System.out.println("====Data Mahasiswa 7===");
        IPK = IPK + 0.15;
        mahasiswa7.dataDisplay(IPK);
        System.out.println("====Data Mahasiswa 8===");
        IPK = IPK + 0.15;
        mahasiswa8.dataDisplay(IPK);
        System.out.println("====Data Mahasiswa 9===");
        IPK = IPK + 0.15;
        mahasiswa9.dataDisplay(IPK);
        System.out.println("====Data Mahasiswa 10===");
        IPK = IPK + 0.15;
        mahasiswa10.dataDisplay(IPK);

        System.out.println("\n===== b ====");
        System.out.println("Data Dosen PA berdasarkan data Mahasiswa");
        mahasiswa1.DataDosenPa();
        mahasiswa2.DataDosenPa();
        mahasiswa3.DataDosenPa();
        mahasiswa4.DataDosenPa();
        mahasiswa5.DataDosenPa();
        mahasiswa6.DataDosenPa();
        mahasiswa7.DataDosenPa();
        mahasiswa8.DataDosenPa();
        mahasiswa9.DataDosenPa();
        mahasiswa10.DataDosenPa();

        System.out.println("\n===== c ====");
        System.out.println("Daftar Mahasiswa Yang diampuh oleh IGD");
        mahasiswa1.ampu_IGP();
        mahasiswa2.ampu_IGP();
        mahasiswa3.ampu_IGP();
        mahasiswa4.ampu_IGP();
        mahasiswa5.ampu_IGP();
        mahasiswa6.ampu_IGP();
        mahasiswa7.ampu_IGP();
        mahasiswa8.ampu_IGP();
        mahasiswa9.ampu_IGP();
        mahasiswa10.ampu_IGP();

        System.out.println("\n===== d ====");
        System.out.println("Daftar Mahasiswa Yang diampuh oleh BI");
        mahasiswa1.ampu_BI();
        mahasiswa2.ampu_BI();
        mahasiswa3.ampu_BI();
        mahasiswa4.ampu_BI();
        mahasiswa5.ampu_BI();
        mahasiswa6.ampu_BI();
        mahasiswa7.ampu_BI();
        mahasiswa8.ampu_BI();
        mahasiswa9.ampu_BI();
        mahasiswa10.ampu_BI();

        System.out.println("\n===== e ====");
        System.out.println("Daftar Mahasiswa Yang Boleh Mengikuti PilMapres");
        mahasiswa1.Mawapres();
        mahasiswa2.Mawapres();
        mahasiswa3.Mawapres();
        mahasiswa4.Mawapres();
        mahasiswa5.Mawapres();
        mahasiswa6.Mawapres();
        mahasiswa7.Mawapres();
        mahasiswa8.Mawapres();
        mahasiswa9.Mawapres();
        mahasiswa10.Mawapres();
    }
}