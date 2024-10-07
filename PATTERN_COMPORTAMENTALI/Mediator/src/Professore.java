import java.util.ArrayList;
import java.util.List;

// classe ConcreteMediator ovvero chi gestisce le comunicazioni tra i concreteCollegue
public class Professore implements Mediatore {
    private List<Alunno> lista;

    Professore(){
        lista = new ArrayList<>();
    }

    @Override
    public void effettuaComunicazione(String testo){
        for(Alunno a : lista){
            a.riceveComunicazione("Signor " + a.getNome() + " giovedi non ci sono");
        }
    }

    @Override
    public void aggiungiAlunno(Alunno alunno){
        lista.add(alunno);
    }

}
