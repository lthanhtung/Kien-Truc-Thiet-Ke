package TutorialFacTori;

public class MainPizza {
    public static void main(String[] args) {


        PizzaStore pizzaStore = new PizzaStore() {
            @Override
            Pizza CreatePizza(LoaiPizza loaiPizza) {
                return new PizzaHaiSan();
            }
        };
        Pizza pizza = pizzaStore.OrderPizza(LoaiPizza.HAISAN);
        System.out.println(pizza.toString());
    }
}
