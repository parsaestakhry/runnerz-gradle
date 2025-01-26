package runnerz_gradle.run;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;

@Repository
public class RunRepository {
    private List<Run> runs = new ArrayList<Run>();

    List<Run> findAll() {
        return runs;
    }

    @PostConstruct
    private void init() {
        runs.add(new Run(1, "Morning Run", LocalDateTime.now(), LocalDateTime.now().plusHours(1), 5, Location.Outdoor));
    }

    Run findById(Integer i) {
        return runs.stream().filter(run -> run.id().equals(i)).findFirst().orElse(null);
    }

    

}
