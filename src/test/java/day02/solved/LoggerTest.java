package day02.solved;

import day02.practice.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTest {

    @Test
    public void testDebugString() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Logger.debug("Debug message");

        System.setOut(System.out);

        assertEquals("DEBUG: Debug message\n", outputStream.toString());
    }

    @Test
    public void testInfoString() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Logger.info("Info message");

        System.setOut(System.out);

        assertEquals("INFO: Info message\n", outputStream.toString());
    }

    @Test
    public void testErrorString() {
        ByteArrayOutputStream errorStream = new ByteArrayOutputStream();
        System.setErr(new PrintStream(errorStream));

        Logger.error("Error message");

        System.setErr(System.err);

        assertEquals("ERROR: Error message\n", errorStream.toString());
    }
}
