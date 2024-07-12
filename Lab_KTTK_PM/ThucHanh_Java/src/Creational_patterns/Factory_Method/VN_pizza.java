package Creational_patterns.Factory_Method;

public class VN_pizza extends Pizza {
    @Override
    void prepare() {
        builder.append("Cá , vàng, phô mai và niềm tin");
    }

    @Override
    void bake() {
        builder.append("\n")
                .append("Hấp ở nhiệt độ 2000 độ");
    }

    @Override
    void cut() {
        builder.append("\n")
                .append("Bánh dày nên cần một hàm răng chắc khỏe");
    }

    @Override
    void box() {
    builder.append("\n").append("đóng bằng hộp sắt");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
