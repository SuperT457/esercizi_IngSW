import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class Studente{
    private String nome;
    public int[] presenze = new int[7];

    public Studente(String nome){
        this.nome = nome;
    }

    public Studente(){
        this.nome = "gigio";
    }

    public String getNome() { return this.nome;}

    public void setPresenze(int[] presenze){
        this.presenze = presenze;
    }

    public int getPresenzeTotali(){
        int sum=0;
        for(int i=0;i<presenze.length;i++){
            sum+=presenze[i];
        }

        return sum;
    }
}

public class Main {
    public static void gestisciPresenze(int[] presenze){
        Random rand = new Random();
        for(int i=0;i<7;i++){
            presenze[i]=rand.nextInt(0,2);
        }
    }
    public static void main(String[] args) {
        Studente s1 = new Studente("Giulio");
        Studente s2 = new Studente();
        int[] flag_presenze = new int[7];
        HashMap<String,Integer> presenze = new HashMap<>();

        Main.gestisciPresenze(flag_presenze);
        s1.setPresenze(flag_presenze);

        Main.gestisciPresenze(flag_presenze);
        s2.setPresenze(flag_presenze);

        presenze.put(s1.getNome(),s1.getPresenzeTotali());
        presenze.put(s2.getNome(), s2.getPresenzeTotali());

        for(Map.Entry<String, Integer> entry : presenze.entrySet()){
            System.out.println("Studente: " + entry.getKey());
            System.out.println("Presenze questa settimana: " + entry.getValue() + "\n\n");
        }
    }
}
