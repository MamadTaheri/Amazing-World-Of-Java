package P05_interface;

public class C05_InnerAndOuterClass {
    private int value = 2;

    class Inner {
        public void innerMethod() {
            C05_InnerAndOuterClass.this.value = 6;
        }
    }

    public void outerMethod(){
        Inner inner = new Inner();
        inner.innerMethod();
    }

    public static void main(String[] args) {
        C05_InnerAndOuterClass outer = new C05_InnerAndOuterClass();
        System.out.println(outer.value);
        outer.outerMethod();
        System.out.println(outer.value);
    }
}
