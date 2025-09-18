import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Contatto {
    private String nome;
    private String numero;
    private String email;

    public Contatto(String nome, String numero, String email) {
        this.nome = nome;
        this.numero = numero;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Numero: " + numero + ", Email: " + email;
    }
}

public class Rubrica {
    public static void main(String[] args) {
        List<Contatto> rubrica = new ArrayList<>();
        rubrica.add(new Contatto("Anna Rossi", "123456", "anna@gmail.com"));
        rubrica.add(new Contatto("Marco Bianchi", "654321", "marco@yahoo.com"));
        rubrica.add(new Contatto("Stefano Verdi", "111222", "stefano@gmail.com"));
        rubrica.add(new Contatto("Lucia Neri", "333444", "lucia@outlook.com"));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vuoi cercare per (1) Nome parziale o (2) Dominio email?");
        int scelta = scanner.nextInt();
        scanner.nextLine(); // consuma l’andata a capo

        if (scelta == 1) {
            System.out.print("Inserisci parte del nome: ");
            String inputNome = scanner.nextLine().toLowerCase();

            List<Contatto> risultati = rubrica.stream()
                    .filter(c -> c.getNome().toLowerCase().contains(inputNome))
                    .collect(Collectors.toList());

            risultati.forEach(System.out::println);

        } else if (scelta == 2) {
            System.out.print("Inserisci dominio email (es: @gmail.com): ");
            String dominio = scanner.nextLine().toLowerCase();

            List<Contatto> risultati = rubrica.stream()
                    .filter(c -> c.getEmail().toLowerCase().endsWith(dominio))
                    .collect(Collectors.toList());

            risultati.forEach(System.out::println);
        } else {
            System.out.println("Scelta non valida.");
        }

        scanner.close();
    }
}