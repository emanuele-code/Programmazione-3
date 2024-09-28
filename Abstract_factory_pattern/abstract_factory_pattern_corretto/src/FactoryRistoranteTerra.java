// Questa è la Concrete Factory ovvero il ristornate che offre solo prodotti di terra, infatti gli override
// ritornano solo i concrete product che gli interessano
public class FactoryRistoranteTerra extends Ristorante {
    FactoryRistoranteTerra(){}

    @Override
    public Panino cucinaPanino(){
        return new ConcretePaninoCarne();
    }

    @Override
    public Bibita riempiBibita(){
        return new ConcreteCocaCola();
    }

}
