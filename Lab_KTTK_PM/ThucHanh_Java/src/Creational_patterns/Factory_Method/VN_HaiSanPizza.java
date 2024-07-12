package Creational_patterns.Factory_Method;

public class VN_HaiSanPizza extends Pizza {
    @Override
    void prepare() {
        builder.append("Bột gạo và 4 con cá cơm");
    }

    @Override
    void bake() {
        builder.append("\n")
                .append("Nướng nướng trên lò than");
    }

    @Override
    void cut() {
        builder.append("\n").append("Cắt bằng Dao");
    }

    @Override
    void box() {
        builder.append("Đóng hộp ở Uraina");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
