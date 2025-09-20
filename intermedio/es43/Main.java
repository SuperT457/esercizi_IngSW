import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Contatto> rubrica = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Aggiungi contatto\n2. Rimuovi contatto\n3. Cerca per nome\n4. Esci");
            String scelta = sc.nextLine();
            if (scelta.equals("1")) {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Numero: ");
                String numero = sc.nextLine();
                System.out.print("Email: ");
                String email = sc.nextLine();
                rubrica.add(new Contatto(nome, numero, email));
            } else if (scelta.equals("2")) {
                System.out.print("Nome da rimuovere: ");
                String nome = sc.nextLine();
                rubrica.removeIf(c -> c.getNome().equalsIgnoreCase(nome));
            } else if (scelta.equals("3")) {
                System.out.print("Nome da cercare: ");
                String nome = sc.nextLine();
                for (Contatto c : rubrica) {
                    if (c.getNome().equalsIgnoreCase(nome)) {
                        System.out.println(c);
                    }
                }
            } else if (scelta.equals("4")) {
                break;
            }
        }
        sc.close();
    }
}
