// prima classe che gestisce la richiesta
public class AddNumbers implements Chain {

    private Chain nextInChain;

    @Override // fa l'override del metodo dell'interfaccia ed imposta il prossimo oggetto che deve gestire la richiesta
    public void setNextChain(Chain nextChain){
        this.nextInChain = nextChain;
    }

    @Override
    public void calculate(Numbers request){  // se la richiesta può essere gestita da questo oggetto lo a altrimenti lo passa al prossimo oggetto
        if("add".equals(request.getRichiestaOperazione())){
            System.out.println(request.getNumero1() + request.getNumero2());
        } else {
            nextInChain.calculate(request);
        }
    }

}
