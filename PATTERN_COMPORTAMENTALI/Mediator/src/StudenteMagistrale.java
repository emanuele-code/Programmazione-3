// classe concreteCollegue è quella effettivamente istanziata
public class StudenteMagistrale extends Alunno {

    StudenteMagistrale(String nome, Mediatore mediatore){
        super(nome, mediatore);
    }

    @Override
    void riceveComunicazione(String messaggio){
        System.out.println("Magistrale: " + messaggio);
    }
}
