public class PaniniFactory extends Ristorante {
    PaniniFactory(){}


    // il problema principale sta qui, non rispetto di nuovo il principio OPEN-CLOSED
    @Override
    public Alimento preparaAlimento(String tipoAlimento){
        Alimento panino = null;
        if("PaninoCarne".equals(tipoAlimento)){
            panino = new PaninoCarneConcrete();
        } else if("PaninoPesce".equals(tipoAlimento)){
            panino = new PaninoPesceConcrete();
        }
        return panino;
    }
}
