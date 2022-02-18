package P02_OOP;

public class C09_Access {
    private String name;

    public C09_Access(String n) {
        this.name = n;
    }

    public void check(C09_Access access){
        access.name = name;
    }

    public static void main(String[] args) {
        C09_Access a = new C09_Access("Ali");
        C09_Access b = new C09_Access("taghi");
        a.check(b);
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
