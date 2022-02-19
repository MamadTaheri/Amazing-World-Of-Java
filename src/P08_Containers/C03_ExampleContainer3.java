package P08_Containers;

import java.util.ArrayList;

public class C03_ExampleContainer3 {
    public static void main(String[] args) {
        String[] strings = {"ali", "mamad"};
        ArrayList<String> list = new ArrayList<String>();
        for (String str: strings)
            list.add(str);

        String[] array = new String[list.size()];
        for (int i=0; i < array.length; i++)
            array[i] = list.get(i);
    }
}
