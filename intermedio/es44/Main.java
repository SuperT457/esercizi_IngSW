import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero 1: ");
        double a = sc.nextDouble();
        System.out.print("Numero 2: ");
        double b = sc.nextDouble();
        System.out.print("Operazione (+, -, *, /): ");
        String op = sc.next();
        Operazione operazione;
        switch (op) {
            case "+": operazione = new Somma(); break;
            case "-": operazione = new Sottrazione(); break;
            case "*": operazione = new Moltiplicazione(); break;
            case "/": operazione = new Divisione(); break;
            default:
                System.out.println("Operazione non valida");
                sc.close();
                return;
        }
        try {
            double risultato = operazione.calcola(a, b);
            System.out.println("Risultato: " + risultato);
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
        sc.close();
    }
}
