import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Canzone c1 = new Canzone("Tony2milli", "Odio il governo", "2:30");
        Canzone c2 = new Canzone("Kendrick", "Die Hard", "3:56");
        
        ArrayList<Canzone> playlist = new ArrayList<Canzone>();
        playlist.add(c2); playlist.add(c1);

        for (Canzone canzone : playlist) {
            System.out.println(canzone);
        }
    }
}
