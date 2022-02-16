package main_package;

public class C02_PrimeNumber {
    public static void main(String[] args) {
        for (int num=0; num<20; num++){
            if(isPrime(num)){
                System.out.println(num);
            }
        }
    }
    static boolean isPrime(int number){
        if(number<2) return false;
        for (int i=2; i<number; i++ ){
            if( number%i == 0) return false;
        }
        return true;
    }
}
