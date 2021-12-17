package sorting;

import java.time.LocalDateTime;

public class Patient {

    private String name;

    private String ssn;

    private LocalDateTime time;

    public Patient(String name, String ssn, LocalDateTime time) {
        this.name = name;
        this.ssn = ssn;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public LocalDateTime getTime() {
        return time;
    }
}
