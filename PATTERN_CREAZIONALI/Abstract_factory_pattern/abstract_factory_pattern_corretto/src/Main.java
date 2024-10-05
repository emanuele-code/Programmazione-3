package PATTERN_CREAZIONALI.Abstract_factory_pattern.abstract_factory_pattern_corretto.src;

// notiamo che i ristoranti sono due quindi in base a quale ristornate facciamo riferimento istanziamo una concreteFactory diversa o
// FactoryRistoranteMare oppure FactoryRistoranteTerra
public class Main {
    public static void main(String[] args) {

        AziendaFactory aziendaMsi = new MsiConcreteFactory();
        GPU gpuMsi = aziendaMsi.compraGPU();

        AziendaFactory aziendaAsus = new AsusConcreteFactory();
        Monitor monitorAsus = aziendaAsus.compraMonitor();
    }
}