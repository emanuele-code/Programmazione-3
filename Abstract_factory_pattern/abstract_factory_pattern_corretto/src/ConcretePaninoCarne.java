// Questo è un prodotto
public class ConcretePaninoCarne implements Panino {
    ConcretePaninoCarne(){}

    @Override
    public void prepara(){
        System.out.println("Preparando Panino con carne");
    }
}
