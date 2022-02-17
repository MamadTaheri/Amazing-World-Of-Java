package main_package;

public class C05_Cast_Overflow {
    public static void main(String[] args) {
//        int intVal = 2;
//        long longVal = 12L;
//        longVal = intVal;
//        intVal = (int) longVal;
//        System.out.println(longVal);
//        System.out.println(intVal);

//        int i;
//        float f;
//        i = 123456789;
//        f = i;
//        System.out.println(f);
//        i = (int) f;
//        System.out.println(f);

//        for (float f = 10f; f != 0; f -= 0.1){
//            System.out.println(f);
//        }
//        for (float f = 10f; f > 0; f -= 0.1){
//            System.out.println(f);
//        }

        long l = 123456789_123456789L;
        int i = (int) l;
        System.out.println(i);

        double d = 123456789_123456789D;
        int j = (int) d;
        System.out.println(j);




    }
}
