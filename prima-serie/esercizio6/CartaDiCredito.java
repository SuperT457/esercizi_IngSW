public class CartaDiCredito extends MetodoPagamento {
    private String numeroCarta;

    public CartaDiCredito(double saldo, String numeroCarta){
        this.numeroCarta = numeroCarta;
        this.saldoDisponibile = saldo;
    }

    public void effettuaPagamento(double importo) throws SaldoNonDisponibileException{
        if(this.saldoDisponibile < importo){
            throw new SaldoNonDisponibileException(); 
        }
        this.saldoDisponibile -= importo;
        System.out.println("Pagamento effettuato con Carta di Credito.");
        System.out.println("Saldo rimanente dopo l'acquisto: " + this.saldoDisponibile);
    }

    public void getInfo(){
        System.out.println("Metodo: Carta di credito\n");
        System.out.println("Carta numero: " + this.numeroCarta);
        System.out.println("Saldo disponibile: " + this.saldoDisponibile);        
    }

}