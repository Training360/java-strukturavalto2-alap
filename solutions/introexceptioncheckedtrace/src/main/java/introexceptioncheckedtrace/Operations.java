package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

public class Operations {

    public List<String> readFile() throws IOException {
        Path path = Paths.get("src/main/resources/underground.txt");
        List<String> underground = Files.readAllLines(path);
        return underground;
    }

    public String getDailySchedule(List<String> underground) {
        StringBuilder sb = new StringBuilder(LocalDate.now().toString());
        sb.append(", ");
        for (String s : underground) {
            if (s.startsWith("2")) {
                sb.append(s);
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
