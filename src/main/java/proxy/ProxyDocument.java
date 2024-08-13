package proxy;

public class ProxyDocument implements Document {
    private WordDocument wordDocument;
    private String path;

    public ProxyDocument(String path) {
        this.path = path;
    }

    @Override
    public void info() {
        if (path.isBlank()) {
            path = "some value";
        }
        if (wordDocument == null) {
            wordDocument = new WordDocument(path);
        }
        wordDocument.info();
    }
}
