public class Studente {
    private String nome;
    private String cognome;
    private int matricola;
    private int voti[] = new int[10];

    public Studente(String nome, String cognome, int matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
    }

    public String getDati(){
        return nome + cognome + matricola;
    }

    public void setVoto(int voto, int index) {
        if (index >= 0 && index < voti.length) {
            voti[index] = voto;
        }
    }

    public double calcolaMedia(){
        int somma = 0;
        double media;
        for (int i = 0; i < voti.length; i++) {
            somma += voti[i];
        }
        media = (double) somma / voti.length;
        media = Math.round(media * 100.0) / 100.0; // Arrotonda a 2 decimali
        return media;
    }

    public void getVoti() {
        for (int i = 0; i < voti.length; i++) {
            System.out.println("Voto " + (i + 1) + ": " + voti[i]);
        }
    }
}
