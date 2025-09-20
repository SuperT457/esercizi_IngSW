import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Compito matematica", 2, LocalDate.of(2024, 6, 10)));
        tasks.add(new Task("Esame inglese", 1, LocalDate.of(2024, 6, 5)));
        tasks.add(new Task("Allenamento", 3, LocalDate.of(2024, 6, 8)));
        tasks.add(new Task("Progetto informatica", 1, LocalDate.of(2024, 6, 12)));
        tasks.add(new Task("Visita medica", 2, LocalDate.of(2024, 6, 7)));

        tasks.sort(Comparator.comparingInt(Task::getPriorita).thenComparing(Task::getScadenza));

        System.out.println("Task ordinati per priorità e scadenza:");
        for (Task t : tasks) {
            System.out.println(t);
        }
    }
}
