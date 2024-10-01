public class ComputerProduct {
    private final float  prezzo;
    private final String CPU;
    private final String GPU;
    private final int    ram;

    ComputerProduct(float prezzo, String CPU, String GPU, int ram) {
        this.prezzo = prezzo;
        this.CPU = CPU;
        this.GPU = GPU;
        this.ram = ram;
    }


    @Override
    public String toString() {
        return this.prezzo + " " + this.CPU + " " + this.GPU + " " + this.ram;
    }
}