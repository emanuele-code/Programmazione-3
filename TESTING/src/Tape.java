public class Tape implements Media{
    private String sound;

    public void write(String sound){
        this.sound = sound;
    }

    public String read(){
        return this.sound;
    }

}
