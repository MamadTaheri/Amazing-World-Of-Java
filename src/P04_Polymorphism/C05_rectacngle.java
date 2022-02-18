package P04_Polymorphism;

public class C05_rectacngle extends C03_Shape {
    private double length, width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return (length + width) * 2;
    }

    @Override
    public double getPerimeter() {
        return length * width;
    }
}
