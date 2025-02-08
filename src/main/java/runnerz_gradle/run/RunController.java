package runnerz_gradle.run;


import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;



@RestController
@RequestMapping("/api/runs")
public class RunController {

    private final RunRepository runRepository;
    
    public RunController(RunRepository runRepository) {
        this.runRepository = runRepository;
    }
    
    @GetMapping("")
    List<Run> getRuns() {
        return runRepository.findAll();
    }

    @GetMapping("/{id}")
    Run findById(@PathVariable("id") Integer id) {
        Optional<Run> run = runRepository.findById(id);
        if (run.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Run not found");
        } else {
            return run.get();
        }
    }
    
    
    // post
    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    void createRun(@RequestBody Run run) {
        runRepository.createRun(run);
    }


    
    

}
