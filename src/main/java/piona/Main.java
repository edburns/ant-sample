package piona;

import org.apache.commons.lang3.StringUtils;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

/**
 * Main class - demonstrates dependency management.
 */
public class Main {
    
    /**
     * Application entry point.
     * 
     * @param args Application arguments.
     */
    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
        System.out.println(hw);
        
        // Demonstrate Apache Commons Lang3 usage
        String reversed = StringUtils.reverse("Hello from dependencies!");
        System.out.println("Reversed string: " + reversed);
        
        // Demonstrate Gson usage
        Gson gson = new Gson();
        JsonObject json = new JsonObject();
        json.addProperty("application", "ant-sample");
        json.addProperty("message", "Dependencies are working!");
        json.addProperty("timestamp", System.currentTimeMillis());
        System.out.println("JSON output: " + gson.toJson(json));
    }
}

