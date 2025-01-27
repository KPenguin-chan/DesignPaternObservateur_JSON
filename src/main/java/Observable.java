public interface Observable {
    public void enregistreObservateurs(Observateur observateur);
    public void desenregistreObservateurs(Observateur observateur);
    public void informeObservateurs();
}
