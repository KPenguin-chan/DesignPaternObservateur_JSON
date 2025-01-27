import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class DirectionCourse implements Observable {
    /**
     * Liste des observateurs
     */
    private ArrayList<Observateur> observateurs;
    /**
     * Liste des abandons
     */
    private ArrayList<Abandon> abandons;

    /**
     *Construit l'objet de type DirectionCourse avec un
     * etat predefini.
     */
    public DirectionCourse() {
        observateurs = new ArrayList<>();
        abandons = new ArrayList<>();
    }


    /**
     * Enregistre les observateurs dans la liste des Observateurs
     * @param observateur
     */
    @Override
    public void enregistreObservateurs(Observateur observateur) {
        observateurs.add(observateur);
    }

    /** Retire un observateur de la liste des observateurs
     * @param observateur
     */
    @Override
    public void desenregistreObservateurs(Observateur observateur) {
        observateurs.remove(observateur);
    }

    /**
     * Ajoute un abandon dans la liste des abandons
     * @param abandon
     */
    public void ajouterAbandon(Abandon abandon) {
        abandons.add(abandon);
    }

    /**
     * Récupére le dernier abandon de la course
     * @return le dernier Objet Abandon
     */
    public Abandon getDernierAbandon(){
        return abandons.getLast();
    }

    /**
     * Informe les observateur de la liste des changement de l'objet DirectionCourse
     */
    public void informeObservateurs() {
        for (Observateur observateur : observateurs) {
            observateur.actualise(this);
        }
    }

    /**
     * A l'aide d'une liste contenant tous les abandons, la méthode simule une course
     * en mettant petit à petit les abandons
     * @param hsAbandons
     */
    public void simulationCourse(HashSet hsAbandons) {
        for (Iterator <Abandon> i = hsAbandons.iterator(); i.hasNext();) {
            ajouterAbandon(i.next());
            informeObservateurs();
            System.out.println(toString() + "------------------------------------\n");
        }
    }

    /**
     * Conversion de l'objet en chaine de caracteres.
     *
     * @return l'objet sous forme de chaine de caractère
     */
    public String toString() {
        String txt = "";
        for (Observateur observateur : observateurs) {
            txt += observateur.toString() + "\n\n";
        }
        return txt + "Nombre total d'abandons: " + abandons.size() + "\n";
    }
}
