package runnerz_gradle.run;

import java.time.LocalDateTime;

public record Run(Integer id,
        String title,
        LocalDateTime startedOn,
        LocalDateTime completedOn,
        Integer miles,
        Location Location) {

    public Run {
        if (!completedOn.isAfter(startedOn)) {
            throw new IllegalArgumentException("Completed date must be after start date");
        }
    }

}
