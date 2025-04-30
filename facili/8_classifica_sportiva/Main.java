package classifica_sportiva;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        ArrayList<Squadra> squadre = new ArrayList<>();
        squadre.add(new Squadra("Scuderia Ferrari", 100));
        squadre.add(new Squadra("Mercedes", 90));
        squadre.add(new Squadra("Red Bull Racing", 95));

        squadre.sort(Comparator.comparingInt(Squadra::getPunti).reversed());
        System.out.println("Classifica Squadre:");
        for (Squadra squadra : squadre) {
            System.out.println(squadra.getNome() + " - " + squadra.getPunti() + " punti");
        }
    }   
}
