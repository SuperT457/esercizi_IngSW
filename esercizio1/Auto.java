public class Auto extends MezzoDiTrasporto{
    public Auto(String targa){
        super(targa);
    }

    public void avvia(){
        System.out.println("Auto con targa " + this.targa + " avviata");
    }

    public void ferma(){
        System.out.println("Auto con targa " + this.targa + " fermata");
    }

    public void getTipo(){
        System.out.println("Auto");
    }
}