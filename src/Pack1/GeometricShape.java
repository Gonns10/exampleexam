package Pack1;

public abstract class GeometricShape {
    protected String fillColor;
    protected String colorContour;

    protected GeometricShape(String fillColor) {
        this.fillColor = fillColor;
    }
    protected GeometricShape(){};
    protected GeometricShape(String fillColor, String colorContour) {
        this(fillColor);
        this.colorContour = colorContour;
    }
    protected abstract double calculatePerimeter();
    protected abstract double calculateArea();

}
