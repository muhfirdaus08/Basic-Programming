package tugasmodul5;
class TugasModul5 {
    String nama, alamat, nip, t4tugas, jabatan;
    void DataPekerja (String inNama,String inAlamat, String inNIP, String inT4tugas){
        this.nama = inNama;
        this.nip = inNIP;
        this.alamat = inAlamat;
        this.t4tugas = inT4tugas;
        
        System.out.println("Nama            : "+this.nama);
        System.out.println("Alamat          : "+this.alamat);
        System.out.println("NIP             : "+this.nip);
        System.out.println("Tempat tugas    : "+this.t4tugas);
        
        System.out.println("Saya adalah pekerja di PT PLN Tbk (Persero) NTB");
        System.out.println("Saya senang bisa bergabung bersama PT PLN Tbk (Persero) NTB");
    }
    
    public static void main(String[] args) {
        
        System.out.println("PROGRAM DAFTAR KELUARGA PT PLN Tbk (Persero) NTB\n");
        TugasModul5 idenPekerja = new TugasModul5();
 
        //Lombok Barat
        System.out.println("Data Pekerja Lombok Barat");
        System.out.println("Data Pegawai    : ");
        idenPekerja.DataPekerja("Agung Gunawan","Palembang","A46","Lombok Barat");
        idenPekerja.DataPekerja("Bambang Sumantri","Dompu","A47","Lombok Barat");
        idenPekerja.DataPekerja("Agus Gunawan","Bima","A48","Lombok Barat");
        idenPekerja.DataPekerja("Putra Budi","Denpasar","A49","Lombok Barat");
        idenPekerja.DataPekerja("Aya Wijaya","Kendari","A50","Lombok Barat");   
        System.out.println("Data Teknisi    : ");
        idenPekerja.DataPekerja("Susanto","Blitar","A51","Lombok Barat");
        idenPekerja.DataPekerja("Budi Gunawan","Pontianak","A51","Lombok Barat");
        idenPekerja.DataPekerja("Ajun Wigunan","Kota Barru","A52","Lombok Barat");
        idenPekerja.DataPekerja("Andi Laksmana","Pinrang","A53","Lombok Barat");
        idenPekerja.DataPekerja("Bambang Ajun","Gowa","A54","Lombok Barat"); 
        System.out.println("Data Direktur   : ");
        idenPekerja.DataPekerja("Andhika Kurniawan","Lombok Utara","A55","Lombok Barat");

        //Mataram
        System.out.println("Data Pekerja Mataram");
        System.out.println("Data Pegawai    : ");
        idenPekerja.DataPekerja("Budi Gunawa","Pontianak","B07","Mataram");
        idenPekerja.DataPekerja("Agus Wijayanto","Sumenep","B08","Mataram");
        idenPekerja.DataPekerja("Arya Jaya","Madiun","B09","Mataram");
        idenPekerja.DataPekerja("Laksmana Adianto","Wonosobo","B10","Mataram");
        idenPekerja.DataPekerja("Budi Wijaya","Dieng","B11","Mataram");   
        idenPekerja.DataPekerja("Anton Kurnia","Bondowoso","B12","Mataram");
        idenPekerja.DataPekerja("Kurnia Wiguna","Semarang","B13","Mataram");  
        System.out.println("Data Teknisi    : ");
        idenPekerja.DataPekerja("Budi Waseso","Bekasi","B14","Mataram");
        idenPekerja.DataPekerja("Kelvin Chandra","Ciawi","B15","Mataram");
        idenPekerja.DataPekerja("Aryanto","Bandung","B16","Mataram");
        idenPekerja.DataPekerja("Yesi Budiawan","Bogor","B17","Mataram");
        idenPekerja.DataPekerja("Gunawan Ginanto","Ciamis","B18","Mataram"); 
        idenPekerja.DataPekerja("Andi Makarang","Cianjur","B19","Mataram");
        idenPekerja.DataPekerja("Aohana","Sumedang","B20","Mataram");  
        idenPekerja.DataPekerja("Michael Guna","Jeneponto","B21","Mataram");
        idenPekerja.DataPekerja("Chandra","Kendari","B22","Mataram");  
        System.out.println("Data Direktur   : ");
        idenPekerja.DataPekerja("Gunawan Adhiyasa","Kota Bima","B23","Mataram");

        //Lombok Utara
        System.out.println("Data Pekerja Lomobk Utara");
        System.out.println("Data Pegawai : ");
        idenPekerja.DataPekerja("Budiarto","Aceh","C25","Lombok Utara");
        idenPekerja.DataPekerja("Gunawan","Pekan Baru","C26","Lombok Utara");
        idenPekerja.DataPekerja("Bustami","Medan","C27","Lombok Utara");
        idenPekerja.DataPekerja("Cakra Ciputra","Kupang","C28","Lombok Utara");  
        System.out.println("Data Teknisi : ");
        idenPekerja.DataPekerja("Cahirul Huda","Sumab","C29","Lombok Utara");
        idenPekerja.DataPekerja("Chalid Agun","Gianyar","C30","Lombok Utara");
        idenPekerja.DataPekerja("Alam Noor","Lombok Barat","C31","Lombok Utara");
        idenPekerja.DataPekerja("Chris Nata","Kota Bima","C32","Lombok Utara");
        System.out.println("Data Direktur : ");
        idenPekerja.DataPekerja("Michael Laksaman","Bima","C33","Lombok Utara");

        //Lombok Tengah
        System.out.println("Data Pekerja Lombok Tengah");
        System.out.println("Data Pegawai : ");
        idenPekerja.DataPekerja("Indra","Padang","D12","Lombok Tengah");
        idenPekerja.DataPekerja("Lanang","Lampung","D13","Lombok Tengah");
        idenPekerja.DataPekerja("Wijayanto","Tangerang Selatan","D14","Lombok Tengah");
        idenPekerja.DataPekerja("Agun","Bekasi","D15","Lombok Tengah");
        idenPekerja.DataPekerja("Wiguna","Ciawi","D16","Lombok Tengah");   
        idenPekerja.DataPekerja("Laksmana","Blitar","D17","Lombok Tengah"); 
        System.out.println("Data Teknisi : ");
        idenPekerja.DataPekerja("Budi","","Wamena","Lombok Tengah");
        idenPekerja.DataPekerja("Gunawan","Jaya Wijaya","D18","Lombok Tengah");
        idenPekerja.DataPekerja("Ariel","Manokwari","D19","Lombok Tengah");
        idenPekerja.DataPekerja("Indiarto","Kota Bima","D20","Lombok Tengah");
        idenPekerja.DataPekerja("Budi Karim","Dompu","D21","Lombok Tengah"); 
        System.out.println("Data Direktur : ");
        idenPekerja.DataPekerja("Arya Karim","Denpasar","D22","Lombok Tengah");

        //Lombok Timur
        System.out.println("Data Pekerja Lombok Timur");
        System.out.println("Data Pegawai : ");
        idenPekerja.DataPekerja("","","","Lombok Timur");
        idenPekerja.DataPekerja("","","","Lombok Timur");
        idenPekerja.DataPekerja("","","","Lombok Timur");
        idenPekerja.DataPekerja("","","","Lombok Timur");
        idenPekerja.DataPekerja("","","","Lombok Timur");   
        idenPekerja.DataPekerja("","","","Lombok Timur");
        idenPekerja.DataPekerja("","","","Lombok Timur"); 
        idenPekerja.DataPekerja("","","","Lombok Timur");
        idenPekerja.DataPekerja("","","","Lombok Timur"); 
        System.out.println("Data Teknisi : ");
        idenPekerja.DataPekerja("","","","Lombok Timur");
        idenPekerja.DataPekerja("","","","Lombok Timur");
        idenPekerja.DataPekerja("","","","Lombok Timur");
        idenPekerja.DataPekerja("","","","Lombok Timur");
        idenPekerja.DataPekerja("","","","Lombok Timur");
        idenPekerja.DataPekerja("","","","Lombok Timur");
        idenPekerja.DataPekerja("","","","Lombok Timur"); 
        System.out.println("Data Direktur : ");
        idenPekerja.DataPekerja("","","","Lombok Timur");

        //Sumbawa Barat
        System.out.println("Data Pekerja Sumbawa Barat");
        System.out.println("Data Pegawai : ");
        idenPekerja.DataPekerja("","","","Sumbawa Barat");
        idenPekerja.DataPekerja("","","","Sumbawa Barat");
        idenPekerja.DataPekerja("","","","Sumbawa Barat");
        idenPekerja.DataPekerja("","","","Sumbawa Barat");
        idenPekerja.DataPekerja("","","","Sumbawa Barat");   
        System.out.println("Data Teknisi : ");
        idenPekerja.DataPekerja("","","","Sumbawa Barat");
        idenPekerja.DataPekerja("","","","Sumbawa Barat");
        idenPekerja.DataPekerja("","","","Sumbawa Barat");
        idenPekerja.DataPekerja("","","","Sumbawa Barat");
        idenPekerja.DataPekerja("","","","Sumbawa Barat"); 
        System.out.println("Data Direktur : ");
        idenPekerja.DataPekerja("","","","Sumbawa Barat");

        //Sumbawa Besar
        System.out.println("Data Pekerja Sumbawa Besar");
        System.out.println("Data Pegawai : ");
        idenPekerja.DataPekerja("","","","Sumbawa Besar");
        idenPekerja.DataPekerja("","","","Sumbawa Besar");
        idenPekerja.DataPekerja("","","","Sumbawa Besar");
        idenPekerja.DataPekerja("","","","Sumbawa Besar");
        idenPekerja.DataPekerja("","","","Sumbawa Besar");   
        System.out.println("Data Teknisi : ");
        idenPekerja.DataPekerja("","","","Sumbawa Besar");
        idenPekerja.DataPekerja("","","","Sumbawa Besar");
        idenPekerja.DataPekerja("","","","Sumbawa Besar");
        idenPekerja.DataPekerja("","","","Sumbawa Besar");
        idenPekerja.DataPekerja("","","","Sumbawa Besar"); 
        idenPekerja.DataPekerja("","","","Sumbawa Besar");
        idenPekerja.DataPekerja("","","","Sumbawa Besar"); 
        System.out.println("Data Direktur : ");
        idenPekerja.DataPekerja("","","","Sumbawa Besar");

        //Dompu
        System.out.println("Data Pekerja Dompu");
        System.out.println("Data Pegawai : ");
        idenPekerja.DataPekerja("","","","Dompu");
        idenPekerja.DataPekerja("","","","Dompu");
        idenPekerja.DataPekerja("","","","Dompu");
        idenPekerja.DataPekerja("","","","Dompu"); 
        System.out.println("Data Teknisi : ");
        idenPekerja.DataPekerja("","","","Dompu");
        idenPekerja.DataPekerja("","","","Dompu");
        idenPekerja.DataPekerja("","","","Dompu");
        idenPekerja.DataPekerja("","","","Dompu");
        idenPekerja.DataPekerja("","","","Dompu"); 
        idenPekerja.DataPekerja("","","","Dompu"); 
        System.out.println("Data Direktur : ");
        idenPekerja.DataPekerja("","","","Dompu");

        //Bima
        System.out.println("Data Pekerja Bima");
        System.out.println("Data Pegawai : ");
        idenPekerja.DataPekerja("","","","Bima");
        idenPekerja.DataPekerja("","","","Bima");
        idenPekerja.DataPekerja("","","","Bima");
        idenPekerja.DataPekerja("","","","Bima");
        idenPekerja.DataPekerja("","","","Bima");   
        System.out.println("Data Teknisi : ");
        idenPekerja.DataPekerja("","","","Bima");
        idenPekerja.DataPekerja("","","","Bima");
        idenPekerja.DataPekerja("","","","Bima");
        idenPekerja.DataPekerja("","","","Bima"); 
        System.out.println("Data Direktur : ");
        idenPekerja.DataPekerja("","","","Bima");
        
        //Kota Kota Bima
        System.out.println("Data Pekerja Kota Bima");
        System.out.println("Data Pegawai : ");
        idenPekerja.DataPekerja("","","","Kota Bima");
        idenPekerja.DataPekerja("","","","Kota Bima");
        idenPekerja.DataPekerja("","","","Kota Bima");
        idenPekerja.DataPekerja("","","","Kota Bima");
        idenPekerja.DataPekerja("","","","Kota Bima");   
        idenPekerja.DataPekerja("","","","Kota Bima");
        idenPekerja.DataPekerja("","","","Kota Bima");   
        System.out.println("Data Teknisi : ");
        idenPekerja.DataPekerja("","","","Kota Bima");
        idenPekerja.DataPekerja("","","","Kota Bima");
        idenPekerja.DataPekerja("","","","Kota Bima");
        idenPekerja.DataPekerja("","","","Kota Bima");
        idenPekerja.DataPekerja("","","","Kota Bima"); 
        idenPekerja.DataPekerja("","","","Kota Bima");   
        System.out.println("Data Direktur : ");
        idenPekerja.DataPekerja("","","","Kota Bima");
    }
}
