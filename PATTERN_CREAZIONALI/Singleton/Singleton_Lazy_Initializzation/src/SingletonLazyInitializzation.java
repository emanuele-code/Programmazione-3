package PATTERN_CREAZIONALI.Singleton.Singleton_Lazy_Initializzation.src;

public class SingletonLazyInitializzation {
    private static SingletonLazyInitializzation instance;

    private SingletonLazyInitializzation(){}

    public static SingletonLazyInitializzation getInstance(){
        if(instance == null){
            System.out.println("istanziato per la prima volta");
            instance = new SingletonLazyInitializzation(); // instanziamo solo nel momento in cui viene richiesta l'istanza
        }
        return instance;
    }
}
