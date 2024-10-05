package PATTERN_CREAZIONALI.Factory_pattern.simple_factory_pattern.src;

// classe del panino con carne
public class AsusGpuProduct extends GPU {
    AsusGpuProduct(){};

    @Override
    void assembla() {
        System.out.println("Sto assembalndo GPU ASUS...");
    }
}
