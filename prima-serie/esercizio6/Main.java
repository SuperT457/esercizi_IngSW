public class Main {
    public static void main(String[] args){
        SistemaPagamenti sistema = new SistemaPagamenti();

        CartaDiCredito visa = new CartaDiCredito(2000, "123456789");
        PayPal pp1 = new PayPal("giuliotosi",500);

        sistema.aggiungiMetodo(pp1);
        sistema.aggiungiMetodo(visa);

        double ps5 = 450;
        double controller = 100;
        double puff = 9.50;
        double casa = 400000;
        double iPhone16 = 1200;

        sistema.paga(pp1,ps5); //dovrebbe andare a buon fine
        sistema.paga(pp1, controller); //dovrebbe essere rifiutato
        sistema.paga(pp1,puff); //dovrebbe andare bene

        sistema.paga(visa, casa); //forse non riesco a comprare una casa con la carta di credito
        sistema.paga(visa,iPhone16); //ma l'iphone probabilmente si
    }
}
