package B3;

public class Main {
    public static void main(String[] args) {
        widget a = new WidgetCreate("Thành Phần 1");
        System.out.println(a.show());
        System.out.println("-----------------------------");
        a = new Icon(a,"Icon 1");
        a = new Icon(a,"Icon 1");
        a = new Icon(a,"Icon 1");
        System.out.println(a.show());
    }
}
