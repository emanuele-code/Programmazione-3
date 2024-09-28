// Questa è la Concrete Factory ovvero il ristornate che offre solo prodotti di mare, infatti gli override
// ritornano solo i concrete product che gli interessano
public class FactoryRistoranteMare extends Ristorante {
    FactoryRistoranteMare(){}

    @Override
    public Panino cucinaPanino(){
        return new ConcretePaninoPesce();
    };

    @Override
    public Bibita riempiBibita(){
        return new ConcreteAcqua();
    }
}
