public class Prodotto {
    private String nome;
    private float prezzo;
    private int disponibilita;

    public Prodotto(String nome, float prezzo, int disponibilita){
        this.nome = nome;
        this.prezzo = prezzo;
        this.disponibilita = disponibilita;
    }

    public String getNome() { return this.nome; }
    public float getPrezzo() { return this.prezzo; }
    public int getDisponibilita() { return this.disponibilita; }

    public String toString(){
        return this.nome + ",prezzo: " + this.prezzo + ", disponibilità: " + this.disponibilita;
    }
}
