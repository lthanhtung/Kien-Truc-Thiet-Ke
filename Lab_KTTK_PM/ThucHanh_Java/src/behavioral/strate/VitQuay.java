package behavioral.strate;

public class VitQuay extends Duck {
    @Override
    public void display() {
        System.out.println("Mình là vịt quay ăn thit ăn ngon lăm mn");
        performFly();
        performQuack();
        System.out.println("Ủng hộ em nha mn");

    }
}
