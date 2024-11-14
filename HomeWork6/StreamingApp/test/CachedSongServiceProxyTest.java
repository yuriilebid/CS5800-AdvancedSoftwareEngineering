package HomeWork6.StreamingApp.test;

import HomeWork6.StreamingApp.CachedSongServiceProxy;
import HomeWork6.StreamingApp.RealSongService;
import HomeWork6.StreamingApp.Song;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CachedSongServiceProxyTest {
    private final RealSongService realService = new RealSongService();
    private final CachedSongServiceProxy proxy = new CachedSongServiceProxy(realService);

    @Test
    void testSearchByIdCaching() {
        Song song1 = proxy.searchById(1);
        assertNotNull(song1, "Song should not be null on first search");

        Song song2 = proxy.searchById(1);
        assertSame(song1, song2, "Should return the same song instance from cache");
    }

    @Test
    void testSearchByTitleCaching() {
        List<Song> songs1 = proxy.searchByTitle("Song2");
        assertEquals(1, songs1.size(), "Should find 1 song with title 'Song2'");

        List<Song> songs2 = proxy.searchByTitle("Song2");
        assertSame(songs1, songs2, "Should return the same list instance from cache");
    }

    @Test
    void testSearchByAlbumCaching() {
        List<Song> songs1 = proxy.searchByAlbum("Album1");
        assertEquals(2, songs1.size(), "Should find 2 songs in 'Album1'");

        List<Song> songs2 = proxy.searchByAlbum("Album1");
        assertSame(songs1, songs2, "Should return the same list instance from cache");
    }
}

