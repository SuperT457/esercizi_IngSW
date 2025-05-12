public class OrdineNegozio implements Spedibile{
    private String metodoPagamento;
    private float prezzo;
    private String filiale;
    private String articolo;
    
    public OrdineNegozio(String articolo, String metodoPagamento, float prezzo, String filiale){
        this.metodoPagamento = metodoPagamento;
        this.prezzo = prezzo;
        this.filiale = filiale;
        this.articolo = articolo;
    }

    public void spedizione(){
        System.out.print("Articolo \'" + articolo + "\' (" +prezzo+ ") acquistato con " + metodoPagamento + " in negozio a " + filiale + "\n");
    }
}
