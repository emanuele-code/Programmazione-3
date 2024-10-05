package PATTERN_CREAZIONALI.Builder_pattern.Builder_pattern_con_director.src;

public class Main {
    public static void main(String[] args) {
        ComputerBuilder pc = new ComputerBuilder(); // istanzio l computerBuilder che verrà passato al costruttore della classe director
        ComputerDirector director = new ComputerDirector(pc); // istanzio la classe director
        ComputerProduct prodotto = director.fasciaAlta(); // accedo al metodo della classe director che ritorna il prodotto
        System.out.println(prodotto);

        ComputerProduct prodotto2 = new ComputerBuilder().prezzo(3000).build(); // posso continuare ad usarlo come se non avessi la director
        System.out.println(prodotto2);
    }
}