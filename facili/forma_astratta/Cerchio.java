public class Cerchio extends Forma {
    private double raggio;
    
    public Cerchio(double raggio) {
        this.raggio = raggio;
    }

    public Cerchio() {
        this.raggio = 1; // valore di default
    }

    public double area() {
        return Math.PI * raggio * raggio;
    }

    public double getRaggio() {
        return raggio;
    }
}
