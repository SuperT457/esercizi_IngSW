import java.util.ArrayList;
import java.util.List;

public class SistemaPagamenti {
    List<MetodoPagamento> listaMetodi = new ArrayList<MetodoPagamento>();
    
    public void aggiungiMetodo(MetodoPagamento m){
        listaMetodi.add(m);
    }

    public void paga(MetodoPagamento m, double importo){
        try {
            m.effettuaPagamento(importo);
        } catch (SaldoNonDisponibileException snde){
            System.err.println(snde.getMessage());
        }
    }
}
