import java.util.ArrayList;
import java.util.Random;

public class Main{
    public static void assegnavoti(Studente studente) {
        int indice=0;
        while(indice<10){
            Random rand = new Random();
            int voto = rand.nextInt(18,31);
            //System.out.println("Voto: " + voto);
            studente.setVoto(voto, indice);
            indice++;
        }
    }
    public static void main(String[] args) {
    
        ArrayList<Studente> studenti = new ArrayList<>();
        studenti.add(new Studente("Mario", "Rossi", 12345));
        studenti.add(new Studente("Giulio","Tosi",189876));
        studenti.add(new Studente("Ines", "Kristo", 987654));

        for (Studente studente : studenti) {
            Main.assegnavoti(studente);    
        }

        for (Studente studente : studenti) {
            System.out.println("Studente: " + studente.getDati());
            System.out.println("Media: " + studente.calcolaMedia() + "\n");
        }
    }
}