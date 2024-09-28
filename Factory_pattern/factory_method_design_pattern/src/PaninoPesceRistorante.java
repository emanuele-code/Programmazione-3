// CONCRETE FACTORY qui facciamo l'override del FACTORY METHOD ritornando il CONCRETE PRODUCT
public class PaninoPesceRistorante extends Ristorante {
    PaninoPesceRistorante(){}

    @Override
    public Panino creaPanino(){
        return new PaninoPesce();
    }
}