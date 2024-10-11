// classe astratta che ha una reference al Subject e il metodo per fare l'update
abstract class Bidders {
    protected Auctioner auctioner;
    public abstract void update();
}
