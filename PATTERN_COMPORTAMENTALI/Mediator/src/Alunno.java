// classe astratta dal quale ereditano i concreteCollegue
public abstract class Alunno {
    private String nome;
    Mediatore mediatore;

    Alunno(String nome, Mediatore mediatore){
        this.nome = nome;
        this.mediatore = mediatore;
    }

    public String getNome(){
        return this.nome;
    }

    abstract void riceveComunicazione(String messaggio);

}
