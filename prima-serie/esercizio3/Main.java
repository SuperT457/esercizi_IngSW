import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        List<AnimaleBase> animali = new ArrayList<AnimaleBase>();
        animali.add(new Gatto("Tuli"));
        animali.add(new Cane("Ragù"));

        for(AnimaleBase animale:animali){
            System.out.println(animale.toString());
            animale.emettiVerso();
            animale.muoviti();
            System.out.println();
        }        
    }
    
}
