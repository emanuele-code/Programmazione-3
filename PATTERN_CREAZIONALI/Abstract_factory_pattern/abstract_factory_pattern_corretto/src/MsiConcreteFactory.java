package PATTERN_CREAZIONALI.Abstract_factory_pattern.abstract_factory_pattern_corretto.src;

// perdiamo di nuovo il principio open-closed e il single responisibility perchè a questo punto gestiamo più prodotti quindi
// la concrete factory deve capire quale product vogliamo istanziare
public class MsiConcreteFactory extends AziendaFactory {

    @Override
    public GPU creaGPU(){
        return new MsiGpuProduct();
    }

    @Override
    public Monitor creaMonitor(){
        return new MsiMonitorProduct();
    }
}
