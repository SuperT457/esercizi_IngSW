import java.lang.Override;
import java.lang.String;

public class Libro extends MaterialeBibliotecario{
    private String autore;

    public Libro(String titolo, int annoPubblicazione, String autore){
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.autore = autore;

    }

    @Override
    public String toString(){
        return this.titolo + " " + this.annoPubblicazione + " " + this.autore;            
    }

}