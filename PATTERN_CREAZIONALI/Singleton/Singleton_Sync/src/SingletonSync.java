package PATTERN_CREAZIONALI.Singleton.Singleton_Sync.src;

public class SingletonSync {
    private static SingletonSync instance;

    private SingletonSync(){}

    // questo fornisce un primo filtro alla programmazione multithread il problema è che quando due thread invocano contemporaneamente
    // il metodo l'if all'interno non è sincronizzato quindi riuscirebbero ad istanziare due volte il singleton
    public static synchronized SingletonSync getInstnace(){
        if(instance == null){
            System.out.println("sono stato istanziato");
            instance = new SingletonSync();
        }
        return instance;
    }

}
