import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Persona[] persone = new Persona[10];
        int count = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Aggiungi Studente\n2. Aggiungi Insegnante\n3. Visualizza Tutti\n4. Esci");
            String scelta = sc.nextLine();
            if (scelta.equals("1")) {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Matricola: ");
                String matricola = sc.nextLine();
                if (count < persone.length) {
                    persone[count++] = new Studente(nome, matricola);
                }
            } else if (scelta.equals("2")) {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Materia: ");
                String materia = sc.nextLine();
                if (count < persone.length) {
                    persone[count++] = new Insegnante(nome, materia);
                }
            } else if (scelta.equals("3")) {
                for (int i = 0; i < count; i++) {
                    System.out.println(persone[i].getInfo());
                }
            } else if (scelta.equals("4")) {
                break;
            }
        }
        sc.close();
    }
}
