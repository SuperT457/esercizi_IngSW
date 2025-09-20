public class Insegnante extends Persona {
    private String materia;

    public Insegnante(String nome, String materia) {
        super(nome);
        this.materia = materia;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Materia: " + materia;
    }
}
