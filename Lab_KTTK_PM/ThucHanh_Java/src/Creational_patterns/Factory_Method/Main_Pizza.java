package Creational_patterns.Factory_Method;

public class Main_Pizza {
    public static void main(String[] args) {

        PizzaStore ps = new PizzaStore() {
            @Override
            Pizza createPizza(PizzaType p) {
                return new VN_HaiSanPizza();
            }
        };
        Pizza pizza = ps.orderPizza(PizzaType.HAISAN);
        System.out.println(pizza.toString());

    }

}
