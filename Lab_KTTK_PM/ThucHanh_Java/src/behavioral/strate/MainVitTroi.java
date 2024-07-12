package behavioral.strate;

public class MainVitTroi {
    public static void main(String[] args) {
        Duck d2 = new VitTroi();
        d2.setFlyable(new Baynhay());
        d2.setQuackable(new VitkeuLofi());
        d2.display();
    }
}
