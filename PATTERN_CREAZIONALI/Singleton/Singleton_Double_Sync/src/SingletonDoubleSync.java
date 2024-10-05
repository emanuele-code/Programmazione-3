package PATTERN_CREAZIONALI.Singleton.Singleton_Double_Sync.src;

public class SingletonDoubleSync {
    // volatile serve ai thread per controllarne lo stato reale e non quello nella loro cache
    private static volatile SingletonDoubleSync instance;

    private SingletonDoubleSync(){}
    // evita il problema dei due thread che istanziano contemporaneamente
    public static SingletonDoubleSync getInstance(){
        if(instance == null){ // il primo if non è sincronizzato
            synchronized (SingletonDoubleSync.class){ // sincronizzo un oggetto della classe SingletonDoubleSync
                if(instance == null){  // il secondo if lo è impedendo l'istanziamento dell'oggetto
                    System.out.println("istanziato");
                    instance = new SingletonDoubleSync();
                }
            }
        }
        return instance;
    }
}
