package Patterns.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");
        image.display();
        image.display();
        //image -> image.getName()
        //proxyImage -> image.getName() proxyImage do image.getName()
    }
}
