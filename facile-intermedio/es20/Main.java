import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<VoceDiario> voci = new ArrayList<>();
        voci.add(new VoceDiario("Compito di matematica", LocalDate.now().minusDays(2)));
        voci.add(new VoceDiario("Gita scolastica", LocalDate.now().minusDays(10)));
        voci.add(new VoceDiario("Allenamento", LocalDate.now().minusDays(5)));
        voci.add(new VoceDiario("Lettura libro", LocalDate.now()));

        LocalDate setteGiorniFa = LocalDate.now().minusDays(7);
        for (VoceDiario voce : voci) {
            if (voce.getData().isAfter(setteGiorniFa) || voce.getData().isEqual(setteGiorniFa)) {
                System.out.println(voce.getData() + ": " + voce.getTesto());
            }
        }
    }
}
