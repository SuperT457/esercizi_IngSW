public class Main{
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Nessun argomento fornito. Uscita...");
            return;
        }

        int somma = 0;
        for (String arg : args) {
            try {
                int numero = Integer.parseInt(arg);
                somma += numero;
            } catch (NumberFormatException e) {
                System.out.println("Errore: '" + arg + "' non è un numero valido.");
            }
        }

        System.out.println("La somma dei numeri forniti è: " + somma);
    }
}