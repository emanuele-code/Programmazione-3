public class BibiteFactory extends Ristorante {

    BibiteFactory(){}

    // il problema principale sta qui, non rispetto di nuovo il principio OPEN-CLOSED
    @Override
    public Alimento preparaAlimento(String tipoAlimento){
        Alimento bibita = null;
        if("Acqua".equals(tipoAlimento)){
            bibita = new AcquaConcrete();
        }
        return bibita;
    }
}
