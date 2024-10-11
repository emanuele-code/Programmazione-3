// Questo è un observer, notiamo che estende la classe astratta, potrebbe essere anche un interfaccia
public class HexBidders extends Bidders {

    // quando viene istanziato si aggiunge alla lista del Subject
    public HexBidders(Auctioner a){
        auctioner = a;
        auctioner.attach(this);
    }

    // metodo utile al subject per aggiornare lo stato
    public void update(){
        System.out.println(" " + Integer.toHexString(auctioner.getState()));
    }
}
