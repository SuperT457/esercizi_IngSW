public class Gatto extends AnimaleBase{

    public Gatto(String nome){
        super(nome);
    }

    public void emettiVerso(){
        System.out.println("Miao!! Miao!!");
    }

    public void muoviti(){
        System.out.println(this.nome + " si muove silenziosamente e poi sto bastardo e butta giu tutto le cose dai tavoli");
    }

    public String toString(){
        return "Stai giocando con il gatto " + nome;
    }

}