package unit;

import com.javaacademy.Cosmonaut;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CapsuleTest {

    @Test
    @DisplayName("Проверка, что корабль полетит, если космонавт здоров")
    public void spaceShuttleFlyWithHealthyCosmonaut() {
        Cosmonaut cosmonautMock = Mockito.mock(Cosmonaut.class);
        Mockito.when(cosmonautMock.isHealthy(true)).then
    }
}
