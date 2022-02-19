package P06_exception;

import java.io.IOException;
import java.util.Scanner;

public class C05ArithmeticException {
    private void program() {
        try{
            int first = readInt();
            int second = readInt();
            int div = division(first, second);
            System.out.println("div : " + div);
        } catch (IOException e){
            System.out.println("IOException: ");
            System.out.println(e.getMessage());
        } catch (ArithmeticException e){
            System.out.println("ArithmeticException: ");
            System.out.println(e.getMessage());
        }
    }
    private int readInt() throws IOException {
        String str = new Scanner(System.in).next();
        if(str.matches("[\\d]+"))
            return Integer.parseInt(str);
        throw new IOException("Bad input");
    }
    private static int division(int first, int second) throws ArithmeticException {
        if (second == 0)
            throw new ArithmeticException("OOPs! Makhraj Sefr!!!!");

        return first/second;
    }
}
