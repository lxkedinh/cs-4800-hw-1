package composition;

public class CompositionDriver {
    public static void main(String[] args) {
        Folder root = new Folder("php_demo1");
        root.addSubfolder("php_demo1", "Source Files");
        root.addSubfolder("php_demo1", "Include Path");
        root.addSubfolder("php_demo1", "Remote Files");

        root.addSubfolder("Source Files", ".phaIcon");
        root.addSubfolder("Source Files", "app");
        root.addFile("Source Files", ".htaccess");
        root.addFile("Source Files", ".htrouter.php");
        root.addFile("Source Files", "index.html");

        root.addSubfolder("Source Files", "cache");
        root.addSubfolder("Source Files", "public");
        root.addSubfolder("app", "config");
        root.addSubfolder("app", "controllers");
        root.addSubfolder("app", "library");
        root.addSubfolder("app", "migration");
        root.addSubfolder("app", "models");
        root.addSubfolder("app", "views");

        root.print();

        // spacer
        System.out.println();

        root.deleteSubfolder("Source Files", "app");
        root.print();

        // spacer

        System.out.println();

        root.deleteSubfolder("Source Files", "public");
        root.print();
    }
}
