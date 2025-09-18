public class Parcheggio {
    private PostoAuto[] posti;
    private int numeroPostiTotali;

    public Parcheggio(int numeroPostiTotali) {
        this.numeroPostiTotali = numeroPostiTotali;
        this.posti = new PostoAuto[numeroPostiTotali];
        for (int i = 0; i < numeroPostiTotali; i++) {
            posti[i] = new PostoAuto(i + 1);
        }
    }

    public boolean parcheggiaAuto(Auto auto) {
        for (PostoAuto posto : posti) {
            if (!posto.isOccupato()) {
                return posto.parcheggiaAuto(auto);
            }
        }
        return false;
    }

    public Auto rimuoviAuto(String targa) {
        for (PostoAuto posto : posti) {
            if (posto.isOccupato()) {
                Auto autoInPosto = posto.rimuoviAuto();
                if (autoInPosto.getTarga().equals(targa)) {
                    return autoInPosto;
                } else {
                    posto.parcheggiaAuto(autoInPosto);
                }
            }
        }
        return null;
    }

    public void stampaStato() {
        System.out.println("Stato del parcheggio:");
        for (PostoAuto posto : posti) {
            System.out.println(posto);
        }
        System.out.println();
    }
}