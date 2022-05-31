package respondosen;

public class ResponDosen {

    public static int main(String[] daus) {

        
        int a = 0;
        
        while (a<5){
            a+=2;
            System.out.println(a);
        }
        System.out.println("do while ");
        do{
            System.out.println(a);
            a+=2;
            
        }while (a<5);
        return a;
    }
    
}
