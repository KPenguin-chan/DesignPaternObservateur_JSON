import java.util.ArrayList;

public class Categorie implements Observateur {
    /**
     * nom de la catégorie
     */
    private final String nom;
    /**
     * Liste des Abandons de la course
     */
    private ArrayList<Abandon> listeAbandon;
    /**
     * Taille de la liste listeAbandon
     */
    private int tailleListe;

    /**
     *Construit l'objet de type Categorie avec un
     * etat predefini.
     * @param nom
     */
    public Categorie(String nom) {
        this.nom = nom;
        listeAbandon = new ArrayList<>();
        tailleListe = 0;
    }

    /**
     * Accede au nom de la catégorie
     * @return valeur du nom de la catégorie
     */
    public String getNom() {
        return nom;
    }

    /**
     * Accede à la taille de la liste
     * @return valeur de la taille de listeAbandon
     */
    public int getTailleListe() {
        return tailleListe;
    }

    /**
     * La méthode actualise prend en paramètre un Objet Observable.
     *Elle actualise la listeAbandon en réccupérant le dernier abandon de la course
     *
     * @param observable
     */
    public void actualise(Observable observable) {
        DirectionCourse direction = (DirectionCourse) observable;
        Abandon abandon = direction.getDernierAbandon();
        if(abandon.getClasse().equals(nom)){
            listeAbandon.add(abandon);
            tailleListe++;
        }
    }
    /**
     * Conversion de l'objet en chaine de caracteres.
     *
     * @return l'objet sous forme de chaine de caractère
     */
    public String toString() {
        String txtListe = "";
        for (Abandon abandon : listeAbandon) {
            txtListe += abandon.toString();
        }
        return "Categorie : " + nom + "\n" + txtListe + "Taille : " + tailleListe;
    }
}
