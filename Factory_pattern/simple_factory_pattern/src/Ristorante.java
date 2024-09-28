// separando le componenti qui posso creare un metodo semplicemente al quale effettuiamo la richiesta
// questo porta il codice ad essere più mantenibile
public class Ristorante {
    Ristorante(){};

    public Panino ordinaPanino(String richiesta){
        FabbricaDiPanini fabbrica = new FabbricaDiPanini();
        Panino panino = fabbrica.ordinaPanino(richiesta);
        panino.prepara();
        return panino;
    }

}
