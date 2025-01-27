public class Abandon {
    private final String nom;
    private final String classe;
    private final String skipper;

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