public abstract class MetodoPagamento implements Pagabile{
    
    protected double saldoDisponibile;

    protected MetodoPagamento(){}

    public abstract void effettuaPagamento(double importo) throws SaldoNonDisponibileException;

    public abstract void getInfo();

}
