// Notiamo che la Factory Ristorante ha due Factory method in base al prodotto e due metodi diverse da richiamare
public abstract class Ristorante {
    Ristorante(){}

    public Panino ordinaPanino(){
        Panino panino = cucinaPanino();
        panino.prepara();
        return panino;
    }

    public Bibita ordinaBibita(){
        Bibita bibita = riempiBibita();
        bibita.prepara();
        return bibita;
    }


    public abstract Panino cucinaPanino();
    public abstract Bibita riempiBibita();
}