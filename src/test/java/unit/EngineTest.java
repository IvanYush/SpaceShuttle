package unit;

import com.javaacademy.details.Engine;
import com.javaacademy.exceptions.LimitFuelException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EngineTest {

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
        Assertions.assertThrows(Exception.class, () -> engine.start());
    }


}
