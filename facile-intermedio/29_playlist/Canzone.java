public class Canzone {
    private String autore;
    private String durata;
    private String titolo;
    
    public Canzone(String autore, String titolo, String durata){
        this.autore = autore;
        this.durata = durata;
        this.titolo = titolo;
    }

    public int duratatoInt(){
        String[] parti = this.durata.split(":");
        int minuti = Integer.parseInt(parti[0]);
        int secondi = Integer.parseInt(parti[1]);

        return minuti*60 + secondi;
    }

    public String toString(){
        return "Autore: " + this.autore + "\n" +
        "Titolo: " + this.titolo + "\n" +
        "Durata: " + duratatoInt();
    }
}
