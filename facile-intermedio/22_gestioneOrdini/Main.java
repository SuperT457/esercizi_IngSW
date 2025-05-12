import java.util.ArrayList;

public class Main{
	public static void main(String[] args){
		OrdineNegozio o1 = new OrdineNegozio("Cuffie", "Bancomat", 300, "Ferrara");
		OrdineOnline o2 = new OrdineOnline(5432, 35, "Via Saragat 12");

		ArrayList<Spedibile> ordini = new ArrayList<Spedibile>();

		ordini.add(o1);
		ordini.add(o2);

		o1.spedizione();
		o2.spedizione();		
	}
}
