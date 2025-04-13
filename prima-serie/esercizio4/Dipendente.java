public abstract class Dipendente{
    protected double stipendio;
    protected String nome;
    protected String cognome;

    public Dipendente(String nome, String cognome, double stipendio){
        this.stipendio = stipendio;
        this.nome = nome;
        this.cognome = cognome;
    }

    public abstract double calcolaStipendio();
    public abstract String getRuolo();

    @Override
    public String toString(){
        return getRuolo() + nome + " " + cognome + " " + calcolaStipendio();
    }
}