// director che ha come attributo un oggetto di tipo builder
public class ComputerDirector {
    private ComputerBuilder computerBuilder;

    public ComputerDirector(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public ComputerProduct fasciaAlta(){
        return computerBuilder.prezzo(3000)
                .GPU("RTX 3090")
                .CPU("i9")
                .ram(128)
                .build();
    }
}