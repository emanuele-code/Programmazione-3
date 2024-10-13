public class Main {
    public static void main(String[] args) {
        Lavoratore pompiere    = new Pompiere();
        Lavoratore taglialegna = new Taglialegna();
        Lavoratore postino     = new Postino();

        System.out.println("Routine del pompiere:");
        pompiere.dailyRoutine();

        System.out.println("\nRoutine del taglialegna:");
        taglialegna.dailyRoutine();

        System.out.println("\nRoutine del postino:");
        postino.dailyRoutine();

    }
}
