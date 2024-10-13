// Questa classe serve per indicare lo stato attuale di un oggetto
public class TVContext implements State {
    private State tvState;

    public void setState(State state){
        this.tvState = state;
    }

    public State getState(){
        return this.tvState;
    }

    @Override
    public void doAction(){
        this.tvState.doAction();
    }
}
