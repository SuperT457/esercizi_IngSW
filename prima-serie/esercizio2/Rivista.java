public class Rivista extends MaterialeBibliotecario{
    private String numeroEdizione;

    public Rivista(String titolo, int annoPubblicazione, String numeroEdizione){
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.numeroEdizione = numeroEdizione;
    }

    @Override
    public String toString(){
        return this.titolo + " " + this.annoPubblicazione + " " + this.numeroEdizione;
    }
}