package responakhirmodul5;
import java.util.Scanner;

class Buku {
    String judul, kategori, tahunTerbit, nomorUrut;
    
    void novel (String in_id_buku){
        switch (in_id_buku) {
            case "1010320":
                judul = "Judul              : Memori Janji Es Krim";
                nomorUrut = "Nomor Urut     : 03";
                kategori = "Kategori        : Action";
                tahunTerbit = "Tahun Terbit : 2020";
                break;
            case "1020320":
                judul = "Judul              : The Time We Walk Together";
                nomorUrut = "Nomor Urut     : 03";
                kategori = "Kategori        : Comedy";
                tahunTerbit = "Tahun Terbit : 2020";
                break;
            case "1030214":
                judul = "Judul              : Skripsick : Derita Mahasiswa Abadi";
                nomorUrut = "Nomor Urut     : 02";
                kategori = "Kategori        : Romance";
                tahunTerbit = "Tahun Terbit : 2014";
                break;
            default:
                break;
        }
        System.out.println(judul); 
        System.out.println(nomorUrut); 
        System.out.println(kategori); 
        System.out.println(tahunTerbit); 
    }
    
    void manga (String in_id_buku){
        switch (in_id_buku) {
            case "2010117":
                judul = "Judul              : Jujutsu Kaisen";
                nomorUrut = "Nomor Urut     : 01";
                kategori = "Kategori        : Action";
                tahunTerbit = "Tahun Terbit : 2017";
                break;
            case "2020219":
                judul = "Judul              : Osananajimi ga Zettai ni Makenai Love Comedy";
                nomorUrut = "Nomor Urut     : 02";
                kategori = "Kategori        : Comedy";
                tahunTerbit = "Tahun Terbit : 2019";
                break;
            case "2030401":
                judul = "Judul              : Fullmetal Alchemist";
                nomorUrut = "Nomor Urut     : 04";
                kategori = "Kategori        : Romance";
                tahunTerbit = "Tahun Terbit : 2001";
                break;
            default:
                break;
                
            
        }
        System.out.println(judul); 
        System.out.println(nomorUrut); 
        System.out.println(kategori); 
        System.out.println(tahunTerbit); 
    }
}
public class Main {
    public static void main(String[] args) {
        Buku dataBuku = new Buku ();
        
        Scanner input = new Scanner (System.in);
        System.out.println("Program ");
        System.out.print("Masukan Id Buku Yang Ingin Dicari : ");
        String id = input.nextLine();
        dataBuku.manga(id);
        dataBuku.novel(id);
    }
    
}
