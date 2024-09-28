// classe generica che serve alla fabbricaDiPanini altrimenti non saprebbe che panino ritornare
// sfrutto il polimorfismo su dati per risolvere il problema
public class Panino {
    Panino(){}

    void prepara(){
        System.out.println("Preparando il panino");
    }
}
