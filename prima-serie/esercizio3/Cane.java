public class Cane extends AnimaleBase{
    
    public Cane(String nome){
        super(nome);
    }

    public void emettiVerso(){
        System.out.println("Bau!! Bau!!");
    }

    public void muoviti(){
        System.out.println(this.nome + " salta e corre in giro e fa un disastroooo, ma è molto simpatico");
    }

    public String toString(){
        return "Stai giocando con il cane " + nome;
    }
    
}