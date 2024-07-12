package LuyenTapSingleTon;

public class MainMySingleton {
    public static void main(String[] args) {
        MySingleton mySingleton = MySingleton.getInstance();
        mySingleton.InCount();
        mySingleton.InCount();
        mySingleton.InCount();
        mySingleton.InCount();

    }
}
