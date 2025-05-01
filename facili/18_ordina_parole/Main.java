import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        if(args.length < 2){
            System.out.println("Inserire almeno due parole come args");
            System.exit(1);
        }

        Arrays.sort(args);
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
}