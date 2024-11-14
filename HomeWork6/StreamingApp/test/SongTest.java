package HomeWork6.StreamingApp.test;

import HomeWork6.StreamingApp.Song;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SongTest {
    @Test
    void testSongCreation() {
        Song song = new Song(1, "TestSong", "TestArtist", "TestAlbum", 180);

        assertEquals(1, song.getId(), "ID should be 1");
        assertEquals("TestSong", song.getTitle(), "Title should be 'TestSong'");
        assertEquals("TestArtist", song.getArtist(), "Artist should be 'TestArtist'");
        assertEquals("TestAlbum", song.getAlbum(), "Album should be 'TestAlbum'");
        assertEquals(180, song.getDuration(), "Duration should be 180 seconds");
    }
}
