import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.IOException;

public class json {

    /**
     * Lis un fichier JSON et le transforme en liste
     * @param fileName
     * @return une liste contenant les information contenues dans le fichier JSON en paramètre
     */
    public static JSONArray lecture (String fileName){
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader(fileName)){
            return (JSONArray) jsonParser.parse(reader);
        }
        catch (IOException | org.json.simple.parser.ParseException e){
            e.printStackTrace();
        }
        return null;
    }
}
