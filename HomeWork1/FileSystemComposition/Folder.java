package HomeWork1.FileSystemComposition;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

class File {
    private String name;

    public File(String name) {
        this.name = validateName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = validateName(name);
    }

    public void printName() {
        System.out.println(this.name);
    }

    public void printName(String tabulation) {
        System.out.println(tabulation + " --" + this.name);
    }

    private String validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        return name;
    }
}

public class Folder {
    private String name;
    private final ArrayList<File> files = new ArrayList<>();
    private final ArrayList<Folder> subFolders = new ArrayList<>();

    public Folder(String name) {
        this.name = validateName(name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = validateName(name);
    }

    public void addFile(String fileName) {
        this.files.add(new File(validateName(fileName)));
    }

    public void removeFileFromCurrentFolder(String fileName) {
        // Use iterator for safe removal
        Iterator<File> iterator = files.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getName().equals(fileName)) {
                iterator.remove();
                return;
            }
        }
    }

    public void deleteFile(String fileName) {
        removeFileFromCurrentFolder(fileName);
        for (Folder folder : subFolders) {
            folder.deleteFile(fileName);
        }
    }

    public void addSubFolder(String folderName) {
        this.subFolders.add(new Folder(validateName(folderName)));
    }

    public void addSubFolder(Folder folder) {
        this.subFolders.add(Objects.requireNonNull(folder, "Folder is NULL"));
    }

    public void removeFolderFromCurrentFolder(String folderName) {
        // Use iterator for safe removal
        Iterator<Folder> iterator = subFolders.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getName().equals(folderName)) {
                iterator.remove();
                return;
            }
        }
    }

    public void deleteFolder(String folderName) {
        removeFolderFromCurrentFolder(folderName);
        for (Folder folder : subFolders) {
            folder.deleteFolder(folderName);
        }
    }

    public void printAll() {
        printAll("");
    }

    public void printAllFolders(String tabulation) {
        for (Folder folder : subFolders) {
            folder.printAll(tabulation + "|  ");
        }
    }

    public void printAllFiles(String tabulation) {
        for (File file : files) {
            file.printName(tabulation + "  ");
        }
    }

    private void printAll(String tabulation) {
        System.out.println(tabulation + "|__" + this.name);
        printAllFolders(tabulation);
        printAllFiles(tabulation);
    }

    private String validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        return name;
    }
}

class Main {
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
        publicP.addFile(".htaccess");
        publicP.addFile(".htrouter.php");
        publicP.addFile(".index.php");

        Folder sourceFiles = new Folder("SourceFiles");
        sourceFiles.addSubFolder(new Folder(".phalcon"));
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
        System.out.println("\nFolder Structure after deleting 'app':");
        root.printAll();

        // Delete the 'public' folder and print the structure
        root.deleteFolder("public");
        System.out.println("\nFolder Structure after deleting 'public':");
        root.printAll();
    }
}
