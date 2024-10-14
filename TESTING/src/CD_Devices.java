public class CD_Devices implements DevicesFactory {


    @Override
    public Player createPlayer(){
        return new CD_Player();
    }

    @Override
    public Recorder createRecorder(){
        return new CD_Recorder();
    }

    @Override
    public Media createMedia(){
        return new CD();
    }

}
