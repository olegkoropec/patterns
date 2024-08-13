package proxy;

public class WordDocument implements Document {

    private String path;

    public WordDocument(String path) {
        this.path = path;
    }

    @Override
    public void info() {
        System.out.println("Path to document = " + path);
    }
}
