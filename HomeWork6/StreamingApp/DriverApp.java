package HomeWork6.StreamingApp;

public class DriverApp {
    public static void main(String[] args) {
        RealSongService realService = new RealSongService();
        SongService proxyService = new CachedSongServiceProxy(realService);

        System.out.println("First search by ID (ID = 1): " + proxyService.searchById(1).getTitle());
        System.out.println("Second search by ID (ID = 1): " + proxyService.searchById(1).getTitle());

        System.out.println("First search by Album (Album = Album1): " + proxyService.searchByAlbum("Album1").size() + " songs found");
        System.out.println("Second search by Album (Album = Album1): " + proxyService.searchByAlbum("Album1").size() + " songs found");

        System.out.println("First search by Title (Title = Song2): " + proxyService.searchByTitle("Song2").size() + " songs found");
        System.out.println("Second search by Title (Title = Song2): " + proxyService.searchByTitle("Song2").size() + " songs found");
    }
}
