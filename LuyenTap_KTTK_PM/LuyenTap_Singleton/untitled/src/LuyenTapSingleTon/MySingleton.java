package LuyenTapSingleTon;

public class MySingleton {
    //1. Khai báo 1 biến sẽ là Singleton
    private static MySingleton instance;
    int count=0;
    // phương thức khởi tạo phải là privite hoặc là protected

    private MySingleton() {
    }
    public static MySingleton getInstance()
    {
        if (instance == null)
        {
            instance = new MySingleton();
        }
        return instance;
    }
    public void InCount()
    {
        System.out.println(++count);
    }
}
