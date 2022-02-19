package P06_exception;

import java.io.IOException;
import java.util.Scanner;

class SuperClass{
    public void f() throws IOException{

    }
}

class SubClass extends SuperClass{
    @Override
    public void f() throws IOException {

    }
}

public class C09_TestException4 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)){
            String sss = s.nextLine();
        }
    }
}
