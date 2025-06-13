public class Elettronica extends Prodotto{
    public String nome;
    public String versione;
    public String settore;
    public String provenienza;
    
    public Elettronica(String nome, String versione, String settore, String provenienza, int id, double prezzo){
        this.nome = nome;
        this.versione = versione;
        this.settore = settore;
        this.provenienza = provenienza;
        this.id = id;
        this.prezzo = prezzo;
    }

    public String toString(){
        return this.id + "\n" +
        this.nome + "\n" + 
        this.prezzo + "\n" +
        this.provenienza + "\n" +
        this.versione + "\n" +
        this.settore + "\n";
    }
}