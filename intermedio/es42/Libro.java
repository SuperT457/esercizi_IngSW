public class Libro extends MaterialeBibliotecario implements Prestabile {
    private boolean inPrestito = false;

    public Libro(String titolo) {
        super(titolo);
    }

    @Override
    public boolean presta() {
        if (!inPrestito) {
            inPrestito = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean restituisci() {
        if (inPrestito) {
            inPrestito = false;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Libro: " + getTitolo() + (inPrestito ? " (in prestito)" : " (disponibile)");
    }
}
