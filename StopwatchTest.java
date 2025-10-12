import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StopwatchTest {

    @Test
    void testStartAndStopFlow() throws InterruptedException {
        Stopwatch sw = new Stopwatch();
        sw.start();
        Thread.sleep(50); // simulate elapsed time
        sw.stop();
        long elapsed = sw.getElapsedTime();
        assertTrue(elapsed >= 50);
    }

    @Test
    void cannotStopBeforeStart() {
        Stopwatch sw = new Stopwatch();
        assertThrows(IllegalStateException.class, sw::stop);
    }

    @Test
    void cannotStartTwice() {
        Stopwatch sw = new Stopwatch();
        sw.start();
        assertThrows(IllegalStateException.class, sw::start);
    }

    @Test
    void getElapsedWhileRunning() throws InterruptedException {
        Stopwatch sw = new Stopwatch();
        sw.start();
        Thread.sleep(30);
        assertTrue(sw.getElapsedTime() > 0);
        sw.stop();
    }
}
