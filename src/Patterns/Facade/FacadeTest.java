package Patterns.Facade;

public class FacadeTest {//ัะตัั
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.startCar();
        System.out.println();
        facade.stopCar();
    }
}