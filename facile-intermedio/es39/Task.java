import java.time.LocalDate;

public class Task {
    private String descrizione;
    private int priorita; // 1 = alta, 2 = media, 3 = bassa
    private LocalDate scadenza;

    public Task(String descrizione, int priorita, LocalDate scadenza) {
        this.descrizione = descrizione;
        this.priorita = priorita;
        this.scadenza = scadenza;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public int getPriorita() {
        return priorita;
    }

    public LocalDate getScadenza() {
        return scadenza;
    }

    @Override
    public String toString() {
        return descrizione + " | Priorità: " + priorita + " | Scadenza: " + scadenza;
    }
}
