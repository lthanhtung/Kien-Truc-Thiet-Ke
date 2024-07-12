package Decorator_pattern.LuyenTap;

public class main {
    public static void main(String[] args) {
        PC pc = new ConcreatePC("pc1","1T","Intel i5","512GB","ISung",
                1000,500,200,250);
        System.out.println(pc.build());
        //-------------------------------------------
        pc = new Pcdecorator(pc);
        pc = new UpdateRAM(pc, "2T",100000);
        //------------------------------
        System.out.println("Lần 2");
        System.out.println(pc.build());
    }
}
