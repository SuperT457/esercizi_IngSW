public class Main{
    public static void main(String[] args){
        if(args.length != 2){
            System.err.println("Due argomenti.");
            System.exit(1);
        }

        String nome=args[0].split(":")[1];
        int age=Integer.parseInt(args[1].split(":")[1]);

        Persona p = new Persona(nome,age);

        System.out.println(p);
    }
}
