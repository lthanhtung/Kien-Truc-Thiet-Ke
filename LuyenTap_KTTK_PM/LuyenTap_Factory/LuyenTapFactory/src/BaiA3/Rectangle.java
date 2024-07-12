package BaiA3;

public class Rectangle extends Hinh{

    String brush;
    String paper;
    String frame;

    @Override
    String draw() {
        brush ="fsfasd";
        paper ="fsafasd";
        frame ="fasdfdsa";
        builder.append(brush).append("\n").append(paper).append("\n").append(frame);
        return builder.toString();
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
