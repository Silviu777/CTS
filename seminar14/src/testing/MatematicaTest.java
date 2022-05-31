package testing;

import org.junit.jupiter.api.Test;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class MatematicaTest {

    @Test()
    public void testareSumaPerformance() {
        Matematica matematica = new Matematica();
        assertTimeout(Duration.ofMillis(1000), () -> {
            matematica.suma(3, 4);
        });
    }

    @Test()
    public void testareSumaRight() {
        Matematica matematica = new Matematica();
        assertEquals(7, matematica.suma(2, 5));
    }

    @Test()
    public void testareSumaInverse() {
       Matematica matematica = new Matematica();
       int suma = matematica.suma(1143, 4345);
       assertEquals(1143, suma - 4345);
    }

    @Test
    public void testareRaportRight() {
        Matematica matematica = new Matematica();
        assertEquals(18, matematica.raport(36, 2), 0.01);
    }

    @Test
    public void testareRaportBounderySuperior() {
        Matematica matematica = new Matematica();
        assertEquals(7, matematica.raport(7, 1), "Metoda raport nu genereaza rezultatul corect!");
    }

    @Test
    public void testareRaportBounderyInferior() {
        Matematica matematica = new Matematica();
        assertEquals(-7, matematica.raport(7, -1));
    }

    @Test
    public void testareRaportExceptie() {
        Matematica matematica = new Matematica();
        assertThrows(NumitorIncorectException.class, () -> matematica.raport(7, 0));
    }
}