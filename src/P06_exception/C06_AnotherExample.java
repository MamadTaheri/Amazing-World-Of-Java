package P06_exception;

public class C06_AnotherExample {
    public static void main(String[] args) {
      try {
          int den = Integer.parseInt(args[0]);
          System.out.println(3/den);
          System.out.println("No Exception");
      } catch (ArithmeticException e1) {
          System.out.println("division by zero");
      } catch (ArrayIndexOutOfBoundsException e2){
          System.out.println("Missing argument");
      }
        System.out.println("end");
    }
}
