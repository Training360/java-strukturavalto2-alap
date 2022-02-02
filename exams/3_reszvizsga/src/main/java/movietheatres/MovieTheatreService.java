package movietheatres;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalTime;
import java.util.*;

public class MovieTheatreService {

    private Map<String, List<Movie>> shows = new LinkedHashMap<>();


    public void readFromFile(Path path){
        try(BufferedReader br = Files.newBufferedReader(path)){
            String line;
            while((line=br.readLine())!=null){
                parseLine(line);
            }

        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file!");
        }
    }

    private void parseLine(String line) {
        String[] temp = line.split("-");
        String[] movieTemp = temp[1].split(";");
        if(!shows.containsKey(temp[0])){
            shows.put(temp[0],new ArrayList<>());
        }
        shows.get(temp[0]).add(new Movie(movieTemp[0], LocalTime.parse(movieTemp[1])));
        Collections.sort(shows.get(temp[0]),Comparator.comparing(Movie::getStartTime));
    }

    public Map<String, List<Movie>> getShows() {
        return shows;
    }


    public List<String> findMovie(String title){
//       Set<String> result = new LinkedHashSet<>();
//        for(Map.Entry<String,List<Movie>> actual : shows.entrySet()){
//            for(Movie m : actual.getValue()){
//                if(m.getTitle().equals(title)){
//                    result.add(actual.getKey());
//                }
//            }
//        }
//
//        return new ArrayList<>(result);

        return shows.entrySet().stream()
                .filter(e->e.getValue().stream()
                .anyMatch(m->m.getTitle().equals(title)))
                .map(e->e.getKey()).toList();
    }

    public LocalTime findLatestShow(String title){
        return shows.entrySet().stream().flatMap(e->e.getValue().stream())
                .filter(m->m.getTitle().equals(title))
                .sorted(Comparator.comparing(Movie::getStartTime).reversed())
                .findFirst().orElseThrow(()->new IllegalArgumentException("Cannot find movie!")).getStartTime();

    }
}
