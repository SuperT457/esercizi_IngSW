public class Impiegato extends Dipendente{
    
    Impiegato(String nome, String cognome, double stipendio){
        super(nome, cognome, stipendio);
    }

    public double calcolaStipendio(){
        return stipendio;
    }

    public String getRuolo(){
        return "Impiegato ";
    }

}