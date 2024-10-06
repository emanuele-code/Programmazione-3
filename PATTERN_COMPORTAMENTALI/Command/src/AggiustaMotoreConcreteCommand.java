// questa è una classe concrete command ovvero i comandi effettivamnet implementabili
public class AggiustaMotoreConcreteCommand implements OrdineCommand {
    private MeccanicoReceiver ordine;

    AggiustaMotoreConcreteCommand(MeccanicoReceiver ordine){
        this.ordine = ordine;
    }

    @Override
    public void execute(){
        ordine.AggiustaMotore();
    }
}
