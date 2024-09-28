// notiamo che i ristoranti sono due quindi in base a quale ristornate facciamo riferimento istanziamo una concreteFactory diversa o
// FactoryRistoranteMare oppure FactoryRistoranteTerra
public class Main {
    public static void main(String[] args) {
        Ristorante ristoranteMare = new FactoryRistoranteMare();
        Panino paninoPesce = ristoranteMare.ordinaPanino();
        Bibita acqua = ristoranteMare.ordinaBibita();

        Ristorante ristoranteTerra = new FactoryRistoranteTerra();
        Panino paninoCarne = ristoranteTerra.ordinaPanino();
        Bibita cocaCola = ristoranteTerra.ordinaBibita();
    }
}