package PATTERN_CREAZIONALI.Builder_pattern.Builder_pattern_con_director.src;

// computerbuilder che implementa l'interfaccia e fa l'override di tutti i metodi, ha come metodo build che ritorna un istanza del product
public class ComputerBuilder implements Builder {
    private float  prezzo;
    private String GPU;
    private String CPU;
    private int    ram;

    ComputerBuilder(){}

    @Override
    public Builder prezzo(float prezzo){
        this.prezzo = prezzo;
        return this;
    }

    @Override
    public Builder GPU(String GPU){
        this.GPU = GPU;
        return this;
    }

    @Override
    public Builder CPU(String CPU){
        this.CPU = CPU;
        return this;
    }

    @Override
    public Builder ram(int ram){
        this.ram = ram;
        return this;
    }

    @Override
    public ComputerProduct build(){
        return new ComputerProduct(prezzo, GPU, CPU, ram);
    }
}