public class Main {
    private static String[][] scacchiera ={
        {"Torre", "Cavallo", "Alfiere", "Regina", "Re", "Alfiere", "Cavallo", "Torre"},
        {"|\t|","|\t|","|\t|","|\t|","|\t|","|\t|","|\t|","|\t|"},
        {"|\t|","|\t|","|\t|","|\t|","|\t|","|\t|","|\t|","|\t|"},
        {"|\t|","|\t|","|\t|","|\t|","|\t|","|\t|","|\t|","|\t|"},
        {"|\t|","|\t|","|\t|","|\t|","|\t|","|\t|","|\t|","|\t|"},
        {"|\t|","|\t|","|\t|","|\t|","|\t|","|\t|","|\t|","|\t|"},
        {"|\t|","|\t|","|\t|","|\t|","|\t|","|\t|","|\t|","|\t|"},
        {"Torre", "Cavallo", "Alfiere", "Regina", "Re", "Alfiere", "Cavallo", "Torre"}
    };

    public static void printRiga(int index){
        for(int i=0;i<8;i++){
            System.out.print(scacchiera[index][i] + " ");
        }
        System.out.println();
    }

    public static void printScacchiera(){
        for(int i=0;i<8;i++){
            printRiga(i);
        }
    }

    public static void main(String[] args){
        Main.printScacchiera();
    }    
}
