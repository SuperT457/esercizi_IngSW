import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SquadraNazionale implements Comparable<SquadraNazionale> {
    private String nome;
    private int punti;
    private int differenzaReti; // opzionale: usabile come ulteriore criterio

    public SquadraNazionale(String nome, int punti, int differenzaReti) {
        this.nome = nome;
        this.punti = punti;
        this.differenzaReti = differenzaReti;
    }

    public String getNome() {
        return nome;
    }

    public int getPunti() {
        return punti;
    }

    public int getDifferenzaReti() {
        return differenzaReti;
    }

    @Override
    public int compareTo(SquadraNazionale other) {
        // Ordina prima per punti (decrescente)
        int cmp = Integer.compare(other.punti, this.punti);
        if (cmp != 0) {
            return cmp;
        }
        // Se stessi punti, ordina per differenza reti (decrescente)
        cmp = Integer.compare(other.differenzaReti, this.differenzaReti);
        if (cmp != 0) {
            return cmp;
        }
        // Infine per nome in ordine alfabetico crescente
        return this.nome.compareToIgnoreCase(other.nome);
    }

    @Override
    public String toString() {
        return String.format("%-20s %3d pts  (diff reti: %d)", nome, punti, differenzaReti);
    }
}

public class Main{
    // Main di esempio
    public static void main(String[] args) {
        List<SquadraNazionale> classifica = new ArrayList<>();
        classifica.add(new SquadraNazionale("Italia", 18, 12));
        classifica.add(new SquadraNazionale("Francia", 20, 15));
        classifica.add(new SquadraNazionale("Germania", 18, 10));
        classifica.add(new SquadraNazionale("Spagna", 20, 14));
        classifica.add(new SquadraNazionale("Portogallo", 15, 5));
        classifica.add(new SquadraNazionale("Belgio", 18, 12)); // stesso punti e diff reti di Italia

        // Ordina usando compareTo
        Collections.sort(classifica);

        // Stampa la classifica ordinata
        System.out.println("Pos  Squadra              Punti  (Diff reti)");
        System.out.println("--------------------------------------------");
        int pos = 1;
        for (SquadraNazionale s : classifica) {
            System.out.printf("%2d. %s%n", pos++, s);
        }
    }
}