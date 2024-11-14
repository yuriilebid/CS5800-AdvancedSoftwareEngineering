package HomeWork6.StreamingApp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CachedSongServiceProxy implements SongService {
    private final RealSongService realSongService;
    private final Map<Integer, Song> songCacheById = new HashMap<>();
    private final Map<String, List<Song>> songCacheByTitle = new HashMap<>();
    private final Map<String, List<Song>> songCacheByAlbum = new HashMap<>();

    public CachedSongServiceProxy(RealSongService realSongService) {
        this.realSongService = realSongService;
    }

    @Override
    public Song searchById(Integer songID) {
        if (!songCacheById.containsKey(songID)) {
            Song song = realSongService.searchById(songID);
            songCacheById.put(songID, song);
        }
        return songCacheById.get(songID);
    }

    @Override
    public List<Song> searchByTitle(String title) {
        if (!songCacheByTitle.containsKey(title)) {
            List<Song> songs = realSongService.searchByTitle(title);
            songCacheByTitle.put(title, songs);
        }
        return songCacheByTitle.get(title);
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        if (!songCacheByAlbum.containsKey(album)) {
            List<Song> songs = realSongService.searchByAlbum(album);
            songCacheByAlbum.put(album, songs);
        }
        return songCacheByAlbum.get(album);
    }
}
