import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Libro> libri = new ArrayList<>();
        libri.add(new Libro("Il nome della rosa", "Umberto Eco", 1980));
        libri.add(new Libro("1984", "George Orwell", 1949));
        libri.add(new Libro("Il piccolo principe", "Antoine de Saint-Exupéry", 1943));

        for (Libro l : libri) {
            System.out.println(l.getTitolo() + ", " + l.getAutore() + ", " + l.getAnno());
        }
    }
}
