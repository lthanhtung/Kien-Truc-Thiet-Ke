package Structural_pattern.Composite_pattern.Bai_B4;

public class Main_B4 {
    public static void main(String[] args) {
            HocMai NamHoc = new HocMai("Nam 1");
            HocMai Kyhoc1 = new HocMai("Ky 1");
            HocMai Kyhoc2 = new HocMai("Ky 2");
            HocMai NamHoc2 = new HocMai("Nam Cuoi");
            HocMai Kyhoc3 = new HocMai("Ky 3");

            Kyhoc1.add(new MonHoc("C#",3,1400000));
        Kyhoc1.add(new MonHoc("C++",3,1400000));

        Kyhoc2.add(new MonHoc("C#",3,1400000));
        Kyhoc2.add(new MonHoc("C++",3,1400000));

        Kyhoc3.add(new MonHoc("C#",3,1400000));
        Kyhoc3.add(new MonHoc("C--",3,1400000));


    }
}
