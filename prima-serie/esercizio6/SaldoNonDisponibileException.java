public class SaldoNonDisponibileException extends Exception {
    public SaldoNonDisponibileException(){
        super("Saldo non disponibile con questo metodo di pagamento.\n");
    }

    public SaldoNonDisponibileException(double diff){
        super("Impossibile completare pagamento, mancano " + diff + " soldi\n");
    }
}
