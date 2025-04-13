public class Moto extends MezzoDiTrasporto{
    public Moto(String targa){
        super(targa);
    }

    public void avvia(){
        System.out.println("Moto con targa " + this.targa + " avviata");
    }

    public void ferma(){
        System.out.println("Moto con targa " + this.targa + " fermata");
    }

    public void getTipo(){
        System.out.println("Moto");
    }
}
