package PATTERN_CREAZIONALI.Abstract_factory_pattern.abstract_factory_pattern_corretto.src;

public abstract class AziendaFactory {

    AziendaFactory(){}
    // qui il metodo prende un parametro per capire quale product istanziare
    public GPU compraGPU(){
        GPU gpu = creaGPU();
        gpu.assemblaGPU();
        return gpu;
    }

    public Monitor compraMonitor(){
        Monitor monitor = creaMonitor();
        monitor.assemblaMonitor();
        return monitor;
    }

    // qui il metodo prendere un parametro per capire quale oggetto istanziare
    public abstract GPU creaGPU();
    public abstract Monitor creaMonitor();
}
