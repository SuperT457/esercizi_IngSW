import java.util.HashMap;

public class ObjectMapper {
    public static HashMap<String, Object> toMap(Persona p) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("nome", p.getNome());
        map.put("eta", p.getEta());
        return map;
    }

    public static Persona fromMap(HashMap<String, Object> map) {
        String nome = (String) map.get("nome");
        int eta = (int) map.get("eta");
        return new Persona(nome, eta);
    }
}
