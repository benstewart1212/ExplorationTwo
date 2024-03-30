import java.time.*;

public class TestBF {
    Instant start = Instant.now();

    Instant finish = Instant.now();
    long timeElapsed = Duration.between(start,finish).toNanos();
}
