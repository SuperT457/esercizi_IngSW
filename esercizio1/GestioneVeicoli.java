import java.util.ArrayList;

public class GestioneVeicoli {
    public static void main(String[] args) {
        ArrayList<MezzoDiTrasporto> listaVeicoli = new ArrayList<MezzoDiTrasporto>();
        
        for(int i=0; i<5; i++){
            listaVeicoli.add(new Auto("AA" + i+i+i + "AA"));
            listaVeicoli.add(new Moto("MM" + i+i+i + "MM"));
        }

        for(int i=0;i<listaVeicoli.size();i++){
            System.out.println("Veicolo " + i);
            listaVeicoli.get(i).avvia();
            listaVeicoli.get(i).ferma();
            System.out.println("L'elemento n. " +(i+1)+ " è un " + listaVeicoli.get(i).getClass().getName());
            System.out.println("\n");
        }
    }
}
