package Decorator_pattern.B2;

public class Main {
    public static void main(String[] args) {
        Tokennize t = new TachTU("Sắp được nghỉ lễ 4 ngày, thích quá, đi chơi thôi!");
        System.out.println(t.tokenzize());

        t = new RemoveStopWord(t);
        System.out.println(t.tokenzize());

        t= new RemovePunctuation(t);
        System.out.println(t.tokenzize());
    }
}
