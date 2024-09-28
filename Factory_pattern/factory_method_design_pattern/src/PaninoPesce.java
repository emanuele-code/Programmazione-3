// CONCRETE PRODUCT è il prodotto che va effettivamente ritornato
public class PaninoPesce implements Panino {
    PaninoPesce() {}

    @Override
    public void prepara(){
        System.out.println("Preparando Panino pesce...");
    }
}