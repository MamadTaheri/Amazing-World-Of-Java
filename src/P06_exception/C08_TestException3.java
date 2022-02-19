package P06_exception;

import java.io.IOException;

class MyException extends Exception {
    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }
}

public class C08_TestException3 {
    public static void main(String[] args) {
        try {
            f(5);
            f(0);
            f(-3);
        } catch (MyException e){
            System.out.println("MyException");
        } catch (IOException e){
            System.out.println("IOException");
        }
    }
    static void f(int a) throws MyException, IOException{
        if (a==0)
            throw new MyException("Zero Number");
        if (a<0)
            throw new IOException("Negative Number");
        if (a>0)
            throw new IOException("Positive Number");
    }
}
