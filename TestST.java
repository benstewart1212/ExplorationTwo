import java.time.*;
public class TestST {
    Instant start = Instant.now();

    Instant finish = Instant.now();
    long timeElapsed =  Duration.between(start,finish).toNanos();
}
