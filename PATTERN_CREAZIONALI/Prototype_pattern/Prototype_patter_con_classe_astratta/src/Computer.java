package PATTERN_CREAZIONALI.Prototype_pattern.Prototype_patter_con_classe_astratta.src;

public class Computer extends DispositivoTecnologico {
    private float prezzo;

    Computer(int ram, String CPU, String GPU, float prezzo){
        super(ram, CPU, GPU);
        this.prezzo = prezzo;
    }

    Computer(Computer computer){
        super(computer);
        this.prezzo = computer.prezzo;
    }

    @Override // qui facciamo l'override del metodo e ritorniamo un istanza della classe
    public Computer clone(){
        return new Computer(this);
    }

    @Override
    public String toString(){
        return this.prezzo + " " + super.toString();
    }
}
