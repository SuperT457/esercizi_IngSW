import java.util.HashMap;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Uso corretto: java LoginSystemHash <username> <password>");
            System.exit(1);
        }

        String inputUsername = args[0];
        String inputPassword = args[1];
        String hashedInputPassword = Main.hashPassword(inputPassword);
        HashMap<String, String> utenti = new HashMap<>();
        
        utenti.put("admin", Main.hashPassword("1234"));
        utenti.put("utente1", Main.hashPassword("password"));
        utenti.put("mario", Main.hashPassword("ciao123"));

        if (utenti.containsKey(inputUsername)) {
            String storedHash = utenti.get(inputUsername);
            if (storedHash.equals(hashedInputPassword)) {
                System.out.println("Login effettuato con successo!");
            } else {
                System.out.println("Password errata.");
            }
        } else {
            System.out.println("Utente non trovato.");
        }
    }

    private static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes());

            // Converte byte[] in Stringa esadecimale
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Errore nel calcolo dell'hash", e);
        }
    }
}
