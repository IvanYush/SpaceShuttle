import com.javaacademy.details.Engine;
import com.javaacademy.details.Rocket;
import com.javaacademy.exceptions.LimitFuelException;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class RocketTest {

    @Test
    @DisplayName("Проверка на наличие в ракете трёх двигателей")
    public void engineNotNull() throws LimitFuelException {
        Rocket rocket = new Rocket(80, 85, 90);
        Assertions.assertNotNull(rocket.getFirstStage());
        Assertions.assertNotNull(rocket.getSecondStage());
        Assertions.assertNotNull(rocket.getThirdStage());
    }

    @Test
    @DisplayName("Проверка на наличие ошибки при создании двигателя с количеством топлива 200_000")
    public void limitFuelFailureToBuildEngine() {
        Assertions.assertThrows(Exception.class, () -> new Engine(200_000));
    }

    @Test
    @DisplayName("Проверка на наличие ошибки при дозаправке двигателя, если топлива больше лимита")
    public void limitFuelFailureToRefuelEngine() throws LimitFuelException {
        Engine engine = new Engine(80_000);
        Assertions.assertThrows(Exception.class, () -> engine.refuel(30_000));
    }

    @Test
    @DisplayName("Проверка на наличие ошибки если у двигателя меньше 60_000 литров топлива при старте")
    public void fuelFailureOnStart() throws LimitFuelException {
        Engine engine = new Engine(59_000);
        Assertions.assertThrows(Exception.class, engine::start);
    }

    @Test
    @DisplayName("Проверка успешности запуска двигателя")
    public void rocketRun() {
        Engine engineMock = Mockito.mock(Engine.class);
        Mockito.


    }

}
