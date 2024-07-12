package behavioral_pattern.Observer_pattern.vidu;

public class MainTigia {
    public static void main(String[] args) {
        TiGia t = new TiGia();
        NhaDauTuA a = new NhaDauTuA(t);
        NhaDauTuB b = new NhaDauTuB(t);
        a.register();
        b.register();
        t.notify(5);

        a.unregister();
        System.out.println("lan 2");

        t.notify(-5);
    }
}
