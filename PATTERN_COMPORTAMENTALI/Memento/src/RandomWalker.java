import java.util.Random;

public class RandomWalker {
    private int distanzaPercorsa;
    private int distanzaAttuale;
    private RandomWalker randomWalker;


    public RandomWalker() {
        randomWalker = this;
    }

   public void cammina(){
        distanzaPercorsa = (int) (Math.random()*100);
        distanzaAttuale += distanzaPercorsa;
   }

    public int getDistanzaPercorsa(){
        return distanzaPercorsa;
    }
    public int getDistanzaAttuale(){
        return distanzaAttuale;
    }

    // Creo l'istanza di salvataggio
    public Memento createMemento() {
        return new WalkerMemento();
    }

    // la classe è innestata
    public class WalkerMemento implements Memento {
        private int mem_distanzaAttuale;
        private int mem_distanzaPercorsa;

        // qui salvo lo stato attuale
        public WalkerMemento() {
            mem_distanzaAttuale = distanzaAttuale;
            mem_distanzaPercorsa = distanzaPercorsa;
        }

        // questa funzione ripristina quello stato
        @Override
        public void restoreState() {
           distanzaAttuale = mem_distanzaAttuale;
           distanzaPercorsa = mem_distanzaPercorsa;
        }
    }
}
