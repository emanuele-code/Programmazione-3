public abstract class Lavoratore {

    // Template method - definisce l'ordine delle operazioni
    public final void dailyRoutine() {
        getUp();
        eatBreakfast();
        goToWork();
        work(); // Metodo che sarà implementato dalle sottoclassi
        returnToHome();
        relax(); // Metodo che può essere implementato o no dalle sottoclassi
        sleep();
    }

    // Metodi comuni
    public void getUp() {
        System.out.println("Svegliarsi.");
    }

    public void eatBreakfast() {
        System.out.println("Fare colazione.");
    }

    public void goToWork() {
        System.out.println("Andare a lavoro.");
    }

    public void returnToHome() {
        System.out.println("Tornare a casa.");
    }

    public void sleep() {
        System.out.println("Andare a dormire.");
    }

    // Metodi astratti da implementare nelle sottoclassi
    public abstract void work();

    // Metodo opzionale, può essere sovrascritto
    public void relax() {
        System.out.println("Rilassarsi.");
    }
}
