import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    // Istanza singleton
    private static Logger instance;
    private PrintWriter writer;

    // Percorso file di log
    private static final String LOG_FILE = "app.log";

    // Formattatore per timestamp
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    // Costruttore privato
    private Logger() {
        try {
            // FileWriter in append mode
            writer = new PrintWriter(new FileWriter(LOG_FILE, true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Metodo per ottenere l'istanza singleton
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) { // thread-safe
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    // Metodo per scrivere log
    public void log(String message) {
        String timestamp = LocalDateTime.now().format(formatter);
        writer.println(timestamp + " - " + message);
        writer.flush();
        System.out.println(timestamp + " - " + message); // opzionale: anche su console
    }

    // Metodo per chiudere il file (opzionale)
    public void close() {
        if (writer != null) {
            writer.close();
        }
    }
}
