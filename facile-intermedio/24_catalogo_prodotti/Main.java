import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Catalogo<Prodotto> c = new Catalogo<Prodotto>();

        Prodotto p1 = new Prodotto("McLaren P1", 2000, 30);
        Prodotto p2 = new Prodotto("iPhone 16", 1000, 100);

        c.aggiungi(p1); c.aggiungi(p2);

        System.out.println("Prodotti che costano meno di 2000: ");
        // for(Prodotto p : c.getCatalogo()){
        //     if(c.filtra(p->p.getPrezzo()<2000)){
        //         System.out.println(p);
        //     }
        // }

        ArrayList<Prodotto> filtrati = c.filtra(p->p.getPrezzo() < 2000);
        for (Prodotto prodotto : filtrati) {
            System.out.println(prodotto);
        }
    }
}