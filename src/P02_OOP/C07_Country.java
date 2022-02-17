package P02_OOP;

public class C07_Country {

    public String name;
    public int population;

    public C07_Country() {
        name = "Iran";
    }

    public C07_Country(int number) {
        this();
        this.population = number;
    }

    public C07_Country(String n, int number) {
        this(number);
        name = n;
    }

    protected void finalize(){
        System.out.println("Object Destructed...");
    }

    public static void main(String[] args) {
        f();
        System.gc();
    }
    public static void f(){
        C07_Country c = new C07_Country(2);
        System.out.println(c.population);
    }
}
