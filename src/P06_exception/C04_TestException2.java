package P06_exception;

public class C04_TestException2 {
    public static void main(String[] args) throws Exception {
        f();
        g(5);
        g(-4);
        System.out.println("End");
    }

    private static void f(){
        System.out.println("f()");
        int a = 1 /0;
        System.out.println("okkk");
    }

    private static void g(int x) throws Exception {
        if (x<0)
            throw new Exception("Negative Number");
    }


}
