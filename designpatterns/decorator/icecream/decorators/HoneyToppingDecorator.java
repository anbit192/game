package designpatterns.decorator.icecream.decorators;

import designpatterns.decorator.icecream.components.IceCream;

public class HoneyToppingDecorator extends ToppingDecorator {

    public HoneyToppingDecorator(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + addTopping();
    }

    @Override
    public String addTopping() {
        return " + honey topping";
    }
}
