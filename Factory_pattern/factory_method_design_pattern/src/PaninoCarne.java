// CONCRETE PRODUCT è il prodotto che va effettivamente ritornato
public class PaninoCarne implements Panino {
    PaninoCarne() {}

    @Override
    public void prepara(){
        System.out.println("Preparando Panino carne...");
    }
}