public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        // Generiamo log da eventi diversi
        logger.log("Applicazione avviata");
        logger.log("Utente effettuato login");
        logger.log("Errore: input non valido");
        logger.log("Salvataggio dati completato");
        logger.log("Applicazione terminata");

        // Chiudiamo il logger
        logger.close();
    }
}