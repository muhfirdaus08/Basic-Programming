
package nomor2modul4;

public class main {
    public static void main(String[] args) {
        //membuat objek tanggalnow
        data tanggalnow = new data();
        
        //mengisi atribut
        tanggalnow.tanggalsekarang = "06-01-2017";
        tanggalnow.nomor = "06444148";
        
        //menjalankan method
        tanggalnow.tanggaldanNomor();
        
    }
}
