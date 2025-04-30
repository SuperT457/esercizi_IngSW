public class Contatto {
    private String nome, cognome;
    private String numero;

    public Contatto(String nome, String cognome, String numero){
        this.nome = nome;
        this.cognome = cognome;
        this.numero = numero;
    }

    public String getNome() { return this.nome; }
    public String getCognome() { return this.cognome; }
    public String getNumero() { return this.numero; }

    public void setNome(String nome) { this.nome = nome; }
    public void setCognome(String cognome) { this.cognome = cognome; }
    public void setNumero(String numero) { this.numero = numero; }

    @Override
    public String toString(){
        return this.nome + " " + this.cognome + " " + this.numero;
    }
}
