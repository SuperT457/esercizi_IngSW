package contatore_generico;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Integer numeri[] = new Integer[10];
        String words[] = new String[3];
        Random rand = new Random();
        Contatore<Integer> c1 = new Contatore<>();
        Contatore<String> c2 = new Contatore<>();

        words[0]="Ciao";
        words[1]="bel";
        words[2]="maschione";

        for(int i=0;i<numeri.length;i++){
            numeri[i]=rand.nextInt()*10+1;
        }

        for(Integer num : numeri){
            c1.aggiungi(num);
        }

        for (String string : words) {
            c2.aggiungi(string);
        }

        System.out.println("Conteggio interi: " + c1.getConto());
        System.out.println("Conteggio stringhe: " + c2.getConto());
    }
}
