import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<MaterialeBibliotecario> materiale = new ArrayList<MaterialeBibliotecario>();

    public Biblioteca(){}

    public void addMateriale(MaterialeBibliotecario m){
        materiale.add(m);
    }

    public void rimuoviMateriale(MaterialeBibliotecario m){
        materiale.remove(m);
    }

    public void visualizzaMateriali(){
        for(MaterialeBibliotecario m : materiale){
            System.out.println(m);
        }
    }
}
