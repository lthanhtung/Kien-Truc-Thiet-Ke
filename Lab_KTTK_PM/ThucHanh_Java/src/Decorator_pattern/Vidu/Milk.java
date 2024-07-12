package Decorator_pattern.Vidu;

public class Milk extends CondimentDecorator{
    public Milk(String description, Beverage beverage) {
        super(description, beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + " + this.description;
    }

    @Override
    public int Cost() {
        return beverage.Cost() +2;
    }

}
