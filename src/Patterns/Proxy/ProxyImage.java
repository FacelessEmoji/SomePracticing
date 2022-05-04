package Patterns.Proxy;

public class ProxyImage implements Image {
    private String file;
    private RealImage image;

    public ProxyImage(String file) {
        this.file = file;
    }

    public void display() {
        if (image == null) {
            image = new RealImage(file);
        }
        image.display();
    }
}
