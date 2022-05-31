package tugasmodul4;
public class tugasmodul4 {
   // Metoda main
   public static void main(String[] args) {
    
      int[] larikInt = {9,1,5,2,10,6,8,7,3,4};
 
      // Menampilakan elemen larik sesuai urutan aslinya
      System.out.println("Elemen array sebelum diurutkan :");
      for (int x = 0; x < larikInt.length; x++)
         System.out.print(larikInt[x] + "  ");
 
      // Mengurutkan larik
      mengurutkanElemen(larikInt);
 
      // Menampilkan elemen larik setelah diurutkan
      System.out.println("\n\nElemen array setelah diurutkan :");
      for (int x = 0; x < larikInt.length; x++)
         System.out.print(larikInt[x] + "  ");
 
      // Menambah spasi baris kosong
      System.out.println();
    
   } // Akhir blok metoda main
 
   // Metoda mengurutkanElemen
   public static void mengurutkanElemen(int[] larikA) {
      for (int x = larikA.length - 1; x >= 1; x--) {
         for (int j = 0; j <= x; j++) {
            if (larikA[j] > larikA[x])
               menukar(larikA, j, x);
         }
      }
   }
 
   // metoda menukar
    public static void menukar(int[] larikB, int indekj, int indekx) {
      int sementara;
 
      sementara = larikB[indekx];
      larikB[indekx] = larikB[indekj];
      larikB[indekj] = sementara;
   }
}
 
