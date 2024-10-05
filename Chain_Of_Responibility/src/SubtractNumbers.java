import java.util.Objects;
// concettualmente identico alla classe addNumbers, solo che questo è l'ultimo oggetto nella catena delle responsabilità infatti nell else non ci sta un altra richiesta
public class SubtractNumbers implements Chain {
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain){
        this.nextInChain = nextChain;
    }

    @Override
    public void calculate(Numbers request){
        if("sub".equals(request.getRichiestaOperazione())){
            System.out.println(request.getNumero1() + request.getNumero2());
        } else {
            System.out.println("operazioni disponibili finite");
        }
    }
}
