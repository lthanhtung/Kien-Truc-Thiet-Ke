package LuyenTapSingleTon.BaiTapA3;

public abstract class Shape {
    public static Shape instance;

    private String brush;
    private String paper;
    private String frame;

    public Shape(String brush, String paper, String frame) {
        this.brush = brush;
        this.paper = paper;
        this.frame = frame;
    }
    public String draw()
    {
        String Draw = brush + "\n" + paper + "\n" +frame;
        return Draw;
    }



}
