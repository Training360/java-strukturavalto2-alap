package week13.day05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TransfersGenerator {

    public static void main(String[] args) throws IOException {
        List<String> transfers = new ArrayList<>();
        Random random = new Random();
        List<String> ids =
                Stream.generate(() -> UUID.randomUUID().toString()).limit(20).collect(Collectors.toList());
        for (int i = 0; i < 1000; i++) {
            String id1 = ids.get(random.nextInt(ids.size()));
            String id2 = ids.get(random.nextInt(ids.size()));
            int amount = random.nextInt(1_000_000);
            transfers.add(String.format("%s,%s,%d", id1, id2, amount));
        }

        Files.writeString(Paths.get("src\\main\\resources\\transfers.csv"), String.join("\r\n", transfers));
    }
}
