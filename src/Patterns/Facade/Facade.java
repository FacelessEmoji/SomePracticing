package Patterns.Facade;

class Facade {
    private Key key;
    private Engine engine;
    public Facade() {
        key = new Key();
        engine = new Engine();
    }
    public void startCar() {
        key.start();
        engine.start();
    }
    public void stopCar() {
        key.stop();
        engine.stop();
    }
}