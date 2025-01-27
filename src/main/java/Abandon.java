public class Abandon {
    private final String nom;
    private final String classe;
    private final String skipper;

    /**
     * Il s'agit de la méthode de constrution de la classe Abandon.
     * Elle prend en paramètre nom (le nom du voilier), classe(le nom de la Classe du voilier) et
     * skipper(le nom du skipper). Avec ces paramètres elle créee un objet Abandon.
     * @param nom
     * @param classe
     * @param skipper
     */
    Abandon(String nom, String classe, String skipper) {
        this.nom = nom;
        this.classe = classe;
        this.skipper = skipper;
    }

    public String getNom() {
        return nom;
    }

    public String getClasse() {
        return classe;
    }

    public String getSkipper() {
        return skipper;
    }

    public String toString() {
        return "Nom: " + nom + ", Classe: " + classe + ", Skipper: " + skipper + "\n";
    }
}