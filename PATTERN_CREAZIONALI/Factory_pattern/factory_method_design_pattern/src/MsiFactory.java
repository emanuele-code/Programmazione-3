package PATTERN_CREAZIONALI.Factory_pattern.factory_method_design_pattern.src;

// CONCRETE FACTORY qui facciamo l'override del FACTORY METHOD ritornando il CONCRETE PRODUCT
public class MsiFactory extends AziendaFactory {
    MsiFactory() {}

    @Override
    public GPU creaGPU() {
        return new MsiGpuProduct();
    }
}
