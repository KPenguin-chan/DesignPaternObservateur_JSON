import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class DirectionCourse implements Observable {
    private ArrayList<Observateur> observateurs;
    private ArrayList<Abandon> abandons;

    public DirectionCourse() {
        observateurs = new ArrayList<>();
        abandons = new ArrayList<>();
    }

    @Override
    public void enregistreObservateurs(Observateur observateur) {
        observateurs.add(observateur);
    }

    @Override
    public void desenregistreObservateurs(Observateur observateur) {
        observateurs.remove(observateur);
    }

    public void ajouterAbandon(Abandon abandon) {
        abandons.add(abandon);
    }

    public Abandon getDernierAbandon(){
        return abandons.getLast();
    }

    public void informeObservateurs() {
        for (Observateur observateur : observateurs) {
            observateur.actualise(this);
        }
    }

    public void simulationCourse(HashSet hsAbandons) {
        for (Iterator <Abandon> i = hsAbandons.iterator(); i.hasNext();) {
            ajouterAbandon(i.next());
            informeObservateurs();
            System.out.println(toString() + "------------------------------------\n");
        }
    }

    public String toString() {
        String txt = "";
        for (Observateur observateur : observateurs) {
            txt += observateur.toString() + "\n\n";
        }
        return txt + "Nombre total d'abandons: " + abandons.size() + "\n";
    }
}
