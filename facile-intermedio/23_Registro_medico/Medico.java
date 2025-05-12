public class Medico{
    private String cognome;
    private String specializzazione; 
    
    public Medico(String cognome, String specializzazione){
        this.cognome = cognome;
        this.specializzazione = specializzazione;
    }

    public String getCognome(){ return this.cognome; }
    public String getSpecializzazione(){ return this.specializzazione; }

    @Override
    public String toString(){
        return this.cognome + " (" + this.specializzazione +")";
    }
}