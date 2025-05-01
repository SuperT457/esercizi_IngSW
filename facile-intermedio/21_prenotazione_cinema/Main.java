public class Main{
    public static void main(String[] args){
        Sala s = new Sala(10);
        Film f = new Film("Super Mario Bros");
        Prenotazione p = new Prenotazione();

        p.prenota(s, f, 2);
        p.prenota(s, f, 50);
    }
}