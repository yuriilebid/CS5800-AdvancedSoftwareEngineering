package HomeWork6.StreamingApp;

import java.util.ArrayList;
import java.util.List;

public class RealSongService implements SongService {
    private final List<Song> songDatabase;

    public RealSongService() {
        songDatabase = new ArrayList<>();
        songDatabase.add(new Song(1, "Song1", "Artist1", "Album1", 200));
        songDatabase.add(new Song(2, "Song2", "Artist2", "Album2", 250));
        songDatabase.add(new Song(3, "Song3", "Artist1", "Album1", 180));
        songDatabase.add(new Song(4, "Song4", "Artist3", "Album3", 300));
        songDatabase.add(new Song(5, "Song5", "Artist2", "Album2", 230));
    }

    private void simulateNetworkDelay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Song searchById(Integer songID) {
        simulateNetworkDelay();
        return songDatabase.stream().filter(song -> song.getId().equals(songID)).findFirst().orElse(null);
    }

    @Override
    public List<Song> searchByTitle(String title) {
        simulateNetworkDelay();
        List<Song> result = new ArrayList<>();

        for (Song song : songDatabase) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                result.add(song);
            }
        }
        return result;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        simulateNetworkDelay();
        List<Song> result = new ArrayList<>();
        for (Song song : songDatabase) {
            if (song.getAlbum().equalsIgnoreCase(album)) {
                result.add(song);
            }
        }
        return result;
    }
}

