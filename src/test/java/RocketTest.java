import com.javaacademy.details.Engine;
import com.javaacademy.details.Rocket;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RocketTest {

    @Test
    public void engineNotNull() {
        Engine firstStage = new Engine(80.0);
        Engine secondStage = new Engine(85.0);
        Engine thirdStage = new Engine(90.0);
        Rocket rocket = new Rocket(80.0, 85.0, 90.0);
        Assertions.assertNotNull(rocket.getFirstStage());
        Assertions.assertNotNull(rocket.getSecondStage());
        Assertions.assertNotNull(rocket.getThirdStage());
    }
}
