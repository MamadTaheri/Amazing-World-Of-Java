package P04_Polymorphism;

public abstract class C01_Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void talk();
}
