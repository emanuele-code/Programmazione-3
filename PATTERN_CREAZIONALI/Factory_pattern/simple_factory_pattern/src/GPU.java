package PATTERN_CREAZIONALI.Factory_pattern.simple_factory_pattern.src;

// classe generica che serve alla fabbricaDiPanini altrimenti non saprebbe che panino ritornare
// sfrutto il polimorfismo su dati per risolvere il problema
public class GPU {
    GPU(){}

    void assembla(){
        System.out.println("Sto assemblando la GPU");
    }
}
