import java.util.ArrayList;

public class Categorie implements Observateur {
    private final String nom;
    private ArrayList<Abandon> listeAbandon;
    private int tailleListe;

    /**
     *Il s'agit de la méthode de constrution de la classe Catégorie.
     *Elle prend en paramètre nom (le nom de la catégorie) et créée avec un objet Categorie
     * @param nom
     */
    public Categorie(String nom) {
        this.nom = nom;
        listeAbandon = new ArrayList<>();
        tailleListe = 0;
    }

    public String getNom() {
        return nom;
    }

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

    public String toString() {
        String txtListe = "";
        for (Abandon abandon : listeAbandon) {
            txtListe += abandon.toString();
        }
        return "Categorie : " + nom + "\n" + txtListe + "Taille : " + tailleListe;
    }
}
