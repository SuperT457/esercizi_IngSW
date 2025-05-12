public class OrdineOnline implements Spedibile{
    private int id;
    private float prezzo;
    private String indirizzoSpedizione;

    
    public OrdineOnline(int id, float prezzo, String indirizzoSpedizione){
        this.id = id;
        this.prezzo = prezzo;
        this.indirizzoSpedizione = indirizzoSpedizione;
    }
    
    public void spedizione(){
        System.out.println("Ordine " + this.id + " spedito a " + this.indirizzoSpedizione + "(" + this.prezzo +")\n");
    }

    public int getId(){ return this.id; }
    public float getPrezzo() { return this.prezzo; }
    public String getIndirizzo(){ return this.indirizzoSpedizione; }
}
