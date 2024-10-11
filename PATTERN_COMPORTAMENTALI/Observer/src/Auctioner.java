// Questa è la classe Subject che si occupa di aggioranre tutti gli observer
public class Auctioner {
    private Bidders[] observers = new Bidders[9];
    private int observerTotali = 0;
    private int state;

    private void notifyObserver(){
        for(int i=0; i<observerTotali; i++){
            observers[i].update();
        }
    }

    public void attach(Bidders bidder){
        observers[observerTotali++] = bidder;
    }

    public int getState(){
        return state;
    }

    public void setState(int in){
        state = in;
        notifyObserver();
    }
}
