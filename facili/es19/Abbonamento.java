public class Abbonamento implements Pagabile {
    private double quotaMensile;
    private int mesi;

    public Abbonamento(double quotaMensile, int mesi) {
        this.quotaMensile = quotaMensile;
        this.mesi = mesi;
    }

    @Override
    public double calcolaTotale() {
        return quotaMensile * mesi;
    }
}
