public abstract class ContoBancario{
    protected String id_utente;

    public abstract double calcolaInteresse();

    public String getUtente(){ return this.id_utente; }
}