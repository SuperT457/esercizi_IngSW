package contatore_generico;

public class Contatore<T> {
    private int contatore=0;

    public void aggiungi(T element){
        contatore++;
    }

    public int getConto(){
        return contatore;
    }
}
