package TutorialFacTori;

public abstract class PizzaStore {
    abstract Pizza CreatePizza(LoaiPizza loaiPizza);
    public Pizza OrderPizza(LoaiPizza loaiPizza)
    {
        Pizza pizza = CreatePizza(loaiPizza);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }


}
