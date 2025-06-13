import java.util.Random;

public class Giocatore{
    private int punti=0;
    private String nome;
    private Random random = new Random();

    public Giocatore(String nome){
        this.nome = nome;
    }

    public String getNome(){ return this.nome; }

    public int getPunti(){ return this.punti; }

    public String infoPlayer() { return this.nome + ": " + this.punti; }

    public void lanciaDadi(){
        this.punti += random.nextInt(1,7);
    }
}