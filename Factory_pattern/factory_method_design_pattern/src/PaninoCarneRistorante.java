// CONCRETE FACTORY qui facciamo l'override del FACTORY METHOD ritornando il CONCRETE PRODUCT
public class PaninoCarneRistorante extends Ristorante {
    PaninoCarneRistorante() {}

    @Override
    public Panino creaPanino(){
        return new PaninoCarne();
    }
}
