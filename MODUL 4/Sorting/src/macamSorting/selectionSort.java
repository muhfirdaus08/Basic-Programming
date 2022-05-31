package macamSorting;

public class selectionSort {
    public static void main(String[] args) {
        
        System.out.println("==SELECTION SORT==");
        
        int [][]data2d = {{4,5,3},
                        {1,7,2},
                        {6,9,8}};
        int []data1d = {1,7,5,4,8,9,3,2,6};
        
        System.out.println("Array1D\nSebelum terurut");
        printArray1D(data1d);
        System.out.println("Sesudah terurut");
        selectionSort(data1d);
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
        
        selectionSort(pindah);
        
        a = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = pindah[a];
                a++;
            }
        }
    }
    
    public static void selectionSort (int []array){
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array [min]){
                    min = j;
                }
            }
            if (min != i){
                int tampung = array[i];
                array [i] = array[min];
                array [min] = tampung;
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