package PATTERN_CREAZIONALI.Abstract_factory_pattern.Abstract_factory_pattern_sbagliato.src;

// perdiamo di nuovo il principio open-closed e il single responisibility perchè a questo punto gestiamo più prodotti quindi
// la concrete factory deve capire quale product vogliamo istanziare
public class MsiConcreteFactory extends AziendaFactory {

    @Override
    public Componenti creaGPU(String tipo){
        Componenti componenti = null;
        if("gpu".equals(tipo)){
            componenti = new MsiGpuProduct();
        } else if("monitor".equals(tipo)){
            componenti = new MsiMonitorProduct();
        }
        return componenti;
    }
}
