import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class MainScanner{
    public static void main(String[] args){

        try {
            File myFile = new File("voti-studenti.txt");
            Scanner s = new Scanner(myFile);
            int somma=0;
            int lines=0;

            while(s.hasNextLine()){
                String[] splitted=(s.nextLine()).split(" ");
                somma+=Integer.parseInt(splitted[1]);
                lines++;
            }

            float media=(float) somma/lines;

            System.out.println("Media: "+media);

            s.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
}