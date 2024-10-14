package PATTERN_CREAZIONALI.Factory_pattern_method.factory_method_design_pattern.src;

// CONCRETE PRODUCT è il prodotto che va effettivamente ritornato
public class MsiGpuProduct implements GPU {
    MsiGpuProduct() {}

    @Override
    public void assembla(){
        System.out.println("Assemblo la GPU MSI...");
    }
}