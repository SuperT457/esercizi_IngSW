public class Sala {
    private int numero_posti;

    public Sala(int posti){
        this.numero_posti = posti;
    }

    public Sala(){
        this.numero_posti = 50;
    }

    public int getPosti(){
        return this.numero_posti;
    }

    public void nuovaPrenotazione(int num){
        numero_posti-=num;
    }
}
