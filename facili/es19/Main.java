public class Main {
    public static void main(String[] args) {
        Pagabile fattura = new Fattura(100, 22);
        Pagabile abbonamento = new Abbonamento(10, 6);
        System.out.println("Totale fattura: " + fattura.calcolaTotale());
        System.out.println("Totale abbonamento: " + abbonamento.calcolaTotale());
    }
}
