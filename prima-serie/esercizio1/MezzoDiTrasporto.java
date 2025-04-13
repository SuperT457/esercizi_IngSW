public abstract class MezzoDiTrasporto implements Veicolo{
    protected String targa;

    public MezzoDiTrasporto(String targa){
        this.targa = targa;
    }

    public abstract void avvia();
    public abstract void ferma();
    public abstract void getTipo();
}