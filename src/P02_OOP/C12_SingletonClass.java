package P02_OOP;

public class C12_SingletonClass {
    private static C12_SingletonClass instance = new C12_SingletonClass();

    private C12_SingletonClass(){};

    public static C12_SingletonClass getInstance(){
        return instance;
    }
}
