package behavioral_pattern.Observer_pattern.CA5;

public class main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoang t1 = new TaiKhoang("Đạt",10000,atm);
        TaiKhoang t2 = new TaiKhoang("Lanh",250,atm);
        t1.duaThevaoATM();
        System.out.println("Lần 1");
        atm.rutTien(50000);
        System.out.println("Lần 2");
        atm.rutTien(50000);
        t1.rutthe();
        System.out.println("Lần 3");
        atm.rutTien(1000);
        System.out.println("lần 4");


    }
}
