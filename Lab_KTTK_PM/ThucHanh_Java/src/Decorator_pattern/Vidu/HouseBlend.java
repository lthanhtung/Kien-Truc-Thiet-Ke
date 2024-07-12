package Decorator_pattern.Vidu;

public class HouseBlend extends Beverage{
    public HouseBlend(String description) {
        super(description);
    }

    @Override
    public int Cost() {
        return 10;
    }

}
