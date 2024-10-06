// è la classe che si occupa di iterare la collezione
public class ConcreteIterator implements IIterator {
    private ConcreteAggregate aggregate; // qui avrò un istanza del concreteAggregate
    private int currentIndex = 0;        // questo è l'indice (ho l'indice perchè è un array)

    ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    // ritorno il primo elemento della collezione
    @Override
    public Object first() {
        currentIndex = 0;
        return aggregate.getItem(currentIndex);
    }

    // ritorno il prossimo elemento della collezione
    @Override
    public Object next() {
        currentIndex++;
        if (!hasNext()) {
            return aggregate.getItem(currentIndex);
        }
        return null;
    }

    // vedo se vi è l'elemento successivo nella collezione
    @Override
    public boolean hasNext() {
        return currentIndex >= aggregate.getCount();
    }

    // prendo l'elemento sul quale l'iterator è fermo senza incrementarlo
    @Override
    public Object currentItem() {
        if (currentIndex < aggregate.getCount()) {
            return aggregate.getItem(currentIndex);
        }
        return null;
    }
}
