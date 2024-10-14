public class CD_Player implements Player {
    private Media media;

    @Override
    public void accept(Media media){
        this.media = media;
    }

    @Override
    public void play(){
        System.out.println(this.media.read());
    }
}
