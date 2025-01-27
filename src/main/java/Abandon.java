public class Abandon {
    private final String nom;
    private final String classe;
    private final String skipper;

    /**
     *Construit l'objet de type Abandon avec un
     * etat predefini.
     * @param nom
     * @param classe
     * @param skipper
     */
    Abandon(String nom, String classe, String skipper) {
        this.nom = nom;
        this.classe = classe;
        this.skipper = skipper;
    }

    /**
     * Accede au nom du bateau du skipper qui a abandonné
     * @return valeur du nom du bateau qui a abandonné
     */
    public String getNom() {
        return nom;
    }

    /**
     * Accede au nom de la classe du skipper qui a abandonné
     * @return valeur du nom de la classe
     */
    public String getClasse() {
        return classe;
    }

    /**
     * Accede au nom du skipper qui a abandonné
     * @return valeur du nom du skipper
     */
    public String getSkipper() {
        return skipper;
    }

    /**
     * Conversion de l'objet en chaine de caracteres.
     *
     * @return l'objet sous forme de chaine de caractère
     */
    public String toString() {
        return "Nom: " + nom + ", Classe: " + classe + ", Skipper: " + skipper + "\n";
    }
}