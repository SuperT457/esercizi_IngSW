import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Luca", 22);
        HashMap<String, Object> mappa = ObjectMapper.toMap(p);
        System.out.println("Mappa: " + mappa);
        Persona p2 = ObjectMapper.fromMap(mappa);
        System.out.println("Persona ricostruita: " + p2);
    }
}
