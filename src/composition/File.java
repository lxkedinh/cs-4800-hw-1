package composition;

public class File {
    private String name;
    private int depth;

    public File(String name, int depth) {
        this.name = name;
        this.depth = depth;
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

    public void printDepthIndicator() {
        for (int i = 0; i < depth; i++) {
            System.out.print("| ");
        }
    }

    public void print() {
        printDepthIndicator();
        System.out.println(name);
    }
}
