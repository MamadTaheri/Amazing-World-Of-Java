package P02_OOP;

public class C06_Circle {
    private double radius;

    public C06_Circle() {
        this.radius = 11;
    }

    public C06_Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * 3.14;
    }

    public static void main(String[] args) {
        C06_Circle circle1 = new C06_Circle(2);
        System.out.println(circle1.getArea());
        C06_Circle circle2 = new C06_Circle();
        System.out.println(circle2.getArea());
    }
}
