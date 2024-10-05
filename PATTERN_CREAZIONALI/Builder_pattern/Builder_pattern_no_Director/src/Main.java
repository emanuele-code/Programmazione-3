package PATTERN_CREAZIONALI.Builder_pattern.Builder_pattern_no_Director.src;

public class Main {
    public static void main(String[] args) {
        ComputerProduct pc = new ComputerBuilder().prezzo(3000).build();
        System.out.println(pc.toString());
    }
}