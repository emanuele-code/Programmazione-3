public class OctBidders extends Bidders {

    public OctBidders(Auctioner a){
        auctioner = a;
        auctioner.attach(this);
    }

    public void update(){
        System.out.println(" " + Integer.toHexString(auctioner.getState()));
    }
}
