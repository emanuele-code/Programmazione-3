package PATTERN_CREAZIONALI.Factory_pattern_method.factory_method_design_pattern.src;

// CONCRETE FACTORY qui facciamo l'override del FACTORY METHOD ritornando il CONCRETE PRODUCT
public class AsusFactory extends AziendaFactory {
    AsusFactory(){}

    @Override
    public GPU creaGPU() {
        return new AsusGpuProduct();
    }
}