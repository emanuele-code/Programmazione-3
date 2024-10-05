package PATTERN_CREAZIONALI.Factory_pattern.factory_method_design_pattern.src;

// la FACTORY è astratta èd implementa un FACTORY METHOD che a sua volta è astratto
public abstract class AziendaFactory {
    AziendaFactory() {}

    public GPU assemblaGPU(){
        GPU gpu = creaGPU();
        gpu.assembla();
        return gpu;
    }

    public abstract GPU creaGPU(); // è astratto perchè nelle CONCRETE FACTORY bisogna fare l'override
}