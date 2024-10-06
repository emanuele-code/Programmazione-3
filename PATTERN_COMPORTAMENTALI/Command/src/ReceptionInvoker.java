import java.util.LinkedList;
import java.util.Queue;

// questa è la classe che si occupa di smistare le richieste di comandi
public class ReceptionInvoker {
    Queue<OrdineCommand> ordini = new LinkedList<OrdineCommand>();

    ReceptionInvoker(){}

    public void effettaManutenzione(OrdineCommand ordine){
        ordini.add(ordine);
        ordini.peek().execute();
        ordini.remove();
    }

}
