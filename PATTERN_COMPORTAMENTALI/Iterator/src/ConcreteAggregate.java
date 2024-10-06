// il ConcreteAggregate è chi mantiene effettivamente la collezione
public class ConcreteAggregate implements Aggregate {
    private Object[] items;
    private int count = 0;     // questo attributo viene aggiornato man mano che vengono inseriti elementi e stabilisci la grandezza della collezione

    public ConcreteAggregate(int size) {
        items = new Object[size];
    }

    public void addItem(Object item) {
        if (count < items.length) {
            items[count++] = item;    // aggiungo elementi che aumentano il count e servono poi come riferimento all'hasNext() della classe Iterator
        }
    }

    public Object getItem(int index) {
        return index < count ?  items[index] : null; // se l'indice è minore della capacità allora posso prendere l'elemento corrente (non vado avanti nell'iterazione)
    }

    public int getCount() {
        return count;
    }

    @Override
    public IIterator createIterator() {
        return new ConcreteIterator(this); // ritorno un istanza del concreteAggregate all'iterator con cui lavorerò
    }
}
