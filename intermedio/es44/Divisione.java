public class Divisione extends Operazione {
    @Override
    public double calcola(double a, double b) {
        if (b == 0) throw new ArithmeticException("Divisione per zero");
        return a / b;
    }
}
