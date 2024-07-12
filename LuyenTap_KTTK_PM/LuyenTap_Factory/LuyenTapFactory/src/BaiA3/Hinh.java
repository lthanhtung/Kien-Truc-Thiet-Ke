package BaiA3;

public abstract class Hinh {
    StringBuilder builder = new StringBuilder();
    private String brush;
    private  String paper;
    private String frame;

    abstract String draw();

    @Override
    public String toString() {
        return builder.toString();
    }
}
