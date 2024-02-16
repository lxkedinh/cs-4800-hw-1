package composition;

import java.util.HashMap;
import java.util.List;
import java.util.Vector;

public class Folder {
    private String name;
    private int depth;
    public HashMap<String, Folder> subfolders;
    private List<File> containedFiles;

    public Folder(String name, int depth) {
        this.name = name;
        this.depth = depth;
        subfolders = new HashMap<>();
        containedFiles = new Vector<>();
    }

    public Folder(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getDepth() {
        return depth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public void addSubfolder(String parentFolderName, String newFolderName) {
        if (parentFolderName.equals(name)) {
            subfolders.put(newFolderName, new Folder(newFolderName, depth + 1));
        }
        else {
            for (Folder subfolder : subfolders.values()) {
                subfolder.addSubfolder(parentFolderName, newFolderName);
            }
        }
    }

    public void deleteSubfolder(String parentFolderName, String folderToDelete) {
        if (parentFolderName.equals(name)) {
            subfolders.remove(folderToDelete);
        } else {
            for (Folder subfolder: subfolders.values()) {
                subfolder.deleteSubfolder(parentFolderName, folderToDelete);
            }
        }
    }

    public void addFile(String parentFolderName, String newFileName) {
        if (parentFolderName.equals(name)) {
            containedFiles.add(new File(newFileName, depth + 1));
        } else {
            for (Folder subfolder : subfolders.values()) {
                subfolder.addFile(parentFolderName, newFileName);
            }
        }
    }

    public void printDepthIndicator() {
        for (int i = 0; i < depth; i++) {
            System.out.print("| ");
        }
        System.out.print("|___");
    }

    public void print() {
        printDepthIndicator();
       System.out.println(name + "/");

       for (Folder subfolder : subfolders.values()) {
           subfolder.print();
       }

       for (File file : containedFiles) {
           file.print();
       }
    }
}
