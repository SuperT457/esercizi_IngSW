public class PostoAuto {
    private int numero;
    private Auto auto;
    private boolean occupato;

    public PostoAuto(int numero) {
        this.numero = numero;
        this.occupato = false;
    }

    public boolean isOccupato() {
        return occupato;
    }

    public boolean parcheggiaAuto(Auto auto) {
        if (!occupato) {
            this.auto = auto;
            this.occupato = true;
            return true;
        }
        return false;
    }

    public Auto rimuoviAuto() {
        if (occupato) {
            Auto autoUscente = this.auto;
            this.auto = null;
            this.occupato = false;
            return autoUscente;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Posto " + numero + ": " + (occupato ? auto.toString() : "libero");
    }
}