package PATTERN_CREAZIONALI.Factory_pattern.simple_factory_pattern.src;

// classe del panino con pesce
public class MsiGpuProduct extends GPU {
    MsiGpuProduct(){};

    @Override
    void assembla() {
        System.out.println("Sto assembalndo GPU MSI...");
    }
}
