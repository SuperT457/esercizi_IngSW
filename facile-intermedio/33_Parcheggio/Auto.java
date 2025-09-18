public class Auto {
    private String targa;
    private String modello;

    public Auto(String targa, String modello) {
        this.targa = targa;
        this.modello = modello;
    }

    public String getTarga() {
        return targa;
    }

    public String getModello() {
        return modello;
    }

    @Override
    public String toString() {
        return modello + " [" + targa + "]";
    }
}