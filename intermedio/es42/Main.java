import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Prestabile> materiali = new ArrayList<>();
        materiali.add(new Libro("Il nome della rosa"));
        materiali.add(new Rivista("Focus"));
        materiali.add(new Libro("1984"));
        materiali.add(new Rivista("National Geographic"));

        System.out.println("Prestito materiali:");
        for (Prestabile m : materiali) {
            m.presta();
            System.out.println(m);
        }
        System.out.println("\nRestituzione materiali:");
        for (Prestabile m : materiali) {
            m.restituisci();
            System.out.println(m);
        }
    }
}
