// il metodo ordinaPanino invece di inserirlo nella classe Ristorante lo inserisco qui, questo perchè
// riduco l'accoppiamento, rispetto il principio di responsabilità singola visto che questa classe
// prepara solo panini ma non rispetta il principio di open-closed perchè quando vengono aggiunti panini al menu
// bisogna modificare infatti questo non è il pattern completo ma è un cenno per capire come funziona il pattern vero
// questo è detto SIMPLE FACTORY PATTERN
public class FabbricaDiPanini {
    FabbricaDiPanini(){}

    public Panino ordinaPanino(String richiesta){
        Panino panino = null;
        if("carne".equals(richiesta)){
            panino = new PaninoConCarne();
        } else if("pesce".equals(richiesta)){
            panino = new PaninoConPesce();
        }
        return panino;
    }
}
