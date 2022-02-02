package streams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SongService {

    private List<Song> songs = new ArrayList<>();

    public void addSong(Song song){
        songs.add(song);
    }

    public Optional<Song> shortestSong(){
        return songs.stream()
                .sorted(Comparator.comparing(s->s.getLength()))
                .findFirst();
    }

    public List<Song> findSongByTitle(String title){
        return songs.stream()
                .filter(s->s.getTitle().equals(title))
                .toList();

    }

    public boolean isPerformerInSong(Song song, String name){
        return songs.stream()
                .filter(s->s.getTitle().equals(song.getTitle()))
                .anyMatch(s->s.getPerformers().contains(name));
    }

    public List<String> titlesBeforeDate(LocalDate date){
        return songs.stream()
                .filter(s->s.getRelease().isBefore(date))
                .map(Song::getTitle)
                .toList();
    }
}
