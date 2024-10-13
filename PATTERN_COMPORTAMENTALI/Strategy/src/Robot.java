public class Robot {
    IComportamento comportamento;

    Robot(IComportamento comportamento){
        this.comportamento = comportamento;
    }

    public void setComportamento(IComportamento comportamento){
        this.comportamento = comportamento;
    }

    public void move(){
        comportamento.moveCommand();
    }
}
