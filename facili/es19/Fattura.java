public class Fattura implements Pagabile {
    private double importo;
    private double iva;

    public Fattura(double importo, double iva) {
        this.importo = importo;
        this.iva = iva;
    }

    @Override
    public double calcolaTotale() {
        return importo + (importo * iva / 100);
    }
}
