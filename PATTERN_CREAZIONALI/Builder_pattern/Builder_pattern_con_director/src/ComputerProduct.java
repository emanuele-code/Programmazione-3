package PATTERN_CREAZIONALI.Builder_pattern.Builder_pattern_con_director.src;

// product è ciò che viene effettivamente istanziato
public class ComputerProduct {
    private final float  prezzo;
    private final String GPU;
    private final String CPU;
    private final int    ram;

    ComputerProduct(float prezzo, String GPU, String CPU, int ram) {
        this.prezzo = prezzo;
        this.GPU = GPU;
        this.CPU = CPU;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return this.prezzo + " " + this.GPU + " " + this.CPU + " " + this.ram;
    }
}