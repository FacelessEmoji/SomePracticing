package Patterns.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        CoffeeShop italianCoffeeShop = new ItalianCoffeeShop();
        italianCoffeeShop.orderCoffee(CoffeeType.CAFFE_LATTE);

        CoffeeShop americanCoffeeShop = new AmericanCoffeeShop();
        americanCoffeeShop.orderCoffee(CoffeeType.CAFFE_LATTE);
    }
}
class ItalianStyleAmericano extends Coffee {}
class ItalianStyleCappuccino extends Coffee {}
class ItalianStyleCaffeLatte extends Coffee {}
class ItalianStyleEspresso extends Coffee {}
class AmericanStyleAmericano extends Coffee {}
class AmericanStyleCappuccino extends Coffee {}
class AmericanStyleCaffeLatte extends Coffee {}
class AmericanStyleEspresso extends Coffee {}