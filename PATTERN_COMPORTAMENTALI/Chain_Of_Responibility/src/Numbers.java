// classe di base
public class Numbers {
    private int numero1;
    private int numero2;
    private String richiestaOperazione;

    public Numbers(int numero1, int numero2, String richiestaOperazione){
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.richiestaOperazione = richiestaOperazione;
    }

    public int getNumero1() { return numero1; }
    public int getNumero2() { return numero2; }
    public String getRichiestaOperazione(){ return richiestaOperazione; }
}
