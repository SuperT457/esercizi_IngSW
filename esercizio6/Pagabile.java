public interface Pagabile{
    public void effettuaPagamento(double importo) throws SaldoNonDisponibileException;
}