public class Persona{
    private String nome;
    private int age;

    public Persona(String nome, int age){
        this.nome=nome;
        this.age=age;
    }

    public String toString(){
        return this.nome + " " + this.age;
    }
}