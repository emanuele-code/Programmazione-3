// la FACTORY è astratta èd implementa un FACTORY METHOD che a sua volta è astratto
public abstract class Ristorante {
    Ristorante() {}

    public Panino ordinaPanino(){
        Panino panino = creaPanino();
        panino.prepara();
        return panino;
    }

    public abstract Panino creaPanino(); // è astratto perchè nelle CONCRETE FACTORY bisogna fare l'override
}