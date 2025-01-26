package runnerz_gradle.run;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.annotation.PostConstruct;

public class RunRepository {
    private List<Run> runs = new ArrayList<Run>();

    List<Run> getRuns() {
        return runs;
    }

    @PostConstruct
    private void init() {
        runs.add(new Run(1, "Morning Run", LocalDateTime.now(), LocalDateTime.now().plusHours(1), 5, Location.Outdoor));
    }

}
