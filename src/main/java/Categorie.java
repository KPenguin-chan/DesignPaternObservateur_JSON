import java.util.ArrayList;

public class Categorie implements Observateur {
    private final String nom;
    private ArrayList<Abandon> listeAbandon;
    private int tailleListe;

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
