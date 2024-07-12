package Decorator_pattern.Vidu;

public class Mocha extends CondimentDecorator{
    public Mocha(String description, Beverage beverage) {
        super(description, beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + " + this.description;
    }

    @Override
    public int Cost() {
        return beverage.Cost() + 5;
    }
}
