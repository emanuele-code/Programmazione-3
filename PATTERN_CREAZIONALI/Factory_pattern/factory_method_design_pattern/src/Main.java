package PATTERN_CREAZIONALI.Factory_pattern.factory_method_design_pattern.src;

public class Main {
    public static void main(String[] args) {

        // Qui invochiamo un metodo virtuale, instanziando una CONCRETE FACTORY
        AziendaFactory azienda = new AsusFactory();

        // successivamente possiamo richiamare i metodi che fanno uso del FACTORY METHOD, grazie al fatto che
        // è astratto, farà gli ovverride in base alla concrete factory che lo sta utilizzando ritornando
        // i CONCRETE PRODUCT CORRETTI
        azienda.assemblaGPU();

    }
}