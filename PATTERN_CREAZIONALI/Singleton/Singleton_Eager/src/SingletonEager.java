package PATTERN_CREAZIONALI.Singleton.Singleton_Eager.src;

public class SingletonEager {
    private static SingletonEager instance = new SingletonEager(); // inizializzazione dell'oggetto appena istanziamo

    private SingletonEager(){}

    public static SingletonEager getInstance(){ // ritorno l'oggetto istanziato quando richiesto
        System.out.println("SingletonEager");
        return instance;
    }
}