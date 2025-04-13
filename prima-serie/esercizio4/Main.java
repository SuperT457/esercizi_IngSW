public class Main{
    public static void main(String[] args){
        Azienda azienda = new Azienda();

        azienda.aggiungiDipendente(new Impiegato("Giulio", "Tosi", 200000));
        azienda.aggiungiDipendente(new Impiegato("Steve", "Jobs", 1.5));
        azienda.aggiungiDipendente(new Manager("Alessandro", "Lazzarini", 40000));

        System.out.println("Lista dipendenti e i loro stipendi: ");
        azienda.StampaDipendenti();

        System.out.println("Totale stipendi: "+azienda.stipendiTotali());


    }
}