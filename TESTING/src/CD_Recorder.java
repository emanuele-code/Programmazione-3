public class CD_Recorder implements Recorder {

    private Media media;

    @Override
    public void accept(Media media){
        this.media = media;
    }

    @Override
    public void record(){
        this.media.write(this.media.read());
    }
}
