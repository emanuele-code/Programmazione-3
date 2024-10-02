public class Cellulare extends DispositivoTecnologico {
    private String brand;

    Cellulare(int ram, String CPU, String GPU, String brand){
        super(ram, CPU, GPU);
        this.brand = brand;
    }

    Cellulare(Cellulare cellulare){ // costruttore di copia
        super(cellulare);
        this.brand = cellulare.brand;
    }

    @Override  // qui facciamo l'override del metodo e ritorniamo un istanza della classe
    public Cellulare clone(){
        return new Cellulare(this);
    }

    @Override
    public String toString(){
        return this.brand + " " + super.toString();
    }
}
