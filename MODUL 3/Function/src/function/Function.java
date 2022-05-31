package function;
public class Function {
        //function dengan pengembalian
        static int penjumlahan(int a,int b){
            int c = a+b;
            return c;
        }
        //function tanpa pengembalian
        static void pengurangan(int a, int b){
           int c = a-b;
           System.out.print(c);
        }
    public static void main(String[] args) {
        System.out.print("Hasil penjumlahan : "+penjumlahan(3,2));
        System.out.print("\n");
        System.out.print("Hasil pengurangan : ");
        pengurangan(3,2);
        System.out.print("\n");
    }
    
}
