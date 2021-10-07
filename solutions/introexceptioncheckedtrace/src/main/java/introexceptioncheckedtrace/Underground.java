package introexceptioncheckedtrace;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Underground {

    public static void main(String[] args) {
        Operations operations = new Operations();

        List<String> underground = new ArrayList<>();
        try {
            underground = operations.readFile();
        } catch (IOException ioe) {
            System.out.println("Error while reading file.");
        }

        if (underground.size() != 0) {
            String dailySchedule = operations.getDailySchedule(underground);
            System.out.println(dailySchedule);
        }
    }
}
