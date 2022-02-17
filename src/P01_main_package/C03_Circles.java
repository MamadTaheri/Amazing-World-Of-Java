package P01_main_package;

public class C03_Circles {
    public static void main(String[] args) {
        int r =0;
        double c = 0;
        do{
            r++;
            c = circleRadius(r);
            if(c<100) {
                System.out.println(r);
            }
        } while (c<100);

        System.out.println("***********************");
        for(int a = 1; a <= 10 ; a++) {
            System.out.println(a + " -> " + circleRadius(a));
        }
    }
    static double circleRadius(int num){
        return 3.14 * 2 * num;
    }
}
