package P02_OOP;

public class C05_Stack_VS_Heap {
    public static void swapNames(C03_Player p1, C03_Player p2){
        String tmp = p1.name; // HEAP
        p1.name = p2.name;    // HEAP
        p2.name = tmp;        // HEAP
        int number = 5;       // STACK

    }
    public static int fff(int i){
        return fff(i + 1);
    }

    public static void main(String[] args) {
        fff(5); // StackOverflowError
    }
}
