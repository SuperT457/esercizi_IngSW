import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Prodotto p1 = new Alimentare("Tonno in Scatola", "Riomare", "2029-05-20", "Italia", 1, 100);
        Prodotto p2 = new Elettronica("Processore", "i5 12400F", "Componentistica", "Taiwan", 2, 150);
        Prodotto p3 = new Alimentare("Cetriolo", "Campanella", "2025-07-01", "Francia", 3, 1);

        ArrayList<Prodotto> prodotti = new ArrayList<Prodotto>();
        prodotti.add(p1); prodotti.add(p2); prodotti.add(p3);

        //mostro solo Alimentari
        for(Prodotto prodotto : prodotti){
            if(prodotto instanceof Alimentare) System.out.println(prodotto);
        }
    }
}