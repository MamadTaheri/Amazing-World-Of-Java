package P02_OOP;

public class C03_Player {
    public String name;
    public int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void shoot(){
        System.out.println("Shooooooooooot");
    }
    public void run(){
        System.out.println("run!!!!!!!!!!!!!!!!!!");
    }

    public static void main(String[] args) {
        C03_Player p1 = new C03_Player();
        p1.setName("mamad taheri");
        p1.setAge(32);
        p1.shoot();
        p1.run();

        C03_Player p2 = new C03_Player();
        p2.shoot();
    }
}
