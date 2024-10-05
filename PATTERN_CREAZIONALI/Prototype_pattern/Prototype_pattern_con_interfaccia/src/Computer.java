package PATTERN_CREAZIONALI.Prototype_pattern.Prototype_pattern_con_interfaccia.src;

// i prodotti implementano l'interfaccia
public class Computer implements Prototype {
    private float     prezzo;
    private String    CPU;
    private String    GPU;
    private int       ram;
    private HardDrive hardDrive;

    public Computer(float prezzo, String CPU, String GPU, int ram, HardDrive hardDrive) {
        this.prezzo = prezzo;
        this.CPU = CPU;
        this.GPU = GPU;
        this.ram = ram;
        this.hardDrive = hardDrive;
    }

    public Computer(Computer computer){ // costruttore di copia
        this.prezzo = computer.prezzo;              // Shallow copy
        this.CPU = computer.CPU;                    // Shallow copy
        this.GPU = computer.GPU;                    // Shallow copy
        this.ram = computer.ram;                    // Shallow copy
        this.hardDrive = new HardDrive(64); // deep copy
    }

    @Override // override del metodo clone
    public Computer clone(){
        return new Computer(this);
    }

    @Override
    public String toString(){
        return this.prezzo + " " + this.CPU + " " + this.GPU + " " + this.ram;
    }

}
