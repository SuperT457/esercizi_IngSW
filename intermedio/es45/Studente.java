public class Studente extends Persona {
    private String matricola;

    public Studente(String nome, String matricola) {
        super(nome);
        this.matricola = matricola;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Matricola: " + matricola;
    }
}
