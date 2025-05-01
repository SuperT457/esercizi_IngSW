public class Prenotazione {
    public Prenotazione(){}

    public void prenota(Sala s, Film f, int num){
        if(s.getPosti() < num){
            System.err.println("Impossibile prenotare, posti esauriti.");
            return;
        }

        s.nuovaPrenotazione(num);
        System.out.println("Prenotazione per il film " + f.getTitolo() + " avvenuta correttamente.\n");
    }
}
