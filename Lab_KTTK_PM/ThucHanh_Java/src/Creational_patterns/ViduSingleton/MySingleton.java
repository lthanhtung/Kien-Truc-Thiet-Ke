package Creational_patterns.ViduSingleton;

public class MySingleton {
    //1. Khai báo biến sẽ là 1 Singleton
    private static MySingleton instance;
    int count = 0;
    //2. phương thức khởi tạo phải là private hoặc protected
    private MySingleton(){

    }
    public static MySingleton getInstance(){
        if (instance == null)
        {
            instance = new MySingleton();
        }
        return instance;
    }
    public  void InCount(){
        System.out.println(++count);
    }
}
