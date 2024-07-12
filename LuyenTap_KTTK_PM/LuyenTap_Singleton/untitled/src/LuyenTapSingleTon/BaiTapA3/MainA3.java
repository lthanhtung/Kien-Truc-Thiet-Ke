package LuyenTapSingleTon.BaiTapA3;


public class MainA3 {
    public static void main(String[] args) {
        ShapeFactory factory1 = new ShapeFactory() {
            @Override
            Shape createShape(ShapeType shapeType) {
                if (shapeType == ShapeType.Rectangle) {
                    return new Rectangle("3","4","2");
                }
                if (shapeType == ShapeType.Triangle)
                {
                    return new Triangle("4","2","7");
                }
                return null;
            }
        };


    }
}
