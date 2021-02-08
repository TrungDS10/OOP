import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JSONSUtils {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static void createEmptyJSON(String DIR) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(DIR), "UTF-8"));
            writer.write("{}");
        } catch (IOException ex) {
            Logger.getLogger(JSONS_IO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(JSONS_IO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static String marshal(Object source){
        try {
            return MAPPER.writeValueAsString(source);
        } catch (JsonProcessingException ex) {
            Logger.getLogger(JSONSUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static <T> T unmarshal(String ObjXml, Class<T> configurationClass){
        try {
            return (T) MAPPER.readValue(ObjXml, configurationClass);
        } catch (JsonProcessingException ex) {
            Logger.getLogger(JSONSUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}