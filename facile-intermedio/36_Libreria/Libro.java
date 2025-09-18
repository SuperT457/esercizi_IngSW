public class Libro {
    private String titolo;
    private String autore;
    private String genere;
    private int anno;

    public Libro(String titolo, String autore, String genere, int anno) {
        this.titolo = titolo;
        this.autore = autore;
        this.genere = genere;
        this.anno = anno;
    }

    // Getters
    public String getTitolo() { return titolo; }
    public String getAutore() { return autore; }
    public String getGenere() { return genere; }
    public int getAnno() { return anno; }

    @Override
    public String toString() {
        return titolo + " | " + autore + " | " + genere + " | " + anno;
    }
}

