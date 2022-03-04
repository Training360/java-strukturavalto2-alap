package videos;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class VideoPlatform {

    private List<Channel> channels = new ArrayList<>();

    public List<Channel> getChannels() {
        return new ArrayList<>(channels);
    }

    public void readDataFromFile(Path path) {
        try (BufferedReader br = Files.newBufferedReader(path)) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                processLine(line);
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot open file for read!", ioe);
        }
    }

    private void processLine(String line) {
        String[] temp = line.split(";");
        int numebrOfSubscriptions = Integer.parseInt(temp[1]);
        int videos = Integer.parseInt(temp[2]);
        channels.add(new Channel(temp[0], numebrOfSubscriptions, videos));
    }

    public int calculateSumOfVideos() {
        return channels.stream()
                .mapToInt(Channel::getNumberOfVideos)
                .sum();
    }
}
