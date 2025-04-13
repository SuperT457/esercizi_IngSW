public class PayPal extends MetodoPagamento {

    private String account;
    
    public PayPal(String conto, double saldo){
        this.account = conto;
        this.saldoDisponibile = saldo;
    }

    public void effettuaPagamento(double importo) throws SaldoNonDisponibileException{
        if(importo > this.saldoDisponibile){
            throw new SaldoNonDisponibileException(importo-this.saldoDisponibile);
        }
        this.saldoDisponibile -= importo;
        System.out.println("Pagamento effettuato con PayPal.\nSaldo rimanente: " + this.saldoDisponibile);
    }
    
    public void getInfo(){
        System.out.println("Metodo: PayPal\n");
        System.out.println("Conto: " + this.account);
        System.out.println("Saldo disponibile: " + this.saldoDisponibile);
    }
}
