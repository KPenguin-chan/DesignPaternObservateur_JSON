import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.HashSet;

public class Main {
    /**
     * Creer different objets et teste la fonctionnalité de ces objets en utilisant leur méthode
     * @param args
     */
    public static void main(String[] args) {
        HashSet<Abandon> lesAbandons = new HashSet<>();
        /*
        lesAbandons.add(new Abandon("Nexans - Art et Fenetres", "IMOCA", "Fabrice AMEDEO"));
        lesAbandons.add(new Abandon("LEYTON", "OCEAN_FIFTY", "Sam GOODCHILD"));
        lesAbandons.add(new Abandon("Bella Donna - Race For Pure Ocean", "Rhum_Mono", "Fabio GENNARI"));
        */

        JSONArray abandonsJson = json.lecture("json/AbandonsRouteDuRhum_2022.json");
        int nbAbandons = abandonsJson.size();
        for (int i = 0; i < nbAbandons; i++) {
            JSONObject abandon = (JSONObject) abandonsJson.get(i);
            lesAbandons.add(new Abandon((String) abandon.get("voilier"), (String) abandon.get("classe"), (String) abandon.get("skipper")));
        }

        DirectionCourse directionC = new DirectionCourse();

        Observateur imoca = new Categorie("IMOCA");
        directionC.enregistreObservateurs(imoca);

        Observateur class40 = new Categorie("Class40");
        directionC.enregistreObservateurs(class40);

        Observateur OCEAN_FIFTY = new Categorie("OCEAN_FIFTY");
        directionC.enregistreObservateurs(OCEAN_FIFTY);

        Observateur Ultim = new Categorie("ULTIM");
        directionC.enregistreObservateurs(Ultim);

        Observateur RhumMono = new Categorie("Rhum_Mono");
        directionC.enregistreObservateurs(RhumMono);

        Observateur RhumMulti = new Categorie("Rhum_Multi");
        directionC.enregistreObservateurs(RhumMulti);

        directionC.simulationCourse(lesAbandons);

    }
}