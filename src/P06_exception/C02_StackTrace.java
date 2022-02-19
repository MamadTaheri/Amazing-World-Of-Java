package P06_exception;

public class C02_StackTrace {
    public static void main(String[] args) {
        try {
            f();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    private static void f(){
        g();
    }
    private static void g() {
        throw new NullPointerException();
    }
}
