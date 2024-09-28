// Questa è l'abstract Factory che offre i due factory method
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