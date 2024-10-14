package PATTERN_CREAZIONALI.Factory_pattern_method.simple_factory_pattern.src;

// il metodo ordinaPanino invece di inserirlo nella classe Ristorante lo inserisco qui, questo perchè
// riduco l'accoppiamento, rispetto il principio di responsabilità singola visto che questa classe
// prepara solo panini ma non rispetta il principio di open-closed perchè quando vengono aggiunti panini al menu
// bisogna modificare infatti questo non è il pattern completo ma è un cenno per capire come funziona il pattern vero
// questo è detto SIMPLE FACTORY PATTERN
public class ConcreteFactory {
    ConcreteFactory(){}

    public GPU compraGPU(String richiesta){
        GPU gpu = null;
        if("asus".equals(richiesta)){
            gpu = new AsusGpuProduct();
        } else if("msi".equals(richiesta)){
            gpu = new MsiGpuProduct();
        }
        return gpu;
    }
}
