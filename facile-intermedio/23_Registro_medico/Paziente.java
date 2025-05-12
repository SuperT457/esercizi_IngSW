public class Paziente{
    private String nome;
    private String cognome;
    
    public Paziente(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
    }

    public Paziente(){}

    public String getNome(){ return nome; }
    public String getCognome(){ return cognome; }

    public String toString(){
        return this.nome + " " + this.cognome;
    }
    
    public void setNome(String nome){ this.nome = nome; }
    public void setCognome(String cognome) { this.cognome = cognome; }
}