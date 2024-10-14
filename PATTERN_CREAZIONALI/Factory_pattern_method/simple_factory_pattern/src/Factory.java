package PATTERN_CREAZIONALI.Factory_pattern_method.simple_factory_pattern.src;

// separando le componenti qui posso creare un metodo semplicemente al quale effettuiamo la richiesta
// questo porta il codice ad essere più mantenibile
public class Factory {
    Factory(){};

    public GPU compraGPU(String richiesta){
        ConcreteFactory fabbrica = new ConcreteFactory();
        GPU gpu = fabbrica.compraGPU(richiesta);
        gpu.assembla();
        return gpu;
    }

}
