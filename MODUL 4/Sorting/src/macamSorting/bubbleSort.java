package macamSorting;

public class bubbleSort {
    public static void main(String[] args) {
        
        System.out.println("==BUBBLE SORT==");
        
        int [][]data2d = {{4,5,3},
                        {1,7,2},
                        {6,9,8}};
        int []data1d = {1,7,5,4,8,9,3,2,6};
        
         System.out.println("Array1D\nSebelum terurut");
        printArray1D(data1d);
        System.out.println("Sesudah terurut");
        bubbleSort(data1d);
        printArray1D(data1d);
        
        System.out.println("\nArray2D\nSebelum terurut");
        printArray2D(data2d);
        System.out.println("Sesudah terurut");
        bubbleSortFinal(data2d);
        printArray2D(data2d);
        
    }
    public static void bubbleSortFinal (int [][]array){
        int a = 0;
        int []pindah = new int [9];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                pindah[a] = array[i][j];
                a++;
            }
        }
        
        bubbleSort(pindah);
        
        a = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = pindah[a];
                a++;
            }
        }
    }
    
    public static void bubbleSort (int []array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array [j+1]){
                    int tampung = array [j];
                    array [j] = array [j+1];
                    array [j+1] = tampung;
                }
            }
        }
    }
    
    public static void printArray2D (int [][]array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public static void printArray1D (int []array){
        for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]+" ");
        }
        System.out.println("");  
    }
}
