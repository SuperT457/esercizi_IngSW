import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        ArrayList<Forma> forme = new ArrayList<Forma>();
        Random rand = new Random();

        for (int i=0;i<5;i++){
            double raggio=rand.nextDouble(1,10);
            double base=rand.nextDouble(1,10);
            double altezza=rand.nextDouble(1,10);
            raggio = Math.round(raggio*100.0)/100.0;
            base = Math.round(base*100.0)/100.0;
            altezza = Math.round(altezza*100.0)/100.0;

            forme.add(new Cerchio(raggio));
            forme.add(new Rettangolo(base, altezza));
        }

        for(Forma forma : forme){
            if (forma instanceof Cerchio) {
                System.out.println("Raggio: " + ((Cerchio) forma).getRaggio());
            } else if (forma instanceof Rettangolo) {
                System.out.println("Base e altezza: " + ((Rettangolo) forma).getMisure());
            }
            String area = String.format("%.2f",forma.area());

            System.out.println("Area: " + area);
        }
    }
}
