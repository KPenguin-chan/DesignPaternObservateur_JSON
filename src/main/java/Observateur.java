public interface Observateur {
    /**
     * La méthode actualise prend en paramètre un Objet Observable.
     *Elle actualise la listeAbandon en réccupérant le dernier abandon de la course
     *
     * @param observable
     */
    public void actualise(Observable observable);
}
