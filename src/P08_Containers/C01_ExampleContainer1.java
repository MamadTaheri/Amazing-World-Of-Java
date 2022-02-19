package P08_Containers;

import java.util.ArrayList;

public class C01_ExampleContainer1 {
    public static void main(String[] args) {
        ArrayList<String> stringArray = new ArrayList<String>();
//        System.out.println(stringArray);
        stringArray.add("Mamad");
        stringArray.add("Ali");
        stringArray.add("Zahra");
        System.out.println(stringArray);
        stringArray.clear();
//        stringArray.remove(0);
//        System.out.println(stringArray);
//        System.out.println(stringArray.get(1));
//        System.out.println(stringArray.size());
//        System.out.println(stringArray.isEmpty());
//        System.out.println(stringArray.contains("Ali"));
        System.out.println(stringArray.indexOf("Ali"));

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(14);
        numbers.add(203);
        numbers.add(8);
        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println(numbers.contains(5));
        System.out.println(numbers.get(1));

    }
}
