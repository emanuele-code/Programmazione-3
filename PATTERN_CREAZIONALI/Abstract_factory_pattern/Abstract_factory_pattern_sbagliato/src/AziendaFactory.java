package PATTERN_CREAZIONALI.Abstract_factory_pattern.Abstract_factory_pattern_sbagliato.src;

public abstract class AziendaFactory {

    AziendaFactory(){}
    // qui il metodo prende un parametro per capire quale product istanziare
    public Componenti compraGPU(String tipo){
        Componenti gpu = creaGPU(tipo);
        gpu.assembla();
        return gpu;
    }

    // qui il metodo prendere un parametro per capire quale oggetto istanziare
    public abstract Componenti creaGPU(String tipo);
}
