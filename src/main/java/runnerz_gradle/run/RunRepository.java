package runnerz_gradle.run;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    Optional<Run> findById(Integer i) {
        System.out.println(i);
        return runs.stream().filter(run -> run.id() == i).findFirst();
    }




    // create a new run
    void createRun(Run run) {
        runs.add(run);
    }



    void updateRun(Run run, Integer id) {
        Optional<Run> existingRun = findById(id);
        if (existingRun.isPresent()) {
            runs.set(runs.indexOf(existingRun.get()), run);
        }
    }
    

    void deleteRun(Integer id) {
        Optional<Run> existingRun = findById(id);
        if (existingRun.isPresent()) {
            runs.remove(existingRun.get());
        }
    }

    

}
