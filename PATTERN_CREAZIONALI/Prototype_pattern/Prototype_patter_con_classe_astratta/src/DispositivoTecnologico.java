package PATTERN_CREAZIONALI.Prototype_pattern.Prototype_patter_con_classe_astratta.src;

// utilizzando una classe astratta posso definire il metodo clone() in quest'ultima, ciò permette di diminuire il coupling nella funzione
// scritta nel main, poichè grazie al pattern il codice capisce da solo a quale sottoclasse stiamo facendo riferimendo
// e non dobbiamo scrivere gli if else if per capirlo
public abstract class DispositivoTecnologico {
    private int    ram;
    private String CPU;
    private String GPU;

    protected DispositivoTecnologico(int ram, String CPU, String GPU) {
        this.ram = ram;
        this.CPU = CPU;
        this.GPU = GPU;
    }

    public DispositivoTecnologico(DispositivoTecnologico dispositivoTecnologico) {
        this.ram = dispositivoTecnologico.ram;
        this.CPU = dispositivoTecnologico.CPU;
        this.GPU = dispositivoTecnologico.GPU;
    }

    public abstract DispositivoTecnologico clone();

    @Override
    public String toString() {
        return this.ram + " " + this.CPU + " " + this.GPU;
    }
}
