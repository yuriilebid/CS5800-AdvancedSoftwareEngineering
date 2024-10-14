package HomeWork1.FileSystemComposition;

public class FolderDriver {
    public static void main(String[] args) {
        // Create folders and files
        Folder app = new Folder("app");
        app.addSubFolder(new Folder("config"));
        app.addSubFolder(new Folder("controllers"));
        app.addSubFolder(new Folder("library"));
        app.addSubFolder(new Folder("migration"));
        app.addSubFolder(new Folder("models"));
        app.addSubFolder(new Folder("views"));

        Folder publicP = new Folder("public");
        publicP.addFile("htaccess");
        publicP.addFile("htrouter.php");
        publicP.addFile("index.php");

        Folder sourceFiles = new Folder("SourceFiles");
        sourceFiles.addSubFolder(new Folder("phalcon"));
        sourceFiles.addSubFolder(app);
        sourceFiles.addSubFolder(new Folder("cache"));
        sourceFiles.addSubFolder(publicP);

        Folder root = new Folder("demo1");
        root.addSubFolder(sourceFiles);
        root.addSubFolder(new Folder("Include Path"));
        root.addSubFolder(new Folder("Remote Files"));

        // Print the entire folder structure
        System.out.println("Initial Folder Structure:");
        root.printAll();

        // Delete the 'app' folder and print the structure
        root.deleteFolder("app");
        System.out.println("\nAfter deleting 'app':");
        root.printAll();

        // Delete the 'public' folder and print the structure
        root.deleteFolder("public");
        System.out.println("\nAfter deleting 'public':");
        root.printAll();
    }
}
