public class Alimentare extends Prodotto{
    private String nomeProdotto;
    private String marca;
    private String dataScadenza;
    private String luogoProduzione;

    public Alimentare(String nomeProdotto, String marca, String dataScadenze, String luogoProduzione, int id, double prezzo){
        this.nomeProdotto = nomeProdotto;
        this.marca = marca;
        this.dataScadenza = dataScadenze;
        this.luogoProduzione = luogoProduzione;
        this.id = id;
        this.prezzo = prezzo;
    }

    @Override
    public String toString(){
        return this.id + "\n" + this.nomeProdotto + "\n"
        + this.prezzo + "\n" + this.dataScadenza + "\n"  + this.marca + "\n"
        + this.luogoProduzione + "\n";
    }
}
