package P02_OOP;

public class C01_Rectangle {

    private int width, length;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int calculateArea(){
        return width * length;
    }

    public int calculatePerimeter(){
        return (width + length) * 2;
    }
}
