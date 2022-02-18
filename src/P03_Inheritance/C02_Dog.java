package P03_Inheritance;

public class C02_Dog extends C01_Animal {
    private double speed;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public void f(){
        System.out.println(" Dog f()");
        super.f();
    }

    public void setAge(int age){
        System.out.println("Child setAge");
    }

    public static void main(String[] args) {
        C02_Dog dog = new C02_Dog();
        dog.f();
    }
}
