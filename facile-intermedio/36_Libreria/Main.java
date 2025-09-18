import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Libro> biblioteca = new ArrayList<>();

        // Aggiungiamo libri
        biblioteca.add(new Libro("Il Signore degli Anelli", "Tolkien", "Fantasy", 1954));
        biblioteca.add(new Libro("Lo Hobbit", "Tolkien", "Fantasy", 1937));
        biblioteca.add(new Libro("1984", "Orwell", "Distopico", 1949));
        biblioteca.add(new Libro("La fattoria degli animali", "Orwell", "Satira", 1945));
        biblioteca.add(new Libro("Harry Potter e la Pietra Filosofale", "Rowling", "Fantasy", 1997));

        // Filtri combinati: autore = "Orwell" E genere = "Distopico"
        Predicate<Libro> filtroAutore = libro -> libro.getAutore().equalsIgnoreCase("Orwell");
        Predicate<Libro> filtroGenere = libro -> libro.getGenere().equalsIgnoreCase("Distopico");

        List<Libro> risultati = biblioteca.stream()
                                          .filter(filtroAutore.and(filtroGenere))
                                          .collect(Collectors.toList());

        System.out.println("Risultati della ricerca:");
        risultati.forEach(System.out::println);
    }
}

