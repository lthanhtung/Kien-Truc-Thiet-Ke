package B5;

public class MainB5 {
    public static void main(String[] args) {
        IComponent GiaoDien1 = new Layout("Giao DIen");
        Component ThanhPhan1 = new Component("Button");
        Component ThanhPhan2 = new Component("text");

        GiaoDien1.add(ThanhPhan1);
        GiaoDien1.add(ThanhPhan2);
        GiaoDien1.remove(ThanhPhan1);
        System.out.println(GiaoDien1.Show());





    }

}
