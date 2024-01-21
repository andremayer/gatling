import io.gatling.app.Gatling;
import io.gatling.core.config.GatlingPropertiesBuilder;

public class Main {

    public static void main(String[] args) {
        GatlingPropertiesBuilder gatlingProperties = new GatlingPropertiesBuilder();
        gatlingProperties.simulationClass("RunStressTest"); 

        Gatling.fromMap(gatlingProperties.build());
    }
    
}