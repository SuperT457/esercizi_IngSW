public class Rettangolo extends Forma{
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public Rettangolo() {
        this.base = 1; // valore di default
        this.altezza = 2; // valore di default
    }

    public double area() {
        return base * altezza;
    }

    public String getMisure() {
        return base + " " + altezza;
    }
}
