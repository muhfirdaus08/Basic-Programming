package modul5nomor2;
import java.util.Scanner;

class data {

    Scanner input = new Scanner (System.in);
    //definisi atribut
    String noStnk, tanggalStnk, noReg, namaPemilik, alamat, merk, type, jenis, model;
    String tahunBuat, isiSilinder, noRangka, noMesin, warna, bbm, warnaTnkb, tahunReg;
    String noBpkb, kodeLokasi, noUrutDaftar, masaBerlaku;

    //constructror
    data(){

        //input data bagian atas
        System.out.print("Masukan nomor STNK : ");
        noStnk = input.nextLine();
        System.out.print("Masukan tanggal pembuatan STNK : ");
        tanggalStnk = input.nextLine();

        //input data bagian kiri bawah
        System.out.print("Masukan nomor registrasi : ");
        noReg = input.nextLine();
        System.out.print("Masukan nama pemilik : ");
        namaPemilik = input.nextLine();
        System.out.print("Masukan alamat : ");
        alamat = input.nextLine();
        System.out.print("Masukan merk: ");
        merk = input.nextLine();
        System.out.print("Masukan type : ");
        type = input.nextLine();
        System.out.print("Masukan jenis : ");
        jenis = input.nextLine();
        System.out.print("Masukan model : ");
        model = input.nextLine();
        System.out.print("Masukan tahun pembuatan : ");
        tahunBuat = input.nextLine();
        System.out.print("Masukan isi silinder : ");
        isiSilinder = input.nextLine();
        System.out.print("Masukan nomor rangka : ");
        noRangka = input.nextLine();
        System.out.print("Masukan nomor mesin : ");
        noMesin = input.nextLine();

        //input data bagian kanan bawah
        System.out.print("Masukan warna : ");
        warna = input.nextLine();
        System.out.print("Masukan bahan bakar: ");
        bbm = input.nextLine();
        System.out.print("Masukan warna TNKB : ");
        warnaTnkb = input.nextLine();
        System.out.print("Masukan tahun registrasi : ");
        tahunReg = input.nextLine();
        System.out.print("Masukan nomor BPKB : ");
        noBpkb = input.nextLine();
        System.out.print("Masukan kode lokasi : ");
        kodeLokasi = input.nextLine();
        System.out.print("Masukan no urut pendaftaran : ");
        noUrutDaftar = input.nextLine();
        System.out.print("Masukan masa berlaku : ");
        masaBerlaku = input.nextLine();
        
        System.out.flush();
        System.out.print("\n\n");

    }

    //definisi method
    void korpStnk (){
        System.out.println("KEPOLISIAN NEGARA REPUBLIK INDONESIA\t\tA. N. KAPOLDA : "+tanggalStnk);
        System.out.println("\t\t\tNo :    "+noStnk);
        System.out.println("SURAT TANDA NOMOR KENDARAAN BERMOTOR\t\tDIREKTUR LALU LINTAS");
        System.out.println("\t\t\t\t        BUDI INDRA  DERMAWAN, S. I. K., M.M");
        System.out.println("\t\t\t\t      ---------------------------------------");
        System.out.println("\t\t\t\t              KOMBES POL NRP 70100277");
    }

    void bottomStnk(){
        System.out.println("Nomor Registrasi : "+noReg);
        System.out.println("Nama pemilik     : "+namaPemilik);
        System.out.println("Alamat           : "+alamat);
        System.out.println("Merk             : "+merk+          "\t\t\t\tWarna                :"+warna);
        System.out.println("Type             : "+type+          "\t\t\t\tBahan Bakar          :"+bbm);
        System.out.println("Jenis            : "+jenis+         "\t\t\t\tWarna TNKB           :"+warnaTnkb);
        System.out.println("Model            : "+model+         "\t\t\t\tTahun Registrasi     :"+tahunReg);
        System.out.println("Tahun Pembuatan  : "+tahunBuat+     "\t\t\t\tNomor BPKB           :"+noBpkb);
        System.out.println("Isi silinder     : "+isiSilinder+   "\t\t\t\tKode Lokasi          :"+kodeLokasi);
        System.out.println("Nomor Rangka     : "+noRangka+      "\t\t\t\tNo. Urut Pendaftaran :"+noUrutDaftar);
        System.out.println("Nomor Mesin      : "+noMesin+       "\t\t\t\tBerlaku Sampai       :"+masaBerlaku);

        System.out.print("\n\n");

    }
}

public class Modul5Nomor2 {
    public static void main(String[] args) {
        data surat = new data();
        surat.korpStnk();
        surat.bottomStnk();
    }  
}
    
