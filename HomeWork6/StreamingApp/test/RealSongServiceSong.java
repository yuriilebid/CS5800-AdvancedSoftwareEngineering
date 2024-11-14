package HomeWork6.StreamingApp.test;

import HomeWork6.StreamingApp.RealSongService;
import HomeWork6.StreamingApp.Song;
import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class RealSongServiceTest {
    private RealSongService service = new RealSongService();

    @Test
    void testSearchById() {
        Song song = service.searchById(1);
        assertNotNull(song, "Song with ID 1 should not be null");
        assertEquals("Song1", song.getTitle(), "Song title should be 'Song1'");
    }

    @Test
    void testSearchByTitle() {
        List<Song> songs = service.searchByTitle("Song2");
        assertEquals(1, songs.size(), "Should find 1 song with title 'Song2'");
        assertEquals("Artist2", songs.getFirst().getArtist(), "Artist should be 'Artist2'");
    }

    @Test
    void testSearchByAlbum() {
        List<Song> songs = service.searchByAlbum("Album1");
        assertEquals(2, songs.size(), "Should find 2 songs in 'Album1'");
    }
}
