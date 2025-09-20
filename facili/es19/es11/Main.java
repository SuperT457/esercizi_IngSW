import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Prodotto> prodotti = new ArrayList<>();
        prodotti.add(new Prodotto("Pane", "A01", 1.2));
        prodotti.add(new Prodotto("Latte", "A02", 0.9));
        prodotti.add(new Prodotto("Pasta", "A03", 1.5));

        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci codice prodotto da cercare: ");
        String codice = sc.nextLine();
        boolean trovato = false;
        for (Prodotto p : prodotti) {
            if (p.getCodice().equals(codice)) {
                System.out.println("Trovato: " + p.getNome() + ", Prezzo: " + p.getPrezzo());
                trovato = true;
                break;
            }
        }
        if (!trovato) {
            System.out.println("Prodotto non trovato.");
        }
        sc.close();
    }
}
