public class ConcreteVeicoloFactory extends VeicoloFactory {


    @Override
    public Veicolo creaVeicolo(String tipo){
        if(tipo.equals("auto")){
            return new Auto();
        } else if(tipo.equals("moto")){
            return new Moto();
        }
        return null;
    }

}
