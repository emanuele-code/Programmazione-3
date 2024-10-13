public interface Lavoratore {

    // Metodo template che definisce il workflow della routine giornaliera
    default void dailyRoutine() {
        getUp();
        eatBreakfast();
        goToWork();
        work(); // Metodo astratto, implementato dalle sottoclassi
        returnToHome();
        relax(); // Metodo opzionale
        sleep();
    }

    // Metodi di default
    default void getUp() {
        System.out.println("Svegliarsi.");
    }

    default void eatBreakfast() {
        System.out.println("Fare colazione.");
    }

    default void goToWork() {
        System.out.println("Andare a lavoro.");
    }

    default void returnToHome() {
        System.out.println("Tornare a casa.");
    }

    default void sleep() {
        System.out.println("Andare a dormire.");
    }

    // Metodi che devono essere implementati dalle classi che implementano questa interfaccia
    void work();  // Ogni lavoratore ha il proprio lavoro specifico

    // Metodo opzionale (di default rilassarsi)
    default void relax() {
        System.out.println("Rilassarsi.");
    }
}
