public abstract class Ristorante {
    Ristorante(){}

    // qui dovrei esprimere il tipo di alimento che vorrei tramite parametro
    Alimento ordinaAlimento(String tipoAlimento){
        Alimento panino = preparaAlimento(tipoAlimento);
        panino.prepara();
        return panino;
    }

    public abstract Alimento preparaAlimento(String tipoAlimento);

}
