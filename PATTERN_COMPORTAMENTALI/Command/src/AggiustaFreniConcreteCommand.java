// questa è una classe concrete command ovvero i comandi effettivamnet implementabili
public class AggiustaFreniConcreteCommand implements OrdineCommand {
    private MeccanicoReceiver ordine;

    AggiustaFreniConcreteCommand(MeccanicoReceiver ordine){
        this.ordine = ordine;
    }

    @Override
    public void execute(){
        ordine.AggiustaFreni();
    }
}
