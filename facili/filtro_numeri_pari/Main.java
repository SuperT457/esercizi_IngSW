package filtro_numeri_pari;
import java.util.Random;
import java.util.ArrayList;

public class Main {
    public static void stampaPari(ArrayList<Integer> arr) {
        for (Integer numero : arr) {
            if(numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }
    public static void main(String[] args){
        Random rand = new Random();
        int arr_size = rand.nextInt(15) + 1; 
        ArrayList<Integer> arr = new ArrayList<>(arr_size);
        
        System.out.println("Dimensione dell'array: " + arr_size);
        
        for(int i=0; i<arr_size;i++){
            arr.add(rand.nextInt(100)+1);
        }
        
        System.out.println("Numeri generati: " + arr);
        
        System.out.println("\nNumeri pari: ");
        Main.stampaPari(arr);
        
    }
}
