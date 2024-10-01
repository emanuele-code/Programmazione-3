public class Main {
    public static void main(String[] args) {
        ComputerProduct pc = new ComputerBuilder().prezzo(3000).build();
        System.out.println(pc.toString());
    }
}