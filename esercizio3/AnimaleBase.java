public abstract class AnimaleBase implements Animale{

    protected String nome;
    AnimaleBase(String nome){
        this.nome = nome;
    }

    @Override
    public abstract String toString();
    
}