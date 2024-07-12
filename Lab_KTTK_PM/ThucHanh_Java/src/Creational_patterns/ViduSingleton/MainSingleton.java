package Creational_patterns.ViduSingleton;

public class MainSingleton {
    public static void main(String[] args) {
        MySingleton s1 = MySingleton.getInstance();
        MySingleton s2 = MySingleton.getInstance();
        s1.InCount();//1
        s1.InCount();//2
        s2.InCount();//3
        s1.InCount();//4
    }
}
