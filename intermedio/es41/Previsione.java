import java.time.LocalDate;

public class Previsione {
    private double temperatura;
    private LocalDate data;
    private String statoMeteo;

    public Previsione(double temperatura, LocalDate data, String statoMeteo) {
        this.temperatura = temperatura;
        this.data = data;
        this.statoMeteo = statoMeteo;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public LocalDate getData() {
        return data;
    }

    public String getStatoMeteo() {
        return statoMeteo;
    }

    @Override
    public String toString() {
        return data + ": " + temperatura + "°C, " + statoMeteo;
    }
}
