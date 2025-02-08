package runnerz_gradle.run;


import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;



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
            throw new RunNotFoundException();
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


    // put

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void updateRun(@RequestBody Run run, @PathVariable("id") Integer id) {
        runRepository.updateRun(run, id);
    }


    // delete 
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteRun(@PathVariable("id") Integer id) {
        runRepository.deleteRun(id);
    }
    

}
