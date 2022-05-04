package Patterns.FactoryMethod;

public class AmericanCoffeeShop extends CoffeeShop {
    @Override
    public Coffee createCoffee (CoffeeType type) {

        return switch (type) {
            case AMERICANO -> new AmericanStyleAmericano();
            case ESPRESSO -> new AmericanStyleEspresso();
            case CAPPUCCINO -> new AmericanStyleCappuccino();
            case CAFFE_LATTE -> new AmericanStyleCaffeLatte();
        };
    }
}
