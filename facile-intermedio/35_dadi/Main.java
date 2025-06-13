import java.util.ArrayList;
import java.util.Comparator;

public class Main{
    public static void main(String[] args){
        Giocatore g1 = new Giocatore("Luca");
        Giocatore g2 = new Giocatore("SuperT");
        Giocatore g3 = new Giocatore("null");
        int nTurni = 5;
        ArrayList<Giocatore> giocatori = new ArrayList<Giocatore>();
        giocatori.add(g1); giocatori.add(g2); giocatori.add(g3);

        for(int i=0;i<nTurni;i++){
            for(Giocatore giocatore : giocatori) {
                giocatore.lanciaDadi();
                giocatore.infoPlayer();
            }   
        }   
        

        Giocatore migliore = giocatori.stream().max(Comparator.comparingInt(g->g.getPunti())).orElse(null);
        
        System.out.println("Giocatore migliore:\n");
        System.out.println(migliore.infoPlayer());
    }
}