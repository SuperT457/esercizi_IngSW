public class ContoCorrente extends ContoBancario{
    private double interesse = 1.0;

    public ContoCorrente(String id_utente){
        this.id_utente = id_utente;
    }

    public double calcolaInteresse(){
        return 10;
    }
}