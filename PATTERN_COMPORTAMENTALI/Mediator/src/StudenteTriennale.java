// classe concreteCollegue è quella effettivamente istanziata
public class StudenteTriennale extends Alunno {

    StudenteTriennale(String nome, Mediatore mediatore){
        super(nome, mediatore);
    }

    @Override
    void riceveComunicazione(String messaggio){
        System.out.println("Triennale: " + messaggio);
    }
}
