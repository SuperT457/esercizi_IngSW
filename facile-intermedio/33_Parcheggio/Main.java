public class Main {
    public static void main(String[] args) {
        // Creare un parcheggio con 5 posti
        Parcheggio parcheggio = new Parcheggio(5);
        
        // Creare alcune auto
        Auto auto1 = new Auto("AA123BB", "Fiat Panda");
        Auto auto2 = new Auto("CC456DD", "Ford Focus");
        Auto auto3 = new Auto("EE789FF", "Toyota Yaris");
        
        // Simulare entrate
        System.out.println("Parcheggio auto...");
        parcheggio.parcheggiaAuto(auto1);
        parcheggio.parcheggiaAuto(auto2);
        parcheggio.parcheggiaAuto(auto3);
        
        // Stampare lo stato
        parcheggio.stampaStato();
        
        // Simulare un'uscita
        System.out.println("Rimozione auto con targa CC456DD...");
        parcheggio.rimuoviAuto("CC456DD");
        
        // Stampare lo stato aggiornato
        parcheggio.stampaStato();
        
        // Aggiungere una nuova auto
        Auto auto4 = new Auto("GG111HH", "Volkswagen Golf");
        System.out.println("Parcheggio nuova auto...");
        parcheggio.parcheggiaAuto(auto4);
        
        // Stampare lo stato finale
        parcheggio.stampaStato();
    }
}