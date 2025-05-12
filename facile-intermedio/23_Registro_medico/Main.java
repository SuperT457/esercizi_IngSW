import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        //Prima Visita
        Medico m1 = new Medico("Cavallaro", "Ginecologo");
        Paziente p1 = new Paziente("Pan", "Goccioli");
        Visita v1 = new Visita("13/05/2025", "69:69", m1, p1, "\"Controllo\"");

        //Seconda Visita
        Medico m2 = new Medico("Sofi B.", "Ammazza-Cinghiali");
        Paziente p2 = new Paziente("Povero", "Cinghiale");
        Visita v2 = new Visita("13/05/2025", "13:15", m2, p2, "Eh...");

        //Terza Visita
        Visita v3 = new Visita("14/05/2025", "16:30", m2, p1, "X-Rays");

        System.out.println(v1.getInfo() + "\n" + v2.getInfo());

        ArrayList<Visita> visite = new ArrayList<Visita>();

        visite.add(v1);
        visite.add(v2);
        visite.add(v3);

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    
        try{
            String nome, cognome;

            System.out.println("Inserisci nome paziente da cercare: ");
            nome=input.readLine();

            System.out.println("Inserisci cognome: ");
            cognome=input.readLine();
            System.out.println("\nVisite trovate:");
            for (Visita visita : visite) {
                if(visita.getPaziente().getNome().equals(nome) && visita.getPaziente().getCognome().equals(cognome)){
                    System.out.println(visita.getInfo());
                }
            }
        }catch(IOException e){
            System.err.println(e);
            System.exit(1);
        }

    }
}