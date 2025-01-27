public interface Observable {
    /**
     * Enregistre les observateurs dans la liste des Observateurs
     * @param observateur
     */
    public void enregistreObservateurs(Observateur observateur);
    /** Retire un observateur de la liste des observateurs
     * @param observateur
     */
    public void desenregistreObservateurs(Observateur observateur);
    /**
     * Informe les observateur de la liste des changement de l'objet DirectionCourse
     */
    public void informeObservateurs();
}
