import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.IOException;

public class json {

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
