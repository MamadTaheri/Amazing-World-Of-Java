package P02_OOP;

public class C10_Pride {
    int color;

    public int getColor() {
        return color;
    }

    public C10_Pride(int color) {
        this.color = color;
    }
    public void start(){};

    private static int length;

    public static void main(String[] args) {
        C10_Pride.length = 10;
        Peykan.setLength(10);
    }

    static class Peykan{
        private static int length;
        private int price;

        public static int getLength() {
            return length;
        }

        public int getPrice() {
            return price;
        }

        public static void setLength(int length) {
            Peykan.length = length;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }
}
