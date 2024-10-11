public class BinBidders extends Bidders {

    public BinBidders(Auctioner a){
        auctioner = a;
        auctioner.attach(this);
    }

    public void update(){
        System.out.println(" " + Integer.toHexString(auctioner.getState()));
    }
}
