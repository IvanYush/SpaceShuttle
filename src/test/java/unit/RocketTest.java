package unit;

import com.javaacademy.details.Engine;
import com.javaacademy.details.Rocket;
import com.javaacademy.exceptions.LimitFuelException;
import com.javaacademy.exceptions.NotEnoughFuelException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class RocketTest {

    @Test
    @DisplayName("Проверка на наличие в ракете трёх двигателей")
    public void engineNotNull() throws LimitFuelException {
        Rocket rocket = new Rocket(new Engine(10), new Engine(15), new Engine(20));
        Assertions.assertNotNull(rocket.getFirstStage());
        Assertions.assertNotNull(rocket.getSecondStage());
        Assertions.assertNotNull(rocket.getThirdStage());
    }

    @Test
    @DisplayName("Проверка успешности запуска ракеты")
    public void rocketRun() {
        Engine firstStage = Mockito.mock(Engine.class);
        Engine secondStage = Mockito.mock(Engine.class);
        Engine thirdStage = Mockito.mock(Engine.class);
        Rocket rocket = new Rocket(firstStage, secondStage, thirdStage);
        rocket.run();
    }

//    @Test
//    @DisplayName("Проверка наличия ошибки при запуске ракеты")
//    public void rocketRunFailure() throws NotEnoughFuelException {
//        Engine firstStage = Mockito.mock(Engine.class);
//        Engine secondStage = Mockito.mock(Engine.class);
//        Engine thirdStage = Mockito.mock(Engine.class);
//        Mockito.doThrow(NotEnoughFuelException.class).when(firstStage).start();
//        Rocket rocket = new Rocket(firstStage, secondStage, thirdStage);
//        Assertions.assertThrows(Exception.class, () -> rocket.run());
//    }





}
