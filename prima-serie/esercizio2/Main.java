public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro1 = new Libro("Il signore degli anelli", 1954, "J.R.R. Tolkien");
        Rivista rivista1 = new Rivista("Rivista1", 2077, "1");

        biblioteca.addMateriale(libro1);
        biblioteca.addMateriale(rivista1);

        System.out.println("Elenco materiali:");
        biblioteca.visualizzaMateriali();
        
        System.out.println("\nRimuovo Libro1.\n");
        biblioteca.rimuoviMateriale(libro1);

        System.out.println("Elenco materiali:");
        biblioteca.visualizzaMateriali();
    }
}
