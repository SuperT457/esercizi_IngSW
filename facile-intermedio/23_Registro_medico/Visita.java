public class Visita{
    private String data;
    private String ora;
    private Medico m;
    private Paziente p;
    private String tipoVisita;

    public Visita(String data, String ora, Medico m, Paziente p, String tipoVisita){
        this.data = data;
        this.ora = ora;
        this.m = m;
        this.p = p;
        this.tipoVisita = tipoVisita;
    }

    public String getInfo(){
        return "Paziente: " + p.toString() + "\nVisita: " + this.toString() + "\nCon medico: " + m.toString() + "\n";
    }

    public String toString(){
        return this.tipoVisita + " " + this.data + " " + this.ora;
    }

    public Paziente getPaziente(){
        return this.p;
    }
}