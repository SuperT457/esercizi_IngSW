package incapsulamento_base;

class Persona{
    private String nome;
    private String eta;

    public Persona(String nome, String eta){
        this.nome = nome;
        this.eta = eta;
    }

    public String getNome(){
        return nome;
    }

    public String getEta(){
        return eta;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEta(String eta){
        this.eta = eta;
    }

    @Override
    public String toString(){
        return "persona di nome:" + nome + " ed eta': " + eta;
    }
}

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Giulio", "20");
        
        System.out.println("Creata " + p.toString());

        System.out.println("Modifico nome e eta\' della persona...");
        
        p.setNome("SuperT");
        p.setEta("21");

        System.out.println("Modificata " + p.toString());
    }
}
