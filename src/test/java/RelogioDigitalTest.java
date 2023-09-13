import static org.junit.jupiter.api.Assertions.assertEquals;

public class RelogioDigitalTest {
    @org.junit.jupiter.api.Test
    void testCriacao() {
        RelogioDigital relogio = new RelogioDigital();

        assertEquals(12, relogio.getHora());
        assertEquals(20, relogio.getMinuto());
    }
    @org.junit.jupiter.api.Test
    void testTickSimples() {
        RelogioDigital relogio = new RelogioDigital();

        for (int i = 20; i < 59; i++) {
            relogio.tick();
            assertEquals(i + 1, relogio.getMinuto());
            assertEquals(12, relogio.getHora());
        }
    }

    /**
     * 
     */
    @org.junit.jupiter.api.Test
    void testTickViraHora() {
        RelogioDigital relogio = new RelogioDigital();

        relogio.setHora(1);
        relogio.setMinuto(0);

        for (int i = 0; i < 59; i++) {
            relogio.tick();
            assertEquals(i + 1, relogio.getMinuto());
            assertEquals(1, relogio.getHora());
        }

        relogio.tick();

        extracted(relogio);
        assertEquals(2, relogio.getHora());
    }
    private void extracted(RelogioDigital relogio) {
        assertEquals(0, relogio.getMinuto());
    }

    @org.junit.jupiter.api.Test
    void testTickViraDia() {
        RelogioDigital relogio = new RelogioDigital();

        relogio.setHora(23);
        relogio.setMinuto(0);

        for (int i = 0; i < 59; i++) {
            relogio.tick();
            assertEquals(i + 1, relogio.getMinuto());
            assertEquals(23, relogio.getHora());
        }

        relogio.tick();

        extracted(relogio);
        assertEquals(0, relogio.getHora());
    }
}
