package P04_Inheritance;

public class C01_Animal {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        C01_Animal animal = new C01_Animal() ;
        animal.setAge(2);
        animal.setName("X");
    }
}
