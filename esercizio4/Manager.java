public class Manager extends Dipendente{
    
    private double bonus = 0.13;
    
    public Manager(String nome, String cognome, double stipendio){
        super(nome, cognome, stipendio);
    }
    
    public double calcolaStipendio(){
        return this.stipendio + this.stipendio*bonus;
    }
    
    public String getRuolo(){
        return "Manager ";
    }
}