package P02_OOP;

public class C02_USING_RECTANGLE {
    public static void main(String[] args) {

        C01_Rectangle rect = new C01_Rectangle();
        rect.setWidth(2);
        rect.setLength(7);
        System.out.println(rect.calculateArea());
        System.out.println(rect.calculatePerimeter());

    }
}
