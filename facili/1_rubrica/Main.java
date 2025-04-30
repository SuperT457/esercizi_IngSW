import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Contatto> rubrica = new ArrayList<Contatto>();
        rubrica.add(new Contatto("Giulio","Tosi","0123456789"));
        rubrica.add(new Contatto("Ale","Lazza","0987654321"));    
        
        for (Contatto contatto : rubrica) {
            System.out.println(contatto);
        }

        rubrica.get(1).setNome("Prof");
        rubrica.get(1).setCognome("Lazzarini");

        System.out.println("Dopo la modifica:");

        for (Contatto contatto : rubrica) {
            System.out.println(contatto);
        }
    }
}
