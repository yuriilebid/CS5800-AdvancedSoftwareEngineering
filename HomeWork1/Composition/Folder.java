package HomeWork1.Composition;

import java.util.ArrayList;

class File {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println(this.name);
    }
}

public class Folder {
    String name;
    ArrayList<File> files = new ArrayList<>();
    ArrayList<Folder> folders = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addFile(String fileName) {
        this.files.add(new File(fileName));
    }

    public void addFile(File file) {
        this.files.add(file);
    }

    public void deleteFile(String name) {
        for(int i = 0; i < files.size(); i++) {
            if(files.get(i).getName().equals(name)) {
                files.remove(files.get(i));
                break;
            }
        }
    }

    public void addFolder(String fileName) {
        this.folders.add(new Folder(fileName));
    }

    public void addFolder(Folder fd) {
        this.folders.add(fd);
    }

    public void deleteFolder() {
        for(int i = 0; i < folders.size(); i++) {
            if(folders.get(i).getName().equals(name)) {
                folders.remove(folders.get(i));
                break;
            }
        }
    }

    public void printAll() {
        String tabulation = "";

        System.out.println(tabulation + "|__" + this.name);
        for(int i = 0; i < folders.size(); i++) {
            folders.get(i).printAll(tabulation + "|  ");
        }
        for(int i = 0; i < files.size(); i++) {
            System.out.println(tabulation + " --" + this.files.get(i).getName());
        }
    }

    public void printAll(String tabulation) {
        System.out.println(tabulation + "|__" + this.name);
        for(int i = 0; i < folders.size(); i++) {
            folders.get(i).printAll(tabulation + "|  ");
        }
        for(int i = 0; i < files.size(); i++) {
            System.out.println(tabulation + " --" + this.files.get(i).getName());
        }
    }
}


class Main {
    public static void main(String[] args) {
        Folder app = new Folder("app");
        app.addFolder("config");
        app.addFolder("controllers");
        app.addFolder("library");
        app.addFolder("migration");
        app.addFolder("models");
        app.addFolder("views");
        Folder publicP = new Folder("public");
        publicP.addFile(".htaccess");
        publicP.addFile(".htrouter.php");
        publicP.addFile(".index.php");

        Folder sourceFiles = new Folder("SourceFiles");
        sourceFiles.addFolder(" .phalcon");
        sourceFiles.addFolder(app);
        sourceFiles.addFolder("cache");
        sourceFiles.addFolder(publicP);

        Folder root = new Folder("demo1");

        // Add some files to the root folder
        root.addFolder(sourceFiles);
        root.addFolder("Include Path");
        root.addFolder("Remote Files");

        root.printAll();
        root.deleteFolder();
    }
}
