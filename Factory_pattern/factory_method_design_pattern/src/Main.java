public class Main {
    public static void main(String[] args) {

        // Qui invochiamo un metodo virtuale, instanziando una CONCRETE FACTORY
        Ristorante paninoCarneRisto = new PaninoCarneRistorante();

        // successivamente possiamo richiamare i metodi che fanno uso del FACTORY METHOD, grazie al fatto che
        // è astratto, farà gli ovverride in base alla concrete factory che lo sta utilizzando ritornando
        // i CONCRETE PRODUCT CORRETTI
        Panino paninoCarne = paninoCarneRisto.ordinaPanino();

    }
}