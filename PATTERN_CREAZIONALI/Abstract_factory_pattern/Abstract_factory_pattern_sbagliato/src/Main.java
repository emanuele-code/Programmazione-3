package PATTERN_CREAZIONALI.Abstract_factory_pattern.Abstract_factory_pattern_sbagliato.src;

public class Main {
    public static void main(String[] args) {
        AziendaFactory azienda = new AsusConcreteFactory(); // qui passo cìò che voglio
        Componenti gpu = azienda.compraGPU("gpu");
    }
}