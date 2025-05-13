import java.util.ArrayList;
import java.util.function.Predicate;

public class Catalogo<T>{
    ArrayList<T> catalogo = new ArrayList<T>();

    public void aggiungi(T elemento){ catalogo.add(elemento); }

    public ArrayList<T> getCatalogo(){ return this.catalogo; }

    public ArrayList<T> filtra(Predicate<T> filtro){
        ArrayList<T> result = new ArrayList<T>();
        for(T elemento : catalogo){
            if(filtro.test(elemento)){
                result.add(elemento);
            }
        }
        return result;
    }
}