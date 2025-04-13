import java.util.ArrayList;
import java.util.List;

public class Azienda {
    List<Dipendente> dipendenti = new ArrayList<Dipendente>();

    public void aggiungiDipendente(Dipendente d){
        dipendenti.add(d);
    }

    
    public void StampaDipendenti(){
        for(Dipendente d : dipendenti){
            System.out.println(d);
        }
    }

    public double stipendiTotali(){
        double totale = 0;
        for(Dipendente d:dipendenti){
            totale += d.calcolaStipendio();
        }

        return totale;
    }


}