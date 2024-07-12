package behavioral_pattern.Observer_pattern.CA4;

public class Main {
    public static void main(String[] args) {
        TinTuc a = new TinTuc("thu 2",2);
        TinTuc b = new TinTuc("thu 4",4);
        Topic topic = new Topic();
        ThanhVienA thanhVienA = new ThanhVienA(topic);
        topic.ThemMoi(a);
        topic.ThemMoi(b);
    }
}
