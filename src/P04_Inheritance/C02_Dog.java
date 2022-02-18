package P04_Inheritance;

public class C02_Dog extends C01_Animal {
    private double speed;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public void setAge(int age){
        System.out.println("Child setAge");
    }
}
