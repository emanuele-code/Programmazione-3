package PATTERN_CREAZIONALI.Builder_pattern.Builder_pattern_no_Director.src;

public class ComputerBuilder {
    private float  prezzo;
    private String CPU;
    private String GPU;
    private int    ram;

    ComputerBuilder(){}

    public ComputerBuilder prezzo(float prezzo){
        this.prezzo = prezzo;
        return this;
    }

    public ComputerBuilder CPU(String CPU){
        this.CPU = CPU;
        return this;
    }

    public ComputerBuilder GPU(String GPU){
        this.GPU = GPU;
        return this;
    }

    public ComputerBuilder ram(int ram){
        this.ram = ram;
        return this;
    }

    public ComputerProduct build(){
        return new ComputerProduct(prezzo, CPU, GPU, ram);
    }
}