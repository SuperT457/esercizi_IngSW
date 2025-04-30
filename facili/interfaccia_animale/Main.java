package interfaccia_animale;

class Cane extends Animale{
    private String nome, razza;

    public Cane(String nome, String razza){
        this.nome = nome;
        this.razza = razza;
    }

    public void verso(){
        System.out.println(nome + " fa: Bau bau!!");
    }

    public String getDati(){
        return "Il Cane " + nome + "e' un " + razza;
    }

}

class Gatto extends Animale{
    private String nome, razza;

    public Gatto (String nome, String razza){
        this.nome = nome;
        this.razza = razza;
    }

    public void verso(){
        System.out.println(nome + " dice: Miao miao nigga!");
    }

    public String getDati(){
        return "Il gatto " + nome + "e' un " + razza;
    }
}

public class Main{
    public static void main(String[] args){
        Animale a[] = new Animale[2];

        a[0] = new Cane("Peter", "Meticcio");
        a[1] = new Gatto("Tuli", "boh");

        a[0].verso();
        a[1].verso();
    }
}