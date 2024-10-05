package PATTERN_CREAZIONALI.Prototype_pattern.Prototype_pattern_con_interfaccia.src;

// classe che estende il computer
public class Cellulare extends Computer {
    private String fotocamera;

    Cellulare(float prezzo, String CPU, String GPU, int ram, String fotocamera, HardDrive hardDrive){
        super(prezzo, CPU, GPU, ram,hardDrive);
        this.fotocamera = fotocamera;
    }

    // costruttore di copia
    Cellulare(Cellulare cellulare){
        super(cellulare);
        this.fotocamera = cellulare.fotocamera;
    }

    @Override
    public Cellulare clone(){
        return new Cellulare(this);
    }
}
