package behavioral.strate;

public class VitTroi extends Duck {
    @Override
    public void display() {
        System.out.println("Mình là vịt trời");
        performFly();
        performQuack();
        System.out.println("Ngoài kêu em còn biết bay");
    }
}
