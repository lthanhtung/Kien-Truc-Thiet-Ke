package Decorator_pattern.Vidu;

public class Main {
    public static void main(String[] args) {
        Beverage b = new HouseBlend("cà phê số 1");
        b = new Milk("Sữa cô gái Hà Lan",b);
        System.out.println(b.getDescription());
        System.out.println(b.Cost());
        b= new Milk("Sữa ông thọ",b);
        System.out.println(b.getDescription());
        System.out.println(b.Cost());

        Beverage c = new HouseBlend("Coffee stabuck");
        c = new Mocha("MoCha nguyên chất",c);
        System.out.println(c.getDescription());
        System.out.println(c.Cost());

        c = new Mocha("MoCha Trung Quốc",c);
        System.out.println(c.getDescription());
        System.out.println(c.Cost());


    }
}
