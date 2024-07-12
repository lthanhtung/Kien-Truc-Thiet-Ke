package B2;

public class MainB2 {
    public static void main(String[] args) {
        Tokenize token = new TachTu("Cố gắn học để còn được nghỉ hè mà ,muốn đi chơi với bạn bè và ngủ ngày ?");
        System.out.println(token.tokenize());
        token = new TachTuTheoDau(token);
        System.out.println(token.tokenize());
        token = new TachTuTheoTuDung(token);
        System.out.println(token.tokenize());
    }
}
